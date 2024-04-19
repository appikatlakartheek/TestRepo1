import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestivedropdown2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement AutoText=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		AutoText.sendKeys("UNI");
		driver.findElement(By.xpath("//ul[@id='ui-id-1']/li[5]/div")).click();
		
		
	

	}

}
