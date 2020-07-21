package pages;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import utils.BrowserFactory1;

public class BaseClass {
	
	public WebDriver driver;
	File folder;
	
	//@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup() {
		//87978-76767-84765-90876 random UUID kao ovo	
		/*folder = new File(UUID.randomUUID().toString());
		folder.mkdir();*/
				
				//firefox
				//FirefoxProfile profile = new FirefoxProfile();
				//profile.setPreference("browser.download.dir", folder.getAbsolutePath());
				//profile.setPreference("browser.download.folderList", 2);
				//profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "image/jpeg, application/pdf, application/octet-stream");
				//profile.setPreference("pdfjs.disabled", true);
				//driver = new FirefoxDriver(profile);
				
				//chrome
				/*String projectPath = System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
				ChromeOptions options = new ChromeOptions();
				
				Map<String, Object> prefs = new HashMap<String, Object>();
				prefs.put("profile.default_content_settings.popups", 0);
				prefs.put("download.default_directory", folder.getAbsolutePath());
				
				options.setExperimentalOption("prefs", prefs);
				DesiredCapabilities cap = DesiredCapabilities.chrome();
				cap.setCapability(ChromeOptions.CAPABILITY, options);
				
				driver = new ChromeDriver(cap);*/
		
		driver = BrowserFactory1.startApp(driver, "Chrome", "https://unsplash.com");
		
		
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
