package com.htc.amazon.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.htc.amazon.base.BasePage;
import com.htc.amazon.pageObjects.ChangingUserNamePageObjects;
import com.htc.amazon.pageObjects.LoginPageObjects;
import com.htc.exceptionHandler.UserDefinedException;

public class GrantingAccesses extends BasePage implements ChangingUserNamePageObjects,LoginPageObjects {

	public GrantingAccesses(WebDriver driver) {
		super(driver);
		}
	Logger log = Logger.getLogger(GrantingAccesses.class.getName());
	
	
	
	public void afterGivingAccesses(String password,String newName,String Expected) throws UserDefinedException {
		try {
			waitForVisibilityOfElementLocated(driver, editButton);
			clickableMethod(editButton);
			driver.findElement(newNameField).clear();
			sendKeysMethod(newNameField,newName);
			clickableMethod(saveChangesButton);
			String actualString=gettingTextOfElement(driver,assertMsg);
			Assert.assertEquals(actualString,Expected);
			scrollByVisibleElement(driver, doneButtton);
			clickableMethod(doneButtton);
			log.info("--AFTER GIVING ACCESSES METHOD IS SUCCESSFULLY EXICUTED--");
		} catch (UserDefinedException e) {
			throw new UserDefinedException("--AFTER GIVING ACCESSES METHOD IS FAILED--"+e.getMessage());
		}	
	}

}
