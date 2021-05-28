package com.htc.amazon.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.amazon.base.TestBase;
import com.htc.amazon.dataProvider.TestDataProvider;
import com.htc.exceptionHandler.UserDefinedException;

public class AmzonCareersTest extends TestBase {

	@Test(dataProviderClass=TestDataProvider.class,dataProvider ="InputData" )
	public void amazonCareers(Map<String,String> mapData){
		
		
		try {
			childTest=test.createNode("Amazon Careers");  
			careers.amazonCareersApplyNow(mapData.get("JobTitle"),mapData.get("Location"),mapData.get("Expected"));
			childTest.pass("Amazon Career ApplyNow Method is Successfully Exicuted");
		} catch (UserDefinedException e) {
			e.printStackTrace();
			e.getMessage();
			Assert.fail();
		}

	}

}
