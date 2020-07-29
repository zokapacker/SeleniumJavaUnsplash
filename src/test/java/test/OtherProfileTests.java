package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.LoginPage1;
import pages.OtherProfilePage;
import pages.SinglePhotoPage;
import utils.Constants;

public class OtherProfileTests extends BaseClass {
	
	
	@Test
	public void tc01userPhoto() {
		OtherProfilePage otherProfilePage = PageFactory.initElements(driver, OtherProfilePage.class);
		otherProfilePage.clickRandomUser();
		Assert.assertEquals(true, otherProfilePage.userPhoto.isDisplayed());	
	}
	@Test
	public void tc02photos() {
		OtherProfilePage otherProfilePage = PageFactory.initElements(driver, OtherProfilePage.class);
		Assert.assertEquals(true, otherProfilePage.photos.isDisplayed());	
	}
	@Test
	public void tc03likes() {
		OtherProfilePage otherProfilePage = PageFactory.initElements(driver, OtherProfilePage.class);
		Assert.assertEquals(true, otherProfilePage.likes.isDisplayed());	
	}
	@Test
	public void tc04collections() {
		OtherProfilePage otherProfilePage = PageFactory.initElements(driver, OtherProfilePage.class);
		Assert.assertEquals(true, otherProfilePage.collections.isDisplayed());
	}
	@Test(groups = {"smoke", "func"})
	public void tc05followLinkLogout() {
		OtherProfilePage otherProfilePage = PageFactory.initElements(driver, OtherProfilePage.class);
		otherProfilePage.clickRandomUser();
		otherProfilePage.clickFollow();
		Assert.assertEquals(true, otherProfilePage.loginBox.isDisplayed());
		otherProfilePage.clickCloseButton();
	}
	@Test(groups = {"smoke", "func"})
	public void tc06messageLogout() {
		OtherProfilePage otherProfilePage = PageFactory.initElements(driver, OtherProfilePage.class);
		otherProfilePage.clickMessage();
		Assert.assertEquals(true, otherProfilePage.loginBox.isDisplayed());
		otherProfilePage.clickCloseButton();
	}
	@Test(groups = {"smoke", "func"})
	public void tc07followButton() throws Exception {
		LoginPage1 loginPage1 = PageFactory.initElements(driver, LoginPage1.class); // pojednostaviti login
		loginPage1.loginToUnsplash(Constants.email, Constants.password);
		
		OtherProfilePage otherProfilePage = PageFactory.initElements(driver, OtherProfilePage.class);
		otherProfilePage.clickRandomUser();
		otherProfilePage.clickFollow();
	    Assert.assertEquals(otherProfilePage.followButton.getText(), "Following");
	    otherProfilePage.clickUnfollow();
	}
	@Test(groups = {"smoke", "func"})
	public void tc08messageButton() {
		OtherProfilePage otherProfilePage = PageFactory.initElements(driver, OtherProfilePage.class);
		otherProfilePage.clickMessage();
		Assert.assertEquals(true, otherProfilePage.messageBox.isDisplayed());	 
	}

}
