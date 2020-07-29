package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.LoginPage1;
import pages.MyProfilePage;
import utils.Constants;
public class MyProfileTests extends BaseClass {
	
	@Test(groups = {"func"})
	public void tc01profilePhoto() {
		LoginPage1 loginPage1 = PageFactory.initElements(driver, LoginPage1.class);
		loginPage1.loginToUnsplash(Constants.email, Constants.password);
		
		MyProfilePage myProfilePage = PageFactory.initElements(driver, MyProfilePage.class);
		myProfilePage.clickViewProfile();
		Assert.assertEquals(true, myProfilePage.profilePhoto.isDisplayed());	
	}
	@Test(groups = {"func"})
	public void tc02editProfileButton() {
		MyProfilePage myProfilePage = PageFactory.initElements(driver, MyProfilePage.class);
		myProfilePage.clickEditButton();
		Assert.assertEquals(driver.getCurrentUrl(), "https://unsplash.com/account");
		driver.navigate().back();
	}
	@Test
	public void tc03photos() {
		MyProfilePage myProfilePage = PageFactory.initElements(driver, MyProfilePage.class);
		Assert.assertEquals(true, myProfilePage.photos.isDisplayed());	
	}
	@Test(groups = {"func"})
	public void tc04likes() {
		MyProfilePage myProfilePage = PageFactory.initElements(driver, MyProfilePage.class);
		myProfilePage.clickLikes();
		Assert.assertEquals(driver.getCurrentUrl(), "https://unsplash.com/@davidnoodles/likes");	
	}
	@Test(groups = {"func"})
	public void tc05collections() {
		MyProfilePage myProfilePage = PageFactory.initElements(driver, MyProfilePage.class);
		myProfilePage.clickCollections();
		Assert.assertEquals(driver.getCurrentUrl(), "https://unsplash.com/@davidnoodles/collections");	
	}
	@Test(groups = {"func"})
	public void tc06statsAllTime() {
		MyProfilePage myProfilePage = PageFactory.initElements(driver, MyProfilePage.class);
		myProfilePage.clickStats();
		myProfilePage.clickInsightsButton();
		Assert.assertEquals(true, myProfilePage.allTime.isDisplayed());
	}
	@Test(groups = {"func"})
	public void tc07stats30Days() {
		MyProfilePage myProfilePage = PageFactory.initElements(driver, MyProfilePage.class);
		Assert.assertEquals(true, myProfilePage.last30Days.isDisplayed());
	}
	
	

}
