import java.time.Duration;
import java.util.Set;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Windows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//body/a")).click();
		Set<String> windows1 = driver.getWindowHandles();
		Iterator<String> it= windows1.iterator();
		String parentID=it.next();
		String childID=it.next();
		driver.switchTo().window(childID);
		
		
		
		

	}

}
