import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		SoftAssert soft = new SoftAssert();
		WebElement firstCheckBox=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		firstCheckBox.click();
	   Assert.assertTrue(firstCheckBox.isSelected());
	   firstCheckBox.click();
	   soft.assertTrue(firstCheckBox.isSelected());
	   List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
	   System.out.println(checkBoxes.size());
	   Assert.assertEquals(checkBoxes.size(), 3);
	   soft.assertAll();
		
	}

}
