package com.htc.amazon.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.htc.amazon.base.TestBase;
import com.htc.amazon.dataProvider.TestDataProvider;
import com.htc.exceptionHandler.UserDefinedException;


public class PurchasingPoductTest extends TestBase{

	@Test(dataProviderClass=TestDataProvider.class,dataProvider ="InputData" )
	public void LoginAndPurchasingTest(Map<String,String> mapData) throws InterruptedException {

		try {
			childTest=test.createNode("Purchasing a product ");
			home.clickAccountButton();
			childTest.pass("Account Button Clicked");
			login.commonLoginMethod(mapData.get("EmailAddress"), mapData.get("Password"));
			childTest.pass("Common Login Method is Successfully Exicuted");
			home.setSearchProduct();
			childTest.pass("Search Product Method is Successfully Exicuted");
			selection.productSelection();
			childTest.pass("Product Selecction Method is Successfully Exicuted");
			dis.AddToCartAction();
			childTest.pass("Add To Cart Action Method is Successfully Exicuted");
			home.clickSignOut();
			childTest.pass("Sign Out Button Clicked");
		} catch (UserDefinedException e) {
			e.printStackTrace();
			Assert.fail();
		} 

	}
}
