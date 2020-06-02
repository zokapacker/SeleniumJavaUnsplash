package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage1 {
	
	WebDriver driver;
	
	public LoginPage1(WebDriver driver) {
		
		this.driver=driver;
		
	}
	@FindBy(xpath="//*[@id=\"app\"]/div/header/nav/div[3]/div/div[2]/a[1]") WebElement login;
	@FindBy(name="user[email]") WebElement email;
	@FindBy(name="user[password]") WebElement password;
	@FindBy(name="commit") WebElement loginButton;
	@FindBy(xpath="//*[@id=\"popover-avatar-loggedin-menu-desktop\"]/div[1]/button/div/img") WebElement profileIcon;
	@FindBy(xpath="//*[@id=\"popover-avatar-loggedin-menu-desktop\"]/div[2]/div/ul[2]/li/a") WebElement logoutButton;
	
	public void loginToUnsplash(String emailField, String passwordField)
	{
		try
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		email.sendKeys(emailField);
		password.sendKeys(passwordField);
		loginButton.click();
	}
	public void logoutFromUnsplash() {
		
		profileIcon.click();
		logoutButton.click();
		
	}
	public void clickLogin() {
		login.click();
	}
	

}
