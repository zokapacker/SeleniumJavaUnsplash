package pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.Constants;

public class HomePage {
	
WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		//PageFactory.initElements(driver, this);
		
	}
	

	@FindBy(linkText="Login") 
	public WebElement login;
	
	@FindBy(id="SEARCH_FORM_INPUT_nav-bar")
	public WebElement upFilter;
	@FindBy(linkText="Join free")
	public WebElement joinFree;
	@FindBy(id="SEARCH_FORM_INPUT_homepage-header-big")
	public WebElement downFilter;
	@FindBy(linkText="Topics") 
	public WebElement topics;
	@FindBy(linkText="Explore") 
	public WebElement explore;
	@FindBy(xpath="//*[@id=\"popover-secondary-menu-desktop\"]/div[1]/button") // //*[@id="popover-avatar-loggedin-menu-desktop"]/div[1]/button/svg/path
	public WebElement dropDownMenu; 
	@FindBy(xpath="//*[@id=\"popover-secondary-menu-desktop\"]/div[2]/div/ul[1]")
	public WebElement dropDownMenuWindow;
	@FindBy(xpath="//*[@id=\"app\"]/div/header/nav/div[3]/div/div[1]/button") 
	public WebElement submitPhotoButton;
	@FindBy(xpath="//*[@id=\"app\"]/div/header/nav/div[3]/div[2]/div/span/button") 
	public WebElement notifications;
	@FindBy(xpath="//*[@id=\"popover-avatar-loggedin-menu-desktop\"]/div[1]/button") 
	public WebElement profileIcon;
	@FindBy(linkText="Editorial") 
	public WebElement editorial;
	@FindBy(linkText="Following") 
	public WebElement following;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div[3]/div/div[1]/div/ul/li[3]/a/div/span[2]") 
	public WebElement workFromHome;
	@FindBy(linkText="COVID-19")
	public WebElement covid19;
	@FindBy(linkText="Nature")
	public WebElement nature;
	@FindBy(linkText="Wallpapers") 
	public WebElement wallpapers;
	@FindBy(linkText="Textures & Patterns") 
	public WebElement texturesAndPatterns;
	@FindBy(linkText="People")
	public WebElement people;
	@FindBy(linkText="Business & Work")
	public WebElement businessAndWork;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div/div[3]/div/div[1]/div/ul/li[2]/a/div/span[2]") 
	public WebElement travel;
	@FindBy(linkText="Technology")
	public WebElement technology;
	@FindBy(linkText="Animals")
	public WebElement animals;
	@FindBy(linkText="Interiors")
	public WebElement interiors;
	@FindBy(linkText="View all")
	public WebElement viewAll;
	@FindBy(linkText="freely-usable images")
	public WebElement freelyUsableImages;
	@FindBy(linkText="Home")
	public WebElement home;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div[2]/div[1]/div/div")
	public WebElement pagination;
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/div/div/div[1]/p")
	public WebElement loginToSubmitPhoto;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[3]/div/div[1]/div/div/div[1]/div[1]/figure/div/div[2]/div")
	public WebElement firstSearchResultTags;
	@FindBy(xpath="/html/body/div[2]/div/div/div[1]/button")
	public WebElement closeLoginWindow;
	@FindBy(xpath="//*[@id=\"popover-avatar-loggedin-menu-desktop\"]/div[2]/div")
	public WebElement personalMenuWindow;
	@FindBy(xpath="//*[@id=\"app\"]/div/header/nav/div[3]/div[2]/div/div/div/div[2]/div")
	public WebElement notificationsWindow;
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/div/form/div[1]/label")
	public WebElement uploadWindow;
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/div/form/div[1]/div/div[1]/div/div/ul/li/div/div[2]/div[1]/p[2]")
	public WebElement pleaseUploadOver5mp;
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/div/form/div[2]/div[2]/button[2]")
	public WebElement publishPhoto;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[3]/div/div/div/div/div[1]/div/figure/div/a/div/img")
	public WebElement firstPhoto;
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/div/form/div[1]/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/input")
	public WebElement addTagField;
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/div/div[1]/h3")
	public WebElement messageThanks;
	@FindBy(xpath="/html/body/div[2]/div/div/div[1]/button")
	public WebElement closeAfterUploadButton;
	@FindBy(linkText="View profile")
	public WebElement viewProfile;
	@FindBy(xpath="/html/body/div[2]/div/div/div[4]/div/div/div[1]/div[4]/div[2]/button")
	public WebElement editPhoto;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div[2]/div/button[4]/div")
	public WebElement settings;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div[2]/form/div[1]/div/div[2]/button")
	public WebElement deleteButton;
	@FindBy(linkText="Unsplash License")
	public WebElement license;
	
	public void clickJoinFree() {
		joinFree.click();
	}
	public void clickTopics() {
		driver.get(Constants.baseURL);
		topics.click();
	}
	public void clickExplore() {
		driver.get(Constants.baseURL);
		explore.click();
	}
	public void clickDropDownMenu() {
		driver.get(Constants.baseURL);
		dropDownMenu.click();
	}
	public void clickSubmitPhoto() {
		driver.get(Constants.baseURL);
		submitPhotoButton.click();
	}
	public void clickEditorial() {
		driver.get(Constants.baseURL);
		editorial.click();
	}
	public void clickCloseLogin() {
		closeLoginWindow.click();
	}
	public void clickFollowing() {
		following.click();
	}
	public void clickProfileIcon() {
		profileIcon.click();
	}
	public void clickNotifications() {
		notifications.click();
	}
	public void uploadPhotoUnder5mp() throws Exception {
		clickSubmitPhoto();
		uploadWindow.click();
		Runtime.getRuntime().exec("C:/Users/Korisnik/Desktop/TESTING/FileUploadScriptUnder5mp.exe");
		Thread.sleep(11000);
	}
	public void uploadPhotoOver5mp() throws Exception {
		clickSubmitPhoto();
		uploadWindow.click();
		Runtime.getRuntime().exec("C:/Users/Korisnik/Desktop/TESTING/FileUploadScriptOver5mp.exe");
		addTagField.sendKeys(Constants.keysNature);
		Thread.sleep(17000);
		publishPhoto.click();
		Thread.sleep(4000);
		closeAfterUploadButton.click();
	}
	public void clickViewProfile() {
		profileIcon.click();
		viewProfile.click();
	}
	public void deletePhoto() {
		firstPhoto.click();
		editPhoto.click();
		settings.click();
		deleteButton.click();
		
	}
	public void clickLicense() {
		license.click();
	}
	
	

}
