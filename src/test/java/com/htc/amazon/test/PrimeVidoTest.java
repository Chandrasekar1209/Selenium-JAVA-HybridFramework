package com.htc.amazon.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.amazon.base.TestBase;
import com.htc.amazon.dataProvider.TestDataProvider;
import com.htc.exceptionHandler.UserDefinedException;

public class PrimeVidoTest extends TestBase{

	@Test(dataProviderClass=TestDataProvider.class,dataProvider ="InputData" )
	public void VerifyPrimeVideo(Map<String,String> mapData) {
		
		try {
			childTest=test.createNode("Verify Prime Video ");
			primeVideo.clickLoginToJoinPrime();
			childTest.pass("Click Login To Join Prime Button is Succesfully Exicuted");
			login.commonLoginMethod(mapData.get("EmailAddress"), mapData.get("Password"));
			childTest.pass("Common Login Method is Succesfully Exicuted");
			primeVideo.primeVideoAction();
			childTest.pass("prime Video Action is Succesfully Exicuted");
		} catch (UserDefinedException e) {
			e.printStackTrace();
			e.getMessage();
			Assert.fail();
		}
	}
	
	
}
