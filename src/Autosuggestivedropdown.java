import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestivedropdown {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("IND");
		
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
        for(WebElement option:options)
        {
        	if(option.getText().equalsIgnoreCase("INDIA"))
        	{
        		option.click();
        		break;
        	}
        }
		
		
	}

}
