package test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.HomePage;
import pages.LoginPage1;
import utils.Constants;

public class HomePageTests extends BaseClass{
	
	@Test
	public void tc01logoutLoginLink() {
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.login.isDisplayed());
	}
	
	@Test(groups = {"smoke","func"})
	public void tc02logoutJoinFreeLink() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.clickJoinFree();
		Assert.assertEquals(driver.getCurrentUrl(), "https://unsplash.com/join");
	}
	
	@Test(groups = {"func"})
	public void tc03logoutTopicsLink() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.clickTopics();
		Assert.assertEquals(driver.getCurrentUrl(), "https://unsplash.com/t");
		}
	
	@Test(groups = {"func"})
	public void tc04logoutExploreLink() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.clickExplore();
		Assert.assertEquals(driver.getCurrentUrl(), "https://unsplash.com/explore");
	}
	@Test(groups = {"func"})
	public void tc05logoutDropDownMenu() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.clickDropDownMenu();
		Assert.assertEquals(true, homePage.dropDownMenuWindow.isDisplayed());
	}
	@Test(groups = {"smoke", "func"})
	public void tc06logoutSubmitAphotoButton() {  //dodati test koji proverava dodavanje slike
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.clickSubmitPhoto();
		Assert.assertEquals(true, homePage.loginToSubmitPhoto.isDisplayed());
		homePage.clickCloseLogin();
	}
	@Test
	public void tc07logoutEditorialLink() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.editorial.isDisplayed()); //zato sto je to link ka home page
	}
	
	@Test(groups = {"smoke", "func"})
	public void tc08upFilter() throws Exception {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.upFilter.sendKeys(Constants.keysSunset);
		homePage.upFilter.sendKeys(Keys.RETURN);
		Assert.assertTrue(homePage.firstSearchResultTags.getText().contains(Constants.keysSunset));
		System.out.println(homePage.firstSearchResultTags.getText());
	}
	@Test(groups = {"func"})
	public void tc09upFilterNoKeys() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		driver.get(Constants.baseURL);
		homePage.upFilter.sendKeys(Constants.noKeys);
		homePage.upFilter.sendKeys(Keys.RETURN);
		Assert.assertEquals(homePage.upFilter.getAttribute("validationMessage"), "Please fill out this field.");
	}
	
	@Test(groups = {"smoke", "func"})
	public void tc10downFilter() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		driver.get(Constants.baseURL);
		homePage.downFilter.sendKeys(Constants.keysBlack);
		homePage.downFilter.sendKeys(Keys.RETURN);
		Assert.assertTrue(homePage.firstSearchResultTags.getText().contains(Constants.keysBlack));
	}
	@Test(groups = {"func"})
	public void tc11downFilterNoKeys() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		driver.get(Constants.baseURL);
		homePage.downFilter.sendKeys(Constants.noKeys);
		homePage.downFilter.sendKeys(Keys.RETURN);
		Assert.assertEquals(homePage.downFilter.getAttribute("validationMessage"), "Please fill out this field.");
	}
	@Test(groups = {"func"})
	public void tc12loginFollowingLink() {
		LoginPage1 loginPage1 = PageFactory.initElements(driver, LoginPage1.class);
		loginPage1.loginToUnsplash(Constants.email, Constants.password);
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.clickFollowing();
		Assert.assertEquals(driver.getCurrentUrl(), "https://unsplash.com/following");
		driver.navigate().back();
	}
	@Test(groups = {"func"})
	public void tc13loginProfileIcon() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.clickProfileIcon();
		Assert.assertEquals(true, homePage.personalMenuWindow.isDisplayed());
	}
	@Test(groups = {"func"})
	public void tc14loginNotifications() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.clickNotifications();
		Assert.assertEquals(true, homePage.notificationsWindow.isDisplayed());
	}
	@Test(groups = {"smoke", "func"})
	public void tc15logoutLicenseLink() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		driver.get(Constants.baseURL);
		homePage.clickLicense();
		Assert.assertEquals(driver.getCurrentUrl(), "https://unsplash.com/license");
	}
	@Ignore
	@Test(groups = {"smoke", "func"})
	public void tc16loginSubmitAphotoButtonUpload() throws Exception {
		LoginPage1 loginPage1 = PageFactory.initElements(driver, LoginPage1.class);
		loginPage1.loginToUnsplash(Constants.email, Constants.password);
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.uploadPhotoOver5mp();
		homePage.clickViewProfile();
		Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", homePage.firstPhoto);
        if (!ImagePresent)
        {
             System.out.println("Image not displayed.");
        }
        else
        {
            System.out.println("Image displayed.");
        }
        homePage.deletePhoto();
	}
	@Ignore
	@Test(groups = {"func"})
	public void tc17loginSubmitAphotoButtonUploadUnder5mp() throws Exception {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.uploadPhotoUnder5mp();
		Assert.assertEquals(homePage.pleaseUploadOver5mp.getText(), "Please upload images over 5MP");
	}
}
