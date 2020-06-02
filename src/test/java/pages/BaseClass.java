package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import utils.BrowserFactory1;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		driver = BrowserFactory1.startApp(driver, "Chrome", "https://unsplash.com");
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div/header/nav/div[3]/div/div[2]/a[1]")).click();
	}
	
	
	@AfterClass
	public void tearDown() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		BrowserFactory1.quitBrowser(driver);
	}

}
