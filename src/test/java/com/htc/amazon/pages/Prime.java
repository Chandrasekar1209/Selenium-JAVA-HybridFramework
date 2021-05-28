package com.htc.amazon.pages;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.htc.amazon.base.BasePage;
import com.htc.amazon.pageObjects.PrimeVideoPageObjects;
import com.htc.exceptionHandler.UserDefinedException;

public class Prime extends BasePage implements PrimeVideoPageObjects {

	public Prime(WebDriver driver) {
		super(driver);
	}
	Logger log = Logger.getLogger(Prime.class.getName());


	private void clickAmazonPrimeAndMovies() throws UserDefinedException {
		try {
			clickableMethod(amazonPrimeAndMovies);
			log.info("CLICK AMAZON PRIME AND MOVIES METHOD IS PASSED");
		} catch (UserDefinedException e) {
			throw new UserDefinedException("CLICK AMAZON PRIME AND MOVIES METHOD IS FAILED"+e.getLocalizedMessage());
		}	
	}

	private void clickRedirectToPrimeVideo() throws UserDefinedException {
		try {
			clickableMethod(redirectToPrimeVideo);
			log.info("REDIRECT TO PRIME VIDEO METHOD IS PASSED");
		} catch (UserDefinedException e) {
			throw new UserDefinedException("REDIRECT TO PRIME VIDEO METHOD IS FAILED"+e.getLocalizedMessage());
		}
	}

	private void clickPrimeVideoLogo() throws UserDefinedException {
		try {
			clickableMethod(redirectToPrimeVideo);
			log.info("CLICK PRIME VIDEO LOGO METHOD IS PASSED");
		} catch (UserDefinedException e) {
			throw new UserDefinedException("CLICK PRIME VIDEO LOGO METHOD IS FAILED"+e.getLocalizedMessage());
		}
	}

	private void primeWindowsHandler() throws InterruptedException, UserDefinedException {
		try {
			String parent=driver.getWindowHandle();
			System.out.println("parent id==="+parent);
			Set<String> allWindows=driver.getWindowHandles();
			int count=allWindows.size();
			System.out.println("Total Windows=="+count);

			for(String child:allWindows)
			{
				if(!parent.equalsIgnoreCase(child))
				{
					driver.switchTo().window(child);
					System.out.println("Child window title is=="+driver.getTitle());
					clickPrimeVideoLogo();
					String actualString=driver.findElement(welcomeTextOfPrimeVideo).getText();
					Assert.assertTrue(actualString.contains("specific text"));
					Thread.sleep(3000);
					driver.close();
				}

			}
			driver.switchTo().window(parent);
			System.out.println("Parent window title is=="+driver.getTitle());
			log.info("PRIME WINDOWS HANDLER METHOD IS PASSED");
		} catch (UserDefinedException e) {
			throw new UserDefinedException(" PRIME WINDOWS HANDLER METHOD IS FAILED"+e.getLocalizedMessage());
		}
	}
	//	private void yourOrders() {
	//		waitForVisibilityOfElementLocated(driver, yourOrders);
	//		actionMouseHoverAndClickMethod(driver, yourOrders);
	//	}
	//	
	public void navigateToPrimeVideo() throws InterruptedException, UserDefinedException {
		try {
			clickAmazonPrimeAndMovies();
			clickRedirectToPrimeVideo();
			primeWindowsHandler();
			log.info(" NAVIGATE TO PRIME VIDEO METHOD IS PASSED ");
		} catch (UserDefinedException e) {
			throw new UserDefinedException(" NAVIGATE TO PRIME VIDEO METHOD IS FAILED "+e.getLocalizedMessage());
		}

	}


}
