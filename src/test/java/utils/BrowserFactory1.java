package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory1 {
	
	public static WebDriver startApp(WebDriver driver, String browserName, String appUrl)
	{
		if(browserName.equals("Chrome"))
		{
			String projectPath = System.getProperty("user.dir");
			
			System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}
		else if(browserName.equals("Firefox"))
		{
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
	}

}