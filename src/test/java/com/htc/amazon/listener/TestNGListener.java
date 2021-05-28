package com.htc.amazon.listener;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.htc.amazon.base.TestBase;
import com.htc.amazon.extentReport.ExtentManager;
import com.htc.constant.Constant;
import com.htc.screenShot.Screenshot;



public class TestNGListener extends TestBase implements ITestListener{



	public void onTestStart(ITestResult result) {
		System.out.println(("*** Running test method " + result.getMethod().getMethodName() + "..."));
		test=extent.createTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {

		try {
			childTest.log(Status.PASS,result.getName()+ "_TEST CASE IS PASSED ");// to add name in extent report
			Object testClass = result.getInstance();
			WebDriver driver = ((TestBase)testClass).getDriver();
			System.out.println(("*** Test execution " + result.getMethod().getMethodName() + " is passed..."));
			String screenshotPath=Screenshot.captureScreenShot(driver, result.getMethod().getMethodName(), Constant.ScreenshotPassedFilePath);
			System.out.println(screenshotPath);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	public void onTestFailure(ITestResult result) {


		try {
			childTest.log(Status.FAIL,result.getName()+ "_TEST CASE IS FAILED "); // to add name in extent report
			childTest.log(Status.FAIL,"EXCEPTION IS_"+result.getThrowable() ); // to add error/exception in extent report
			System.out.println("*** Test execution " + result.getMethod().getMethodName() + " is failed...");	
			Object testClass = result.getInstance();
			WebDriver driver = ((TestBase)testClass).getDriver();
			String screenshotPath=Screenshot.captureScreenShot(driver, result.getMethod().getMethodName(), Constant.ScreenshotFailedFilePath);
			test.addScreenCaptureFromPath(screenshotPath);
			System.out.println(screenshotPath);
			System.out.println(result.getThrowable().getStackTrace());
		} catch (Exception e) {

			e.printStackTrace();
		}
	}


	public void onTestSkipped(ITestResult result) {
		System.out.println("*** Test execution " + result.getMethod().getMethodName() + " skipped...");
		test.log(Status.SKIP, "Test Skipped");
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("*** Test failed but within percentage % " + result.getMethod().getMethodName());
	}


	public void onStart(ITestContext context) {
		extent=ExtentManager.getInstance();
		System.out.println("*** Test Suite " + context.getName() + " started ***");
	}


	public void onFinish(ITestContext context) {
		System.out.println(("*** Test Suite " + context.getName() + " ending ***"));
		extent.flush();
	}

}	
