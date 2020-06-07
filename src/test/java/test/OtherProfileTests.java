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
	@Test
	public void tc05followLinkLogout() {
		OtherProfilePage otherProfilePage = PageFactory.initElements(driver, OtherProfilePage.class);
		otherProfilePage.clickFollow();
		Assert.assertEquals(true, otherProfilePage.loginBox.isDisplayed());
		otherProfilePage.clickCloseButton();
	}
	@Test
	public void tc06messageLogout() {
		OtherProfilePage otherProfilePage = PageFactory.initElements(driver, OtherProfilePage.class);
		otherProfilePage.clickMessage();
		Assert.assertEquals(true, otherProfilePage.loginBox.isDisplayed());
		otherProfilePage.clickCloseButton();
	}
	@Test
	public void tc07followButton() {
		LoginPage1 loginPage1 = PageFactory.initElements(driver, LoginPage1.class); // pojednostaviti login
		loginPage1.clickLogin();
		loginPage1.loginToUnsplash("zokapacker@gmail.com", "sifra123");
		
		OtherProfilePage otherProfilePage = PageFactory.initElements(driver, OtherProfilePage.class);
		otherProfilePage.clickRandomUser();
		otherProfilePage.clickFollow();
		/*if (otherProfilePage.followButton.getText().equals("Following"))
	     System.out.println("Match found");
	    else 
	     System.out.println("Match Not found");*/
		
	    Assert.assertEquals(otherProfilePage.followButton.getText(), "Following");
	    otherProfilePage.clickFollow();
	}
	@Test
	public void tc08messageButton() {
		
		OtherProfilePage otherProfilePage = PageFactory.initElements(driver, OtherProfilePage.class);
		otherProfilePage.clickMessage();
		Assert.assertEquals(true, otherProfilePage.messageBox.isDisplayed());
		//otherProfilePage.clickCloseButton();
		 
	}
	
	
	
	
	
	

}
