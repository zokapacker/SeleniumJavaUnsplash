package test;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.LoginPage1;
import utils.BrowserFactory1;

public class LoginTests extends BaseClass{
	
	
	@Test
	public void tc01loginApp() {
		
		
		LoginPage1 loginPage1 = PageFactory.initElements(driver, LoginPage1.class);
		loginPage1.loginToUnsplash("zokapacker@gmail.com", "sifra123");
		
		try {
	        driver.findElement(By.xpath("//*[@id=\"popover-avatar-loggedin-menu-desktop\"]/div[1]/button/div/img"));
	    }catch(Exception e) {
	        assertTrue(true, "profileIcon is there");
	    }
		loginPage1.logoutFromUnsplash();
			
	}
	@Test
	public void tc02noCredential() {
		
	LoginPage1 loginPage1 = PageFactory.initElements(driver, LoginPage1.class);
	loginPage1.loginToUnsplash("", "");
	String actualAlert = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]")).getText();
	String expectedAlert = ("You need to sign in or sign up before continuing.");
	
	if(actualAlert.equalsIgnoreCase(expectedAlert))
    {
        System.out.println("Test passed");
    }
    else
    {
        System.out.println("Test failed");
    }
	}
	@Test
	public void tc03noEmail() {
		LoginPage1 loginPage1 = PageFactory.initElements(driver, LoginPage1.class);
		loginPage1.loginToUnsplash("", "sifra123");
		String actualAlert = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]")).getText();
		String expectedAlert = ("You need to sign in or sign up before continuing.");
		
		if(actualAlert.equalsIgnoreCase(expectedAlert))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }
		
	}
	@Test
	public void tc04noPassword() {
		LoginPage1 loginPage1 = PageFactory.initElements(driver, LoginPage1.class);
		loginPage1.loginToUnsplash("", "sifra123");
		String actualAlert = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]")).getText();
		String expectedAlert = ("Invalid email or password.");
		
		if(actualAlert.equalsIgnoreCase(expectedAlert))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }
		
	}
}