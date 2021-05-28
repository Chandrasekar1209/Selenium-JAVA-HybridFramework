package com.htc.amazon.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.htc.amazon.base.BasePage;
import com.htc.amazon.pageObjects.LoginPageObjects;
import com.htc.exceptionHandler.UserDefinedException;

public class Login extends BasePage implements LoginPageObjects {

	public Login(WebDriver driver) {
		super(driver);
	}
	Logger log = Logger.getLogger(Login.class.getName());

	public void loginActions(String EmailAddress,String password,String Expected) throws UserDefinedException {
		try {
			sendKeysMethod(emailOrMobileNumberTxtBox, EmailAddress);
			clickableMethod(continueButton);
			sendKeysMethod(passwordTxtBox, password);
			clickableMethod(sigInButton);
			String actualString=gettingTextOfElement(driver,assertingAccountName);
			Assert.assertEquals(actualString,Expected);
			log.info("--LOGIN ACTION METHOD IS EXICUTED SUCCESSFULLY--");
			
			
		} catch (UserDefinedException e) {
			throw new UserDefinedException("--LOGIN ACTION METHOD IS FAILED--"+e.getMessage());
		}
	}	
	public void commonLoginMethod(String EmailAddress,String password) throws UserDefinedException {
		try {
			sendKeysMethod(emailOrMobileNumberTxtBox, EmailAddress);
			clickableMethod(continueButton);
			sendKeysMethod(passwordTxtBox, password);
			clickableMethod(sigInButton);
			log.info("--COMMON LOGIN METHOD IS EXICUTED SUCCESSFULLY--");
		} catch (UserDefinedException e) {
			throw new UserDefinedException("--COMMON LOGIN ACTION METHOD IS FAILED--"+e.getMessage());
		}
		
	}
	
	public void enterPassword(String password) throws UserDefinedException {
		try {
			sendKeysMethod(passwordTxtBox, password);
			clickableMethod(sigInButton);
			log.info("--ENTER PASSWORD METHOD IS EXICUTED SUCCESSFULLY--");
		} catch (UserDefinedException e) {
			throw new UserDefinedException("--ENTER PASSWORD METHOD IS FAILED--"+e.getMessage());
		}
	}




}
