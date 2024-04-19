import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
    @Test
	public  void assignmentTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		String selectedText= driver.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println(selectedText);
		driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).sendKeys(selectedText);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(selectedText);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		String text1=text.split(",")[0];
		String finalText= text1.split(" ")[1];
		System.out.println("Text from popup is "+finalText);
		alert.accept();
		Assert.assertEquals(finalText, selectedText,"Test is passed");
		

	}

}
