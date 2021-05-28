package com.htc.amazon.test;

import java.util.Map;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.htc.amazon.base.TestBase;
import com.htc.amazon.dataProvider.TestDataProvider;
import com.htc.exceptionHandler.UserDefinedException;

public class VerifyDownloadTheAmazonAppTest extends TestBase {

	@Test(dataProviderClass=TestDataProvider.class,dataProvider ="InputData" )
	public void downloadAmazonApp(Map<String,String> mapData) throws InterruptedException {
		
			try {
				childTest=test.createNode("Amazon application download "); 
				app.downloadTheApp(mapData.get("EmailAddress"),mapData.get("Expected"));
				childTest.pass("Download the App Method is Successfully Exicuted");
			} catch (UserDefinedException e) {
				e.getStackTrace();
				e.printStackTrace();
				Assert.fail("VERIFY DOWNLOAD THE AMAZON APP TEST IS FAILED");
			}
	}

}
