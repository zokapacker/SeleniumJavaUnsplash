package utils;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.hamcrest.core.IsNot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage1;
import pages.SinglePhotoPage;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertNotNull;

public class DownloadFileConcept {
	
	WebDriver driver;
	File folder;
	

	@Test
	public void Test1() throws Exception {
		folder = new File(UUID.randomUUID().toString());
		folder.mkdir();
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("download.default_directory", folder.getAbsolutePath());
		
		options.setExperimentalOption("prefs", prefs);
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(options);

		LoginPage1 loginPage1 = PageFactory.initElements(driver, LoginPage1.class);
		loginPage1.loginToUnsplash(Constants.email, Constants.password);
		
		SinglePhotoPage singlePhotoPage = PageFactory.initElements(driver, SinglePhotoPage.class);
		singlePhotoPage.clickRandomPhoto();
		singlePhotoPage.clickDownloadPhotoButton();
		
		Thread.sleep(2000);
		File listOfFiles[] = folder.listFiles();
		Assert.assertTrue(listOfFiles.length>0);
		System.out.println(listOfFiles.length);
		
		/*for(File file : listOfFiles) {
			Assert.assertTrue(file.length()>0);
			System.out.println(file.length());
		}*/
		driver.quit();
		for(File file : folder.listFiles()) {
			file.delete();
		}
		folder.delete();
		
	}
	

}
