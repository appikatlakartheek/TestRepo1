import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://qaclickacademy.com/practice.php");
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		WebElement footerdriver= driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement firstFooter= driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"));
		System.out.println(firstFooter.findElements(By.tagName("a")).size());
		
		//Open the links in seperate tabs
		for(int i=0;i<firstFooter.findElements(By.tagName("a")).size();i++)
		{
		 String clickOnLinkTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
		 firstFooter.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
		
		}
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		

	}

}
