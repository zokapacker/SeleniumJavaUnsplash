package utils;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserFactory1 {
	public static File folder;
	
	
	public static WebDriver startApp(WebDriver driver, String browserName, String appUrl)
	{    
         
		if(browserName.equals("Chrome"))
		{   
			folder = new File(UUID.randomUUID().toString());
	        folder.mkdir();
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_settings.popups", 0);
			prefs.put("download.default_directory", folder.getAbsolutePath());
				
			options.setExperimentalOption("prefs", prefs);
			
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setCapability(ChromeOptions.CAPABILITY, options);
			driver = new ChromeDriver(options);

	
		}
		else if(browserName.equals("Firefox"))
		{
			//firefox
			//FirefoxProfile profile = new FirefoxProfile();
			//profile.setPreference("browser.download.dir", folder.getAbsolutePath());
			//profile.setPreference("browser.download.folderList", 2);
			//profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "image/jpeg, application/pdf, application/octet-stream");
			//profile.setPreference("pdfjs.disabled", true);
			//driver = new FirefoxDriver(profile);
			String projectPath = System.getProperty("user.dir");
			System.out.println("projectPath : "+projectPath);
			
			System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else
		{
		System.out.println("We do not support this browser");
		}
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
		for(File file : folder.listFiles()) {
			file.delete();
		}
		folder.delete();
	}

}