import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement staticDropDown = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
	    Select select = new Select(staticDropDown);
        select.selectByValue("USD");
        WebElement passengers=driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
        passengers.click();
        
        for(int i=0;i<4;i++)
        {
        	driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
        }
        driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
        
        
        //select to and fro cities
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        
	} 
	
	
	


}
