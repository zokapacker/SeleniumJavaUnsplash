package test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.hamcrest.Matcher;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.HomePage;
import pages.LoginPage1;
import pages.SinglePhotoPage;
import utils.BrowserFactory1;
import utils.Constants;

public class SinglePhotoTests extends BaseClass{
	
	@Test(groups = {"smoke", "func"})
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

	@Test(groups = {"smoke", "func"})
	public void tc02LikeButton() throws InterruptedException {
		SinglePhotoPage singlePhotoPage = PageFactory.initElements(driver, SinglePhotoPage.class);
		singlePhotoPage.clickLike();
		String rgbFormat = singlePhotoPage.likeButton.getCssValue("background-color");
		String hexcolor = Color.fromString(rgbFormat).asHex();
		//Assert.assertTrue(hexcolor.equals("#e77474") || hexcolor.equals("#e04c4c"));
		System.out.println(hexcolor);
        //singlePhotoPage.clickUnlike();
	}


	
	@Test(groups = {"smoke", "func"})
	public void tc03addToCollectionButton() throws InterruptedException {
		SinglePhotoPage singlePhotoPage = PageFactory.initElements(driver, SinglePhotoPage.class);
		singlePhotoPage.clickUnlike();
		singlePhotoPage.clickAddToCollectionButton();
		Assert.assertEquals(true, singlePhotoPage.createNewCollectionButton.isDisplayed());
		singlePhotoPage.clickCloseButton();
	}
	@Ignore
	@Test(groups = {"smoke", "func"})
	public void tc04shareButton() {
		SinglePhotoPage singlePhotoPage = PageFactory.initElements(driver, SinglePhotoPage.class);
		singlePhotoPage.clickShareButton();
		Assert.assertEquals(true, singlePhotoPage.shareWindow.isDisplayed());
		singlePhotoPage.clickCloseButton();	
	}
	@Test(groups = {"func"})
	public void tc05infoButton() {
		SinglePhotoPage singlePhotoPage = PageFactory.initElements(driver, SinglePhotoPage.class);
		singlePhotoPage.clickInfoButton();
		Assert.assertEquals(true, singlePhotoPage.infoWindow.isDisplayed());
		singlePhotoPage.clickCloseButton();
	}
	@Test(groups = {"func"})
	public void tc06photoTitleAndFollowLink() {
		SinglePhotoPage singlePhotoPage = PageFactory.initElements(driver, SinglePhotoPage.class);
		singlePhotoPage.mouseOverPhotoTitle();
		Assert.assertEquals(true, singlePhotoPage.followLink.isDisplayed());
		
	}

	
	
	
	

}
