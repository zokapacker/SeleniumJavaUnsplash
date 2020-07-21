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
	@FindBy(xpath="//*[@id=\"app\"]/div/header/nav/div[3]/div/div[2]/a[1]") 
	public WebElement login;
	@FindBy(name="user[email]") 
	public WebElement email;
	@FindBy(name="user[password]") 
	public WebElement password;
	@FindBy(name="commit")
	public WebElement loginButton;
	@FindBy(xpath="//*[@id=\"popover-avatar-loggedin-menu-desktop\"]/div[1]/button/div/img")
	public WebElement profileIcon;
	@FindBy(xpath="//*[@id=\"popover-avatar-loggedin-menu-desktop\"]/div[2]/div/ul[2]/li/a")
	public WebElement logoutButton;
	@FindBy(xpath="/html/body/div[1]/div/div/div[2]")
	public WebElement alertMessage;
	@FindBy(linkText="Forgot your password?")
	public WebElement forgotYourPassword;
	@FindBy(linkText="Join")
	public WebElement joinLink;
	
	public void loginToUnsplash(String emailField, String passwordField)
	{
		driver.get("https://unsplash.com/");
		try
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		clickLogin();
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
	public void clickForgotYourPassword() {
		forgotYourPassword.click();
	}
	public void clickJoinLink() {
		joinLink.click();
	}

}
