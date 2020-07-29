package pages;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import utils.BrowserFactory1;

public class BaseClass {
	public WebDriver driver;
	File folder;
	public String browserName;
	
	@Parameters("browserName")
	@BeforeClass(alwaysRun = true)
	public void setup(String browserName) throws InterruptedException {
		Thread.sleep(2000);
		driver = BrowserFactory1.startApp(driver, browserName, "https://unsplash.com");
	}
	
	
	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		BrowserFactory1.quitBrowser(driver);
	}

}
