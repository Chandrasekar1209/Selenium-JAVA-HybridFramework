package com.htc.amazon.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.htc.amazon.base.BasePage;
import com.htc.amazon.pageObjects.CareerPageObjects;
import com.htc.exceptionHandler.UserDefinedException;

public class Careers extends BasePage implements CareerPageObjects {

	public Careers(WebDriver driver) {
		super(driver);
	}
	Logger log = Logger.getLogger(Careers.class.getName());
	
	public void amazonCareersApplyNow(String jobTitle,String jobLocation,String Expected) throws UserDefinedException {
		try {
			scrollByVisibleElementAndClick(driver,careers);
			sendKeysMethod(searchJobTitle,jobTitle);
			sendKeysMethod(location,jobLocation);
			clickableMethod(searchButton);
			clickableMethod(jobSelection);
			clickableMethod(applyNow);
			String actualString=gettingTextOfElement(driver, assertMessage);
			Assert.assertEquals(actualString,Expected);
			log.info("--AMAZON CAREERS APLLY NOW METHOD IS SUCCESSFULLY EXICUTED--");
			//driver.close();
			//test.log(Status.PASS, "--AMAZON CAREERS APLLY NOW METHOD IS SUCCESSFULLY EXICUTED--");
			
			
		} catch (UserDefinedException e) {
			throw new  UserDefinedException("--AMAZON CAREERS APLLY NOW METHOD IS FAILED--"+e.getMessage());
		}
		
		
	}
	
	

}
