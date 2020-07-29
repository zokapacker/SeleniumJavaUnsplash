package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.LoginPage1;
import utils.Constants;


public class LoginTests extends BaseClass{
	

	@Test(groups = {"smoke", "func"})
	public void tc01loginApp() {
		LoginPage1 loginPage1 = PageFactory.initElements(driver, LoginPage1.class);
		loginPage1.loginToUnsplash(Constants.email, Constants.password);
		Assert.assertEquals(true, loginPage1.profileIcon.isDisplayed());
		loginPage1.logoutFromUnsplash();
	}
	@Test(groups = {"func"})
	public void tc02noCredential() {
	    LoginPage1 loginPage1 = PageFactory.initElements(driver, LoginPage1.class);
	    loginPage1.loginToUnsplash("", "");
	    Assert.assertEquals(loginPage1.alertMessage.getText(), "You need to sign in or sign up before continuing.");
	}
	@Test(groups = {"func"})
	public void tc03noEmail() {
		LoginPage1 loginPage1 = PageFactory.initElements(driver, LoginPage1.class);
		loginPage1.loginToUnsplash("", Constants.password);
		Assert.assertEquals(loginPage1.alertMessage.getText(), "You need to sign in or sign up before continuing.");
	}
	@Test(groups = {"func"})
	public void tc04wrongEmail() {
		LoginPage1 loginPage1 = PageFactory.initElements(driver, LoginPage1.class);
		loginPage1.loginToUnsplash("zokapackergmail.com", Constants.password);
		Assert.assertEquals(true, loginPage1.email.getAttribute("validationMessage").contains("email address"));
	}
	
	@Test(groups = {"func"})
	public void tc05noPassword() {
		LoginPage1 loginPage1 = PageFactory.initElements(driver, LoginPage1.class);
		loginPage1.loginToUnsplash(Constants.email, "");
		Assert.assertEquals(loginPage1.alertMessage.getText(), "Invalid email or password.");
	}
	
	@Test(groups = {"func"})
	public void tc06wrongPassword() {
		LoginPage1 loginPage1 = PageFactory.initElements(driver, LoginPage1.class);
		loginPage1.loginToUnsplash(Constants.email, "abcdefh1");
		Assert.assertEquals(loginPage1.alertMessage.getText(), "Invalid email or password.");
	}
	
	@Test(groups = {"func"})
	public void tc07forgotPasswordLink() {
		LoginPage1 loginPage1 = PageFactory.initElements(driver, LoginPage1.class);
		loginPage1.clickForgotYourPassword();
		Assert.assertEquals(driver.getCurrentUrl(), "https://unsplash.com/users/password/new");
		driver.navigate().back();
	}
	
	@Test(groups = {"func"})
	public void tc08joinLink() {
		LoginPage1 loginPage1 = PageFactory.initElements(driver, LoginPage1.class);
		loginPage1.clickJoinLink();
		Assert.assertEquals(driver.getCurrentUrl(), "https://unsplash.com/join");
	}
	
}