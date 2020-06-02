package test;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.HomePage;
import pages.LoginPage1;

public class HomePageTests extends BaseClass{
	
	@Test
	public void tc01logoutLoginLink() {
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.login.isDisplayed());	
	}
	@Test
	public void tc02logoutJoinFreeLink() {
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.joinFree.isDisplayed());
	}
	@Test
	public void tc03logoutUpFilter() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.upFilter.isDisplayed());
		//boolean isPresent = true; homePage.upFilter.isDisplayed(); //proslo i ovako
		}
	@Test
	public void tc04logoutTopicsLink() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.topics.isDisplayed());
	}
	@Test
	public void tc05logoutExploreLink() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.explore.isDisplayed());
	}
	@Test
	public void tc06logoutDropDownMenu() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.dropDownMenu.isDisplayed());
	}
	@Test
	public void tc07logoutSubmitAphotoButton() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.buttonSubmitPhoto.isDisplayed());
	}
	@Test
	public void tc08logoutEditorialLink() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.editorial.isDisplayed());
	}
	@Test
	public void tc09logoutTravelLink() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.travel.isDisplayed());
	}
	/*@Test
	public void tc10logoutWorkFromHomeLink() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.workFromHome.isDisplayed());
	}*/
	@Test
	public void tc11logoutCovid19Link() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.covid19.isDisplayed());
	}
	@Test
	public void tc12logoutNatureLink() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.nature.isDisplayed());
	}
	@Test
	public void tc13logoutWallpapersLink() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.wallpapers.isDisplayed());
	}
	@Test
	public void tc14logoutTexturesAndPatternsLink() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.texturesAndPatterns.isDisplayed());
	}
	@Test
	public void tc15logoutPeopleLink() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.people.isDisplayed());
	}
	@Test
	public void tc16logoutBusinessAndWorkLink() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.businessAndWork.isDisplayed());
	}
	@Test
	public void tc17logoutTechnologyLink() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.technology.isDisplayed());
	}
	@Test
	public void tc18logoutAnimalsLink() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.animals.isDisplayed());
	}
	@Test
	public void tc19logoutInteriorsLink() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.interiors.isDisplayed());
	}
	@Test
	public void tc20logoutViewAllLink() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.viewAll.isDisplayed());
	}
	@Test
	public void tc21logoutFreelyUsableImagesLink() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.freelyUsableImages.isDisplayed());
	}
	@Test
	public void tc22logoutDownFilter() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.downFilter.isDisplayed());
	}
	@Test
	public void tc23pagination() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.pagination.isDisplayed());
	}
	@Test
	public void tc24loginHomeLink() {
		
		LoginPage1 loginPage1 = PageFactory.initElements(driver, LoginPage1.class);
		loginPage1.clickLogin();
		loginPage1.loginToUnsplash("zokapacker@gmail.com", "sifra123");
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.home.isDisplayed());
	}
	@Test
	public void tc25loginNotifications() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.notifications.isDisplayed());
	}
	@Test
	public void tc26loginProfileIconButton() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.profileIcon.isDisplayed());
	}
	@Test
	public void tc27loginFollowingLink() {
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		Assert.assertEquals(true, homePage.following.isDisplayed());
	}
	
	
	
	
	
	
	
	
	
	

}
