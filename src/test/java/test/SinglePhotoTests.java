package test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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

public class SinglePhotoTests extends BaseClass{
	public File folder;
	
	
	
	@Test
	public void tc01LikeButton() {
		LoginPage1 loginPage1 = PageFactory.initElements(driver, LoginPage1.class);
		loginPage1.clickLogin();
		loginPage1.loginToUnsplash("zokapacker@gmail.com", "sifra123");
		
		SinglePhotoPage singlePhotoPage = PageFactory.initElements(driver, SinglePhotoPage.class);
		singlePhotoPage.clickRandomPhoto();
		singlePhotoPage.clickLike();
		String actualColorLike = singlePhotoPage.likeButton.getCssValue("background-color");
		System.out.println(actualColorLike);
		/*String hex = Color.fromString(actualColorLike).asHex();
		System.out.println(hex);*/
		String expectedColorLike = ("rgba(255, 255, 255, 1)");
		if(actualColorLike.equalsIgnoreCase(expectedColorLike))
	    {
	        System.out.println("Test passed");
	    }
	    else
	    {
	        System.out.println("Test failed");
	    }
		singlePhotoPage.clickLike();
	}
	@Test
	public void tc02addToCollectionButton() {
		SinglePhotoPage singlePhotoPage = PageFactory.initElements(driver, SinglePhotoPage.class);
		//singlePhotoPage.clickRandomPhoto();
		singlePhotoPage.clickAddToCollectionButton();
		Assert.assertEquals(true, singlePhotoPage.createNewCollectionButton.isDisplayed());
		singlePhotoPage.clickCloseButton();
	}
	
	/*@Test
	public void tc03downloadPhotoButton() {
		
		SinglePhotoPage singlePhotoPage = PageFactory.initElements(driver, SinglePhotoPage.class);
		singlePhotoPage.clickDownloadPhotoButton();
		
		//Thread.sleep(4000);
		
		File listOfFiles[] = folder.listFiles();
		//make sure directory is not empty
		Assert.assertTrue(listOfFiles.length>0);
	
		for(File file : listOfFiles) {
			//make sure that downloaded file is not empty
			Assert.assertTrue(file.length()>0);
			
		}
	}*/
	
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
		/*boolean present;
		try {
		   singlePhotoPage.followLink.isDisplayed();
		   present = true;
		} catch (NoSuchElementException e) {
		   present = false;
		}*/
		
	}

	
	
	
	

}
