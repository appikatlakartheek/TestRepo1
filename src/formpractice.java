import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class formpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice");
		driver.findElement(By.xpath("//div[@class='form-group'] //input[@name='name']")).sendKeys("Kartheek Appikatla");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("appikatla.kartheek@gmail.com");
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("India@123");
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
		WebElement staticDropDown = driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		Select select = new Select(staticDropDown);
		select.selectByVisibleText("Female");
		WebElement radio = driver.findElement(By.xpath("//input[@id='inlineRadio3']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].removeAttribute('disabled','disabled')", radio);
		driver.findElement(By.xpath("//input[@id='inlineRadio3']")).click();
		WebElement bday = driver.findElement(By.xpath("//input[@name='bday']"));
		bday.sendKeys("07-04-1989");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		String successMessage = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"))
				.getText();
		System.out.println(successMessage);
		// Assert.assertEquals(successMessage, "Success! The Form has been submitted
		// successfully!.");

	}

}
