import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableGrid2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		List<WebElement> rowCount= driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
        System.out.println("No of rows in the table are "+rowCount.size());
        List<WebElement> colCount=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th"));
        System.out.println("No of columns in the table are "+colCount.size());
        System.out.println(driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[3]")).getText());
        
	}

}
