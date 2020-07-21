package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditProfilePage {
	WebDriver driver;
	
	public EditProfilePage(WebDriver driver) {
		
		this.driver=driver;
			
	}
	@FindBy(xpath="//*[@id=\"popover-avatar-loggedin-menu-desktop\"]/div[1]/button/div/img")
	public WebElement profileIcon;
	@FindBy(linkText="View profile") 
	public WebElement viewProfile;
	@FindBy(linkText="Edit profile") 
	public WebElement editProfileButton;
	@FindBy(linkText="Email settings") 
	public WebElement emailSettings;
	@FindBy(linkText="Change password") 
	public WebElement changePassword;
	@FindBy(linkText="Connect accounts") 
	public WebElement connectAccounts;
	@FindBy(linkText="Applications")
	public WebElement applications;
	@FindBy(linkText="Close account") 
	public WebElement closeAccount;
	@FindBy(linkText="Change profile image") 
	public WebElement changeProfileImage;
	@FindBy(xpath="//*[@id=\"edit_user_4639221\"]/div[1]/div[1]/a/div/img")
	public WebElement profileImage;
	@FindBy(id="user_first_name") 
	public WebElement inputFirstName;
	@FindBy(id="user_last_name") 
	public WebElement inputLastName;
	@FindBy(id="user_email") 
	public WebElement inputEmail;
	@FindBy(id="user_username") 
	public WebElement inputUsername;
	@FindBy(id="user_url") 
	public WebElement inputUrl;
	@FindBy(id="user_location") 
	public WebElement inputLocation;
	@FindBy(id="user_instagram_username") 
	public WebElement inputInstagramUsername;
	@FindBy(id="twitter_username") 
	public WebElement inputTwitterUsername;
	@FindBy(id="user_bio") 
	public WebElement inputBio;
	@FindBy(id="user_interests_tag") 
	public WebElement inputInterests;
	@FindBy(id="user_allow_messages") 
	public WebElement checkboxMessaging;
	@FindBy(name="commit") 
	public WebElement updateAccountButton;
	@FindBy(xpath="/html/body/div[4]/div/div/div/div[2]/div[2]/ul/li")
	public WebElement errorFirstName;
	
	//nastaviti
	
	public void clickViewProfile() {
		profileIcon.click();
		viewProfile.click();
	}
	public void clickEditButton() {
		profileIcon.click();
		viewProfile.click();
		editProfileButton.click();
	}
	public void clickEmailSettings() throws Exception {
		emailSettings.click();
		Thread.sleep(2000);
	}
	public void clickChangePassword() {
		changePassword.click();
	}
	public void clickConnectAccounts() throws Exception {
		connectAccounts.click();
		Thread.sleep(2000);
	}
	public void clickApplications() {
		applications.click();
	}
	public void clickCloseAccount() {
		closeAccount.click();
	}
	public void clickChangeProfileImage() {
		changeProfileImage.click();
	}
	public void clickEditProfileButton() {
		editProfileButton.click();
	}
	public void uploadImage() throws Exception {
		changeProfileImage.click();
		Runtime.getRuntime().exec("C:/Users/Korisnik/Desktop/TESTING/FileUploadScript.exe");
		Thread.sleep(11000);
	}
	public void editProfileInfo(String firstNameField, String lastNameField, String locationField, String bioField) {
		inputFirstName.clear();
		inputFirstName.sendKeys(firstNameField);
		inputLastName.clear();
		inputLastName.sendKeys(lastNameField);
		inputLocation.clear();
		inputLocation.sendKeys(locationField);
		inputBio.clear();
		inputBio.sendKeys(bioField);
		updateAccountButton.click();
	}
	
	
}
