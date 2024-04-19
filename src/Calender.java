import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();
		WebElement monthYear= driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last'] //div[@class='ui-datepicker-title']"));

		System.out.println(monthYear.getText());
		
		

	}
}
	


//span[@class='ui-icon ui-icon-circle-triangle-e']
//span[class='ui-datepicker-month']
//button[@class='ui-datepicker-trigger']