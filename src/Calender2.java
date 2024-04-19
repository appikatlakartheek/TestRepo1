import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calender2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//button[@class='react-date-picker__calendar-button react-date-picker__button']")).click();
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		for(int i=0;i<3;i++)
		{
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__next-button']")).click();
		}
		
		driver.findElement(By.xpath("//button[@class='react-calendar__tile react-calendar__year-view__months__month'][8]")).click();
		driver.findElement(By.xpath("//button/abbr[@aria-label='August 19, 2027']")).click();
		String date=driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']")).getText();
		System.out.println(date);
		Assert.assertEquals(date,"04/10/2024");

	}

}
