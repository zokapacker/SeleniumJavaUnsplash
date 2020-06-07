package pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

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
	@FindBy(xpath="//*[@id=\"app\"]/div/header/nav/div[3]/div/div[1]/button") 
	public WebElement buttonSubmitPhoto;
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
	
	List<WebElement> links=new ArrayList<WebElement>();
	
	//links.add(animals);
	
	
	

}
