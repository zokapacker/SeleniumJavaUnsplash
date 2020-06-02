package test;

import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.HomePage;
import pages.LoginPage1;
import pages.SinglePhotoPage;

public class SinglePhotoTests extends BaseClass{
	
	
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
		String expectedColorLike = ("rgba(224, 76, 76, 1)");
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
	}
	@Test
	public void tc03downloadPhotoButton() {
		SinglePhotoPage singlePhotoPage = PageFactory.initElements(driver, SinglePhotoPage.class);
		//singlePhotoPage.clickRandomPhoto();
		singlePhotoPage.clickDownloadPhotoButton();
		Assert.assertEquals(true, singlePhotoPage.createNewCollectionButton.isDisplayed()); // ispraviti
	}
	

}
