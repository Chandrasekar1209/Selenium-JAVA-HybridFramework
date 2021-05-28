package com.htc.amazon.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.htc.amazon.base.BasePage;
import com.htc.amazon.pageObjects.DownloadAmazonAppPageObjects;
import com.htc.exceptionHandler.UserDefinedException;

public class DownloadAmazonApp extends BasePage implements DownloadAmazonAppPageObjects {

	public DownloadAmazonApp(WebDriver driver) {
		super(driver);
	}
	Logger log = Logger.getLogger(DownloadAmazonApp.class.getName());

	private void clickDownloadTheApp() throws   InterruptedException, UserDefinedException {

		try {
			scrollByVisibleElement(driver, downloadTheApp);
			clickableMethod(downloadTheApp);
			log.info("DOWNLOAD THE APP ICON IS CLICKED");
		} catch (UserDefinedException e) {
			log.info("CLICK DOWNLOADTHE APP IS FAILED");
			throw new UserDefinedException("CLICK DOWNLOAD THE APP METHOD IS FAILED");
		}

	}

	private void enterEmailAddress(String email) throws UserDefinedException {
		try {
			scrollByVisibleElement(driver, emailAddress);
			sendKeysMethod(emailAddress,email);
			log.info("EMAIL ADDRESS IS ENTERED IN THE FIELD");
		} catch (UserDefinedException e) {
			log.info("EMAIL ADDRESS METHOD IS FAILED ");
			throw new UserDefinedException("EMAIL ADDRESS METHOD IS FAILED"+e.getLocalizedMessage());
		}

	}

	private void clickSendTheLink(String expected) throws UserDefinedException  {
		try {
			clickableMethod(sendTheLink);
			log.info("SEND THE LINK ICON IS CLICKED");
			waitForVisibilityOfElementLocated(driver, assertingMessage);
			String actualString=driver.findElement(assertingMessage).getText();
			Assert.assertEquals(actualString,expected);
		} catch (UserDefinedException e) {
			log.info("SEND THE LINK METHOD IS FAILED");
			throw new UserDefinedException("SEND THE LINK METHOD IS FAILED"+e.getLocalizedMessage());
		}
	}

	public void  downloadTheApp(String emailAddress,String expected) throws UserDefinedException, InterruptedException{

		try {
			clickDownloadTheApp();
			enterEmailAddress(emailAddress);
			clickSendTheLink(expected);
			//driver.close();
		} catch (UserDefinedException e) {
			log.info("DOWNLOAD THE APP MAIN METHOD IS FAILED");
			throw new UserDefinedException("DOWNLOAD THE APP MAIN METHOD IS FAILED"+e.getLocalizedMessage());
		}




	}

}
