import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();

		
//		String Text=driver.findElement(By.xpath("//p[@class='text-center text-white']")).getText();
//		String[] split1=Text.split("and");
//		String[] split2=split1[0].split("is");
//		String userName=split2[1].trim();
//		String[] split3=split1[1].split("is");
//		String passWord=split3[1].trim();
//		System.out.println(passWord);
		
		
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']/following-sibling::span")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
	
		driver.findElement(By.id("okayBtn")).click();
		WebElement staticDropDown=driver.findElement(By.xpath("//select[@class='form-control']"));
		Select select = new Select(staticDropDown);
		select.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		WebDriverWait wait1= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='navbar-brand']")));
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300);");
		String [] phones= getProducts();
		
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='card h-100']"));
		List<String> phonesList = Arrays.asList(phones);
		for(int i=0;i<products.size();i++)
		{
			String productName= driver.findElements(By.xpath("//h4/a")).get(i).getText();
			
			
			if(phonesList.contains(productName))
			{
				
				driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
				
			}
		}

		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		
		
		
		List<WebElement> selectedProducts=driver.findElements(By.xpath("//h4/a"));
		for (int j=0;j<selectedProducts.size();j++)
		{
			String selectedProductName= selectedProducts.get(j).getText();
			if(phonesList.contains(selectedProductName))
			{
				Assert.assertTrue(true,"Selected products are displayed");
			}
		}
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("IND");
		WebElement options= driver.findElement(By.xpath("//div[@class='suggestions']"));
		WebDriverWait wait2= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOf(options));
		List<WebElement> countryOptions = driver.findElements(By.xpath("//div[@class='suggestions']/ul/li/a"));
		for(WebElement countryOption:countryOptions)
		{
			if (countryOption.getText().equalsIgnoreCase("India"))
			{
				countryOption.click();
				break;
			}
		}
		//driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		WebDriverWait wait3= new WebDriverWait(driver,Duration.ofSeconds(20));
				
		wait3.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='checkbox2']//label[@for='checkbox2']"))));
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();

		
	}
	

	
	public static String[] getProducts()

	{
	 String[] phones = {"iphone X","Nokia Edge"};
	 return phones;
		
		
	}
	
	
}

