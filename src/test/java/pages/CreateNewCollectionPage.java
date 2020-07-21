package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Constants;

public class CreateNewCollectionPage {

	    WebDriver driver;
		
		public CreateNewCollectionPage(WebDriver driver) {
			
			this.driver=driver;
		}
		@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div[2]/div[1]/div/div/div[2]/div[1]")
		public WebElement randomPhoto;
		@FindBy(xpath="/html/body/div[2]/div/div/div[4]/div/div/div[1]/div[1]/header/div[2]/div[2]/button") 
		public WebElement addToCollectionButton;
		@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[3]/div[1]/div/button")
		public WebElement createNewCollectionButton;
		@FindBy(id="collection_title") 
		public WebElement collectionName;
		@FindBy(id="collection_description") 
		public WebElement collectionDescription;
		@FindBy(id="collection_privacy") 
		public WebElement collectionPrivacy;
		@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[3]/div[2]/div/form/div[4]/button[1]") 
		public WebElement cancelButton;
		@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[3]/div[2]/div/form/div[4]/button[2]") 
		public WebElement createCollection;
		@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/div[3]/div[1]/div/ul/li[1]/button/div/div/h4")
		public WebElement createdCollection; //proveriti
		@FindBy(xpath="/html/body/div[3]/div/div/div[1]/button") 
		public WebElement closeButton;
		@FindBy(xpath="/html/body/div[2]/div/div/div[1]/button") 
		public WebElement closeButtonOnPhotoPage;
		@FindBy(xpath="//*[@id=\"popover-avatar-loggedin-menu-desktop\"]/div[1]/button/div/img") 
		public WebElement profilePhoto;
		@FindBy(xpath="//*[@id=\"popover-avatar-loggedin-menu-desktop\"]/div[2]/div/ul[1]/li[1]/a") 
		public WebElement viewProfile;
		@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[2]/div/div/ul/li[3]/a") 
		public WebElement collections;
		@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[3]/div/div/div[1]/div[1]/a/div[2]/div")
		public WebElement firstCollection;
		@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/div/button")
		public WebElement editCollectionButton;
		@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/form/div[4]/button[1]")
		public WebElement deleteCollection;
		@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div/form/div[4]/button[3]")
		public WebElement deleteConfirm;
		@FindBy(id="unsplash-home")
		public WebElement unsplashHome;
		@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[2]/div/h1/div/span/div/svg")
		public WebElement privacySymbol;
		@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[3]/div[2]/div/form/div[1]/div/span")
		public WebElement nameLetterCounter;
		@FindBy(xpath="//*[@id=\"app\"]/div/div[2]/div[2]/div/div/div/h2")
		public WebElement descrCheck;
		@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[3]/div[2]/div/form/div[2]/div/span")
		public WebElement descrLetterCounter;
		
		public void clickCancel() throws Exception {
			Thread.sleep(2000);
			driver.get(Constants.baseURL);
			randomPhoto.click();
			addToCollectionButton.click();
			createNewCollectionButton.click();
			cancelButton.click();
		}
		
		public void clickHome() {
			unsplashHome.click();
		}
		
		public void createInfo(String nameField, String descriptionField) throws Exception {
			Thread.sleep(4000);
			driver.get(Constants.baseURL);
			randomPhoto.click();
			addToCollectionButton.click();
			createNewCollectionButton.click();
			collectionName.sendKeys(nameField);
			collectionDescription.sendKeys(descriptionField);
			collectionPrivacy.click();
			createCollection.click();
		}
		public void createInfoWithoutPrivacy(String nameField, String descriptionField) throws Exception {
			Thread.sleep(4000);
			driver.get(Constants.baseURL);
			randomPhoto.click();
			addToCollectionButton.click();
			createNewCollectionButton.click();
			collectionName.sendKeys(nameField);
			collectionDescription.sendKeys(descriptionField);
			
			createCollection.click();
		}
		public void deleteCollection() {
			//firstCollection.click();
			editCollectionButton.click();
			deleteCollection.click();
			deleteConfirm.click();
		}
		public void deleteCollection2() {
			firstCollection.click();
			editCollectionButton.click();
			deleteCollection.click();
			deleteConfirm.click();
		}
		public void viewMyCollections() throws Exception {
			Thread.sleep(2000);
			closeButton.click();
			closeButtonOnPhotoPage.click();
			Thread.sleep(2000);
			profilePhoto.click();
			viewProfile.click();
			collections.click();
		}
		public void viewMyFirstCollection() throws Exception {
			Thread.sleep(2000);
			closeButton.click();
			closeButtonOnPhotoPage.click();
			Thread.sleep(2000);
			profilePhoto.click();
			viewProfile.click();
			collections.click();
			firstCollection.click();
		}

	

}
