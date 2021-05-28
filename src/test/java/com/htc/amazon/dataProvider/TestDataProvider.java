package com.htc.amazon.dataProvider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import com.htc.constant.Constant;
import com.htc.excelRead.ExcelFileReadHandler;


public class TestDataProvider {
	
	
	@DataProvider(name = "InputData")
	public Object[][] dataProvider(Method method){
		
		ExcelFileReadHandler ref = new ExcelFileReadHandler(Constant.datarepository_Amazon_ExcelFile_location);
		Object[][] dataSet = null;
		
		if(method.getName().equals("downloadAmazonApp"))
		{
			dataSet = ref.getDataUsingMap(Constant.datarepository_Amazon_sheetname_DownloadApp);
		}
		
		else if(method.getName().equals("loginAccountVerification"))
		{
			dataSet = ref.getDataUsingMap(Constant.datarepository_Amazon_sheetname_Login);
		}
		else if(method.getName().equals("LoginAndPurchasingTest"))
		{
			dataSet = ref.getDataUsingMap(Constant.datarepository_Amazon_sheetname_Login);
		}
		else if(method.getName().equals("VerifyPrimeVideo"))
		{
			dataSet = ref.getDataUsingMap(Constant.datarepository_Amazon_sheetname_Login);
		}
		else if(method.getName().equals("amazonCareers"))
		{
			dataSet = ref.getDataUsingMap(Constant.datarepository_Amazon_sheetname_Careers);
		}
		else if(method.getName().equals("changeAccountUserName"))
		{
			dataSet = ref.getDataUsingMap(Constant.datarepository_Amazon_sheetname_ChangeUserName);
		}
		return dataSet;
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
//
//	@DataProvider(name = "ecomLogin_address")
//	public Object[][] ecomStoreAddressData()
//	{
//
//		ExcelFileReadHandler ref= new ExcelFileReadHandler(Constant.datarepository_ecomstore_signin_location);
//
//		Object[][] loginDataSet=ref.getDataUsingMap(Constant.datarepository_ecomstore_sheetname_address);
//
//		System.out.println("test"+loginDataSet.length);
//		return loginDataSet;
//
//	}
//	@DataProvider(name = "data")
//	public Object[][] ecomStoreSigninInValidData()
//	{
//
//		ExcelFileReadHandler ref= new ExcelFileReadHandler(Constant.datarepository_ecomstore_signin_location);
//
//		Object[][] loginDataSet=ref.getDataUsingMap(Constant.datarepository_ecomstore_sheetname_login);
//
//		System.out.println(loginDataSet.length);
//		return loginDataSet;
//
//	}

//}