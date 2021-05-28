package com.htc.amazon.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.amazon.base.TestBase;
import com.htc.amazon.dataProvider.TestDataProvider;
import com.htc.exceptionHandler.UserDefinedException;

public class LoginTest extends TestBase {
	
	@Test(dataProviderClass=TestDataProvider.class,dataProvider ="InputData" )
	public void loginAccountVerification(Map<String,String> mapData) throws InterruptedException {
		try {
			childTest=test.createNode("Login Account Verification  ");
			home.clickAccountButton();
			childTest.pass("Account Button Clicked");
			login.loginActions(mapData.get("EmailAddress"), mapData.get("Password"),mapData.get("Expected"));
			childTest.pass("Login Action Successfully Exicuted");
			home.clickSignOut();
			childTest.pass("Sign Out Button Clicked");
		} catch (UserDefinedException e) {
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	

	
	
}
