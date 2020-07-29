package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BaseClass;
import pages.CreateNewCollectionPage;
import pages.LoginPage1;
import pages.SinglePhotoPage;
import utils.Constants;


public class CreateNewCollectionTests extends BaseClass {


	@Test(groups = {"smoke", "func"})
	public void tc01createCollection() throws Exception {
	LoginPage1 loginPage1 = PageFactory.initElements(driver, LoginPage1.class);
	loginPage1.loginToUnsplash(Constants.email, Constants.password);
	CreateNewCollectionPage createNewCollectionPage = PageFactory.initElements(driver, CreateNewCollectionPage.class);
	createNewCollectionPage.createInfo(Constants.name, Constants.descr);
	createNewCollectionPage.viewMyCollections();
	Assert.assertEquals(createNewCollectionPage.firstCollection.getText(), Constants.name);
	createNewCollectionPage.firstCollection.click();
	createNewCollectionPage.deleteCollection();
	}
	
	@Test(groups = {"func"})
	public void tc02createCollectionPrivacySymbol() throws Exception {
		CreateNewCollectionPage createNewCollectionPage = PageFactory.initElements(driver, CreateNewCollectionPage.class);
		createNewCollectionPage.firstCollection.click();
		boolean present;
	    try {
	       createNewCollectionPage.privacySymbol.isDisplayed();
	       present = true;
	    } catch (NoSuchElementException e) {
	       present = false;
	    }
	}
	
	@Test(groups = {"func"})
	public void tc03createCollectionDescription() throws Exception {
		CreateNewCollectionPage createNewCollectionPage = PageFactory.initElements(driver, CreateNewCollectionPage.class);
		Assert.assertEquals(createNewCollectionPage.descrCheck.getText(), Constants.descr);
        createNewCollectionPage.deleteCollection();
	}

	@Test(groups = {"func"})
	public void tc04createCollectionNoPrivacySymbol() throws Exception {
	    CreateNewCollectionPage createNewCollectionPage = PageFactory.initElements(driver, CreateNewCollectionPage.class);
	    createNewCollectionPage.createInfoWithoutPrivacy(Constants.name, Constants.descr);
	    createNewCollectionPage.viewMyFirstCollection();
	    boolean present;
	    try {
	       createNewCollectionPage.privacySymbol.isDisplayed();
	       present = false;
	    } catch (NoSuchElementException e) {
	       present = true;
	    }
	    createNewCollectionPage.deleteCollection();
	}

	@Test(groups = {"func"})
	public void tc05createCollectionNoName() throws Exception {
	    CreateNewCollectionPage createNewCollectionPage = PageFactory.initElements(driver, CreateNewCollectionPage.class);
	    createNewCollectionPage.createInfo("", "opis");
	    Assert.assertEquals(createNewCollectionPage.collectionName.getAttribute("validationMessage"), "Please fill out this field.");
	}

	@Test
	public void tc06createCollectionName61() throws Exception {
	    CreateNewCollectionPage createNewCollectionPage = PageFactory.initElements(driver, CreateNewCollectionPage.class);
	    driver.get(Constants.baseURL);
	    createNewCollectionPage.createInfo(Constants.name61, Constants.descr);
	    Assert.assertEquals(createNewCollectionPage.nameLetterCounter.getText(), "-1");
	}

	@Test
	public void tc07createCollectionDescription251() throws Exception {
	    CreateNewCollectionPage createNewCollectionPage = PageFactory.initElements(driver, CreateNewCollectionPage.class);
	    createNewCollectionPage.createInfo(Constants.name, Constants.descr251);
	    Assert.assertEquals(createNewCollectionPage.descrLetterCounter.getText(), "-1");
	    createNewCollectionPage.viewMyFirstCollection();
	    createNewCollectionPage.deleteCollection();
	}
	
	@Test(groups = {"func"})
	public void tc08CancelButton() throws Exception {
		CreateNewCollectionPage createNewCollectionPage = PageFactory.initElements(driver, CreateNewCollectionPage.class);
		createNewCollectionPage.clickCancel();
		Assert.assertEquals(true, createNewCollectionPage.createNewCollectionButton.isDisplayed());
	}

}
