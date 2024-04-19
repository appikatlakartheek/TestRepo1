import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Vegetables1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		List<WebElement> vegetables= driver.findElements(By.xpath("//div[@class='product']"));
		
		
		for(WebElement vegetable : vegetables)
		{
			
			
			if(vegetable.getText().contains("Beetroot"))
			
			{
				
               System.out.println(vegetable.getText());
               vegetable.findElement(By.className("product-action")).click();
               
               break;
               
               
			}
			
			
			  	
			}
		}



}
