package com.htc.amazon.test;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.htc.amazon.base.TestBase;
import com.htc.exceptionHandler.UserDefinedException;

public class VerifyingNavigationOfPrimeVideoFromAmazonTest extends TestBase {
	
	@Test
	public void verifyingAmazonPrimeVideo() throws InterruptedException {
		try {
			//prime.navigateToPrimeVideo();
			home.clickcartButton();
		} catch (UserDefinedException e) {
			e.printStackTrace();
			e.getMessage();
			Assert.fail("VERIFYING NAVIGATION OF PRIME VIDEO FOR AMAZON TEST IS FAILED ");
		}
		
		
	}

}
