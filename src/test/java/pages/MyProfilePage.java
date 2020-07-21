package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfilePage {
	WebDriver driver;
	
		public MyProfilePage(WebDriver driver) {
			
			this.driver=driver;
				
		}
		@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[1]/div/div/div/div[1]/div/div/img") 
		public WebElement profilePhoto;
		@FindBy(linkText="Edit profile") 
		public WebElement editProfileButton;
		@FindBy(linkText="Edit Profile") 
		public WebElement editProfile;
		@FindBy(xpath="//*[@id=\"popover-avatar-loggedin-menu-desktop\"]/div[1]/button/div/img")
		public WebElement profileIcon;
		@FindBy(linkText="View profile") 
		public WebElement viewProfile;
		@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[2]/div/div/ul/li[1]/a") 
		public WebElement photos;
		@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[2]/div/div/ul/li[2]/a") 
		public WebElement likes;
		@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[2]/div/div/ul/li[3]/a") 
		public WebElement collections;
		@FindBy(linkText="Stats") 
		public WebElement stats;
		@FindBy(xpath="//*[@id=\"popover-stats-filter\"]/div[1]/button")
		public WebElement insightsButton;
		@FindBy(linkText="Last 30 days")
		public WebElement last30Days;
		@FindBy(linkText="All time")
		public WebElement allTime;
		
		
		public void clickEditButton() {
			editProfileButton.click();
		}
		public void clickProfileIcon() {
			profileIcon.click();
		}
		public void clickViewProfile() {
			profileIcon.click();
			viewProfile.click();
		}
		public void clickStats() {
			stats.click();
		}
		public void clickInsightsButton() {
			insightsButton.click();
		}
		public void clickLikes() {
			likes.click();
		}
		public void clickCollections() {
			collections.click();
		}
		
		
		

}
