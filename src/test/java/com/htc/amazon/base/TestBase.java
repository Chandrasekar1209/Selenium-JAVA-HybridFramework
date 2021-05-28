package com.htc.amazon.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.htc.amazon.pages.DeleteItemFromCart;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.htc.amazon.pages.Careers;
import com.htc.amazon.pages.ChangingUserName;
import com.htc.amazon.pages.DownloadAmazonApp;
import com.htc.amazon.pages.GrantingAccesses;
import com.htc.amazon.pages.Home;
import com.htc.amazon.pages.Login;
import com.htc.amazon.pages.PrimeVideo;
import com.htc.amazon.pages.ProductDiscription;
import com.htc.amazon.pages.ProductSelection;
import com.htc.browserFactory.BrowserFactory;
import com.htc.configDataProvider.PropertyManager;
import com.htc.constant.Constant;
import com.htc.logger.XMLlog4jConfigurator;

public class TestBase {
	public static WebDriver driver = null;
	

	protected Home home = null;
	protected Login login = null;
	protected ProductDiscription dis = null;
	protected ProductSelection selection = null;
	protected PrimeVideo primeVideo =null;
	protected DownloadAmazonApp app =null;
	protected DeleteItemFromCart remove =null;
	protected ChangingUserName change =null;
	protected Careers careers =null;
	protected GrantingAccesses accesses =null;
	
	protected static ExtentReports extent;
	protected static ExtentTest test;
	protected static ExtentTest childTest;
	
	
	@BeforeSuite
	public void loadProptiesFile() throws InterruptedException
	{
		//PropertyLog4j.loadInLoggerFile();
		XMLlog4jConfigurator.loadInLoggerFile();
	}

	@BeforeClass
	public void setup() throws InterruptedException {
		driver=BrowserFactory.startBrowser(driver,PropertyManager.getInstance().getBrowser(),PropertyManager.getInstance().getStagingURL(),Constant.chrome_driverLocation);
		home=new Home(driver);
		login=new Login(driver);
		dis=new ProductDiscription(driver);
		selection=new ProductSelection(driver);
		primeVideo=new PrimeVideo(driver);
		app=new DownloadAmazonApp(driver);
		remove=new DeleteItemFromCart(driver);
		change=new ChangingUserName(driver);
		careers=new Careers(driver);
		accesses=new GrantingAccesses(driver);
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}

	@AfterSuite
	public void tearDownSuiteLevel() {
		driver.quit();
	}
	public  WebDriver getDriver() {
		return driver;
	}


}
