package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class OtherProfilePage {
	
	WebDriver driver;
	//Actions action = new Actions(driver);
		
		public OtherProfilePage(WebDriver driver) {
			
			this.driver=driver;
			//PageFactory.initElements(driver, this);
			
		}
		@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[1]/div/div/div/div[1]/div/div/img") 
		public WebElement userPhoto;
		@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div/div[2]/div/div[1]/button") 
		public WebElement followButton;
		@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[1]/div/div/div/div[2]/div/div[1]/div/div[2]/div/div[2]/button")
		public WebElement messageButton;
		@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[2]/div/div/ul/li[1]/a") 
		public WebElement photos;
		@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[2]/div/div/ul/li[2]/a") 
		public WebElement likes;
		@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[2]/div/div/ul/li[3]/a") 
		public WebElement collections;
		@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div/div[1]/div/div[1]/a") 
		public WebElement location;
		@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div/div[1]/div/div[2]/a") 
		public WebElement website;
		@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/form/div[1]/textarea")
		public WebElement messageBox;
		@FindBy(xpath="/html/body/div[2]/div/div/div[1]/button")
		public WebElement closeButton;
		@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/div/div")
		public WebElement loginBox;
		@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div[2]/div[1]/div/div/div[2]/div[1]")
		public WebElement randomPhoto;
		@FindBy(xpath="/html/body/div[2]/div/div/div[4]/div/div/div[1]/div[1]/header/div[1]/span")
		public WebElement randomUser;
		
		/*public void clickRandomPhoto() {
			randomPhoto.click();
		}*/
		public void clickRandomUser() {
			randomPhoto.click();
			randomUser.click();
		}
		public void clickFollow() {
			followButton.click();
		}
		public void clickMessage() {
			messageButton.click();
		}
		public void clickCloseButton() {
			closeButton.click();
		}
	

}
