package pages;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveToOffsetAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;

public class SinglePhotoPage {
	
WebDriver driver;
//Actions action = new Actions(driver);
	
	public SinglePhotoPage(WebDriver driver) {
		
		this.driver=driver;
		//PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div[2]/div[1]/div/div/div[2]/div[1]")
	public WebElement randomPhoto;
	@FindBy(xpath="/html/body/div[2]/div/div/div[4]/div/div/div[1]/div[1]/header/div[2]/div[1]/button")
	public WebElement likeButton;
	@FindBy(xpath="/html/body/div[2]/div/div/div[4]/div/div/div[1]/div[1]/header/div[2]/div[2]/button") 
	public WebElement addToCollectionButton;
	@FindBy(xpath="/html/body/div[2]/div/div/div[4]/div/div/div[1]/div[1]/header/div[2]/div[3]/div/a") 
	public WebElement downloadPhotoButton;
	@FindBy(xpath="//*[@id=\"popover-download-button\"]/div[1]/button") 
	public WebElement chooseSizeButton;
	@FindBy(linkText="Small") 
	public WebElement smallSizePhoto;
	@FindBy(linkText="Medium") 
	public WebElement mediumSizePhoto;
	@FindBy(linkText="Large") 
	public WebElement largeSizePhoto;
	@FindBy(linkText="Original Size]") 
	public WebElement originalSizePhoto;
	@FindBy(xpath="/html/body/div[2]/div/div/div[4]/div/div/div[1]/div[4]/div[1]/div/div/button") 
	public WebElement readMoreButton;
	@FindBy(xpath="/html/body/div[2]/div/div/div[4]/div/div/div[1]/div[4]/div[2]/button") 
	public WebElement shareButton;
	@FindBy(xpath="/html/body/div[2]/div/div/div[4]/div/div/div[1]/div[4]/div[3]/button") 
	public WebElement infoButton;
	@FindBy(xpath="/html/body/div[2]/div/div/div[4]/div/div/div[1]/div[1]/header/div[1]/span/div[2]/span/a") 
	public WebElement photoTitle;
	@FindBy(xpath="/html/body/div[2]/div/div/div[4]/div/div/div[1]/div[1]/header/div[1]/span/div[2]/span/div/div/div[2]/div/div/button") 
	public WebElement followLink;
	@FindBy(xpath="/html/body/div[2]/div/div/div[4]/div/div/div[1]/div[1]/header/div[1]/span/div[2]/span/div/div/div[2]/div/a")
	public WebElement smallProfileWindow;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div[3]/div[1]/div/button")
	public WebElement createNewCollectionButton;
	@FindBy(xpath="/html/body/div[3]/div/div/div[1]/button")
	public WebElement closeButton;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div")
	public WebElement shareWindow;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div")
	public WebElement infoWindow;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[4]/div/div/button")
	public WebElement closeSayThanksWindow;
	
	public void clickLike() {
		likeButton.click();
	}
	public void clickUnlike() throws InterruptedException {
		Thread.sleep(2000);
		likeButton.click();
	}
	public void clickRandomPhoto() {
		randomPhoto.click();
	}
	public void clickAddToCollectionButton() {
		addToCollectionButton.click();
	}
	public void clickDownloadPhotoButton() throws Exception {
		randomPhoto.click();
		downloadPhotoButton.click();
		Thread.sleep(3000);
	}
	public void clickCloseButton() {
		closeButton.click();
	}
	public void clickShareButton() {
		shareButton.click();
	}
	public void clickInfoButton() {
		infoButton.click();
	}
	public void clickCloseSayThanksWindow() throws InterruptedException {
		Thread.sleep(2000);
		closeSayThanksWindow.click();
	}
	public void mouseOverPhotoTitle() {
		Actions action = new Actions(driver);
		action.moveToElement(photoTitle).perform();	
	}
	

	

}	
		
	



