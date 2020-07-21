package test;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.EditProfilePage;
import pages.LoginPage1;
import utils.Constants;

public class EditProfileTests extends BaseClass {
	@Test
	public void tc01emailSettingsLink() throws Exception {
		LoginPage1 loginPage1 = PageFactory.initElements(driver, LoginPage1.class);
		loginPage1.loginToUnsplash(Constants.email, Constants.password);
		
		EditProfilePage editProfilePage = PageFactory.initElements(driver, EditProfilePage.class);
		editProfilePage.clickEditButton();
		editProfilePage.clickEmailSettings();
		Assert.assertEquals(driver.getCurrentUrl(), "https://unsplash.com/account/email_settings");
	}
	@Test
	public void tc02changePasswordLink() {
		EditProfilePage editProfilePage = PageFactory.initElements(driver, EditProfilePage.class);
		editProfilePage.clickChangePassword();
		Assert.assertEquals(driver.getCurrentUrl(), "https://unsplash.com/account/password");
	}
	@Test
	public void tc03connectAccountsLink() throws Exception {
		EditProfilePage editProfilePage = PageFactory.initElements(driver, EditProfilePage.class);
		editProfilePage.clickConnectAccounts();
		Assert.assertEquals(driver.getCurrentUrl(), "https://unsplash.com/account/connect");
	}
	@Test
	public void tc04applicationsLink() {
		EditProfilePage editProfilePage = PageFactory.initElements(driver, EditProfilePage.class);
		editProfilePage.clickApplications();
		Assert.assertEquals(driver.getCurrentUrl(), "https://unsplash.com/oauth/authorized_applications");
	}
	@Test
	public void tc05closeAccountLink() {
		EditProfilePage editProfilePage = PageFactory.initElements(driver, EditProfilePage.class);
		editProfilePage.clickCloseAccount();
		Assert.assertEquals(driver.getCurrentUrl(), "https://unsplash.com/account/close");
		editProfilePage.clickEditProfileButton();
	}
	@Test
	public void tc06changeProfileImage() throws Exception {
		EditProfilePage editProfilePage = PageFactory.initElements(driver, EditProfilePage.class);
		editProfilePage.uploadImage();
		Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", editProfilePage.profileImage);
	        if (!ImagePresent)
	        {
	             System.out.println("Image not displayed.");
	        }
	        else
	        {
	            System.out.println("Image displayed.");
	        }
	        //proveriti jos 
	}
	@Test
	public void tc07editFirstName() {
		EditProfilePage editProfilePage = PageFactory.initElements(driver, EditProfilePage.class);
		editProfilePage.editProfileInfo("Pera", "", "", "");
		Assert.assertEquals(editProfilePage.inputFirstName.getAttribute("value"), "Pera");
	}
	@Test
	public void tc08editFirstNameBlank() {
		EditProfilePage editProfilePage = PageFactory.initElements(driver, EditProfilePage.class);
		editProfilePage.editProfileInfo("", "", "", "");
		Assert.assertEquals(editProfilePage.errorFirstName.getText(), "First name can't be blank");
	}
	@Test
	public void tc09editLastName() {
		EditProfilePage editProfilePage = PageFactory.initElements(driver, EditProfilePage.class);
		editProfilePage.editProfileInfo("Petar", "Peric", "", "");
		Assert.assertEquals(editProfilePage.inputLastName.getAttribute("value"), "Peric");
	}
	@Test
	public void tc10editLocation() {
		EditProfilePage editProfilePage = PageFactory.initElements(driver, EditProfilePage.class);
		editProfilePage.editProfileInfo("Zoran", "", "Google Maps", "");
		Assert.assertEquals(editProfilePage.inputLocation.getAttribute("value"), "Google Maps");
	}
	@Test
	public void tc11editBio() {
		EditProfilePage editProfilePage = PageFactory.initElements(driver, EditProfilePage.class);
		editProfilePage.editProfileInfo("Zoran", "Todorcevic", "Novi Sad", "QA");
		Assert.assertEquals(editProfilePage.inputBio.getAttribute("value"), "QA");
	}
	
	
}	