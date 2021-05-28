package com.htc.amazon.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.amazon.base.TestBase;
import com.htc.amazon.dataProvider.TestDataProvider;
import com.htc.exceptionHandler.UserDefinedException;

public class ChangeUserNameTest extends TestBase {

	
	@Test(dataProviderClass=TestDataProvider.class,dataProvider ="InputData")
	public void changeAccountUserName(Map<String,String> mapData) throws InterruptedException {
		try {
			childTest=test.createNode("Change Account User Name");
			home.clickAccountButton();
			childTest.pass("Click Account Button is Successfully Exicuted");
			login.commonLoginMethod(mapData.get("EmailAddress"), mapData.get("Password"));
			childTest.pass("Common Login Method is Successfully Exicuted");
			home.clickAccountButton();
			childTest.pass("Click Account Button is Successfully Exicuted");
			change.changeUserName();
			childTest.pass("Change User Name Method is Successfully Exicuted");
			accesses.afterGivingAccesses(mapData.get("Password"),mapData.get("Name"),mapData.get("Expected"));
			childTest.pass("After Giving Accessess Method is Successfully Exicuted");
			home.clickSignOut();
			childTest.pass("Sign Out Method is Successfully Exicuted");
		} catch (UserDefinedException e) {
			e.printStackTrace();
			e.getMessage();
			Assert.fail();
		}
	}
	
	
}
