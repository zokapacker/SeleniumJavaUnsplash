package test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.HomePage;
import pages.LoginPage1;
import pages.SinglePhotoPage;
import utils.BrowserFactory1;
import utils.Constants;

public class SinglePhotoTests extends BaseClass{
	
	@Test
	public void tc01downloadPhotoButton() throws Exception {
		LoginPage1 loginPage1 = PageFactory.initElements(driver, LoginPage1.class);
		loginPage1.loginToUnsplash(Constants.email, Constants.password);
		
		SinglePhotoPage singlePhotoPage = PageFactory.initElements(driver, SinglePhotoPage.class);
		singlePhotoPage.clickDownloadPhotoButton();
		
		BrowserFactory1 browserFactory1 = PageFactory.initElements(driver, BrowserFactory1.class);
		File listOfFiles[] = browserFactory1.folder.listFiles();
		
		Assert.assertTrue(listOfFiles.length>0);
		singlePhotoPage.clickCloseSayThanksWindow();
	}

	@Test
	public void tc02LikeButton() throws InterruptedException {
		SinglePhotoPage singlePhotoPage = PageFactory.initElements(driver, SinglePhotoPage.class);
		singlePhotoPage.clickLike();
		Assert.assertEquals(singlePhotoPage.likeButton.getCssValue("background-color"), "rgba(224, 76, 76, 1)");
        singlePhotoPage.clickUnlike();
	}
	@Test
	public void tc03addToCollectionButton() {
		SinglePhotoPage singlePhotoPage = PageFactory.initElements(driver, SinglePhotoPage.class);
		singlePhotoPage.clickAddToCollectionButton();
		Assert.assertEquals(true, singlePhotoPage.createNewCollectionButton.isDisplayed());
		singlePhotoPage.clickCloseButton();
	}

	@Test
	public void tc04shareButton() {
		SinglePhotoPage singlePhotoPage = PageFactory.initElements(driver, SinglePhotoPage.class);
		singlePhotoPage.clickShareButton();
		Assert.assertEquals(true, singlePhotoPage.shareWindow.isDisplayed());
		singlePhotoPage.clickCloseButton();	
	}
	@Test
	public void tc05infoButton() {
		SinglePhotoPage singlePhotoPage = PageFactory.initElements(driver, SinglePhotoPage.class);
		singlePhotoPage.clickInfoButton();
		Assert.assertEquals(true, singlePhotoPage.infoWindow.isDisplayed());
		singlePhotoPage.clickCloseButton();
	}
	@Test
	public void tc06photoTitleAndFollowLink() {
		SinglePhotoPage singlePhotoPage = PageFactory.initElements(driver, SinglePhotoPage.class);
		singlePhotoPage.mouseOverPhotoTitle();
		Assert.assertEquals(true, singlePhotoPage.followLink.isDisplayed());
		
	}

	
	
	
	

}
