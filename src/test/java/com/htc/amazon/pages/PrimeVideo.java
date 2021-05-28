package com.htc.amazon.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.htc.amazon.base.BasePage;
import com.htc.amazon.pageObjects.PrimeVideoPageObjects;
import com.htc.exceptionHandler.UserDefinedException;


public class PrimeVideo extends BasePage implements PrimeVideoPageObjects {

	public PrimeVideo(WebDriver driver) {
		super(driver);
	}
	Logger log = Logger.getLogger(PrimeVideo.class.getName());
	
	public void clickLoginToJoinPrime() throws UserDefinedException {
		try {
			clickableMethod(primeButton);
			clickableMethod(loginToJoinPrimeButton);
			log.info("--CLICK LOGIN TO JOIN PRIME IS SUCCESSFULLY EXICUTED");
		} catch (UserDefinedException e) {
			throw new UserDefinedException("--CLICK LOGIN TO JOIN PRIME IS FAILED--"+e.getLocalizedMessage());
		}
	}
	
	public void primeVideoAction() throws UserDefinedException {
		try {
			scrollByVisibleElementAndClick(driver, explorePrimeVideo);
			scrollByVisibleElementAndClick(driver, joinPrimeToWatchButton);
			String actual=gettingTextOfElement(driver, assertPrime);
			Assert.assertEquals(actual,"Welcome to Prime Video");
			clickableMethod(dropDownButton);
			clickableMethod(primeVideoSignOut);
			log.info("--PRIME VIDEO ACTION METHOD IS SUCCESSFULLY EXICUTED");
			//driver.close();
		} catch (UserDefinedException e) {
			throw new UserDefinedException("--PRIME VIDEO ACTION METHOD IS FAILED--"+e.getMessage());
		}
		
	}
	
	
}
