package com.htc.amazon.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.htc.constant.Constant;
import com.htc.exceptionHandler.UserDefinedException;

public class BasePage {

	protected WebDriver driver;
	protected WebDriverWait wait;
	
	Logger log = Logger.getLogger(BasePage.class.getName());

	//******* WEBDRIVER INITIALIZATION *********//
	public BasePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	//******* FIND ELEMENT METHOD ***********//
	public void  findElementMethod(By locator) throws UserDefinedException {
		try {
			driver.findElement(locator);
			log.info("--FIND ELEMENT METHOD IS SUCCESSFULLY EXICUTED--");
		} catch (Exception e) {
			throw new UserDefinedException("--FIND ELEMENT METHOD IS FAILED--"+e.getMessage());
		}
	}

	//******* FIND ELEMENT RETURN STRING METHOD ***********//
	public String  findElementReturnStringMethod(By locator) throws UserDefinedException {
		try {
			waitForVisibilityOfElementLocated(driver, locator);
			String actualString=driver.findElement(locator).getText();
			log.info("--FIND ELEMENT RETURN STRING METHOD IS SUCCESSFULLY EXICUTED--");
			return actualString;
		} catch (Exception e) {
			throw new UserDefinedException("--FIND ELEMENT RETURN STRING METHOD IS FAILED--"+e.getMessage());
		}
	}

	//******* CLICK ELEMENT METHOD **********//
	public void clickableMethod(By locator) throws UserDefinedException {

		try {
			waitForElementToBeClickable(driver, locator);
			WebElement element=driver.findElement(locator);
			element.click();
			log.info("--CLICK ELEMENT METHOD IS SUCCESSFULLY EXICUTED--");
		} catch (Exception e) {
			e.printStackTrace();
			throw new UserDefinedException("--CLICK ELEMENT METHOD IS FAILED--"+e.getMessage());
		}
	}

	//********* SEND KEYS METHOD **************//
	public void sendKeysMethod(By locator,String string) throws UserDefinedException {
		try {
			WebElement element=driver.findElement(locator);
			element.sendKeys(string);
			log.info("--SEND KEYS METHOD IS SUCCESSFULLY EXICUTED--");
		} catch (Exception e) {
			throw new UserDefinedException("--SEND KEYS METHOD IS FAILED--"+e.getMessage());
		}

	}

	//********* SELECT METHOD ***************//
	public void selectMethod(By locator,String value) throws UserDefinedException {
		try {
			WebElement element=driver.findElement(locator);
			Select select=new Select(element);
			select.selectByValue(value);
			log.info("--SELECT METHOD IS SUCCESSFULLY EXICUTED--");
		} catch (Exception e) {
			throw new UserDefinedException("--SELECT METHOD IS FAILED--"+e.getMessage());
		}
	}

	//********* ACTION MOUSEHOVER METHOD ***************//
	public void actionMouseHoverMethod(WebDriver driver,By locator) throws UserDefinedException {
		try {
			waitForVisibilityOfElementLocated(driver, locator);
			WebElement element=driver.findElement(locator);
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
			log.info("--ACTION MOUSEHOVER METHOD IS SUCCESSFULLY EXICUTED--");
		} catch (Exception e) {
			throw new UserDefinedException("--ACTION MOUSEHOVER METHOD IS FAILED--"+e.getMessage());
		}

	}

	//********* ACTION MOUSEHOVER AND CLICK METHOD ***************//
	public void actionMouseHoverAndClickMethod(WebDriver driver,By locator) throws UserDefinedException {
		try {
			waitForVisibilityOfElementLocated(driver, locator);
			WebElement element=driver.findElement(locator);
			Actions action = new Actions(driver);
			action.moveToElement(element).click().build().perform();
			log.info("--ACTION MOUSEHOVER AND CLICK METHOD IS SUCCESSFULLY EXICUTED--");
		} catch (Exception e) {
			throw new UserDefinedException("--ACTION MOUSEHOVER AND CLICK METHOD IS FAILED--"+e.getMessage());
		}
	}

	//********* WAIT FOR VISIBILITY OF ELEMENTS TO BE LOCATED ************//
	public void waitForVisibilityOfElementLocated(WebDriver driver, By locators) throws UserDefinedException {
		try {
			wait = new WebDriverWait(driver,Constant.explicitwait_secounds);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locators));
			log.info("--WAIT FOR VISIBILITY OF ELEMENTS TO BE LOCATED METHOD IS SUCCESSFULLY EXICUTED--");
		} catch (Exception e) {
			throw new UserDefinedException("--WAIT FOR VISIBILITY OF ELEMENTS TO BE LOCATED METHOD IS FAILED--"+e.getMessage());
		}
	}

	//********* WAIT FOR ELEMENT TO BE CLCICKABLE ****************//
	public void waitForElementToBeClickable(WebDriver driver, By locators) throws UserDefinedException {
		try {
			wait = new WebDriverWait(driver,Constant.explicitwait_secounds);
			wait.until(ExpectedConditions.elementToBeClickable(locators));
			log.info("--WAIT FOR ELEMENT TO BE CLCICKABLE METHOD IS SUCCESSFULLY EXICUTED--");
		} catch (Exception e) {
			throw new UserDefinedException("--WAIT FOR ELEMENT TO BE CLCICKABLE METHOD IS FAILED--"+e.getMessage());
		}
	}

	//********* WAIT FOR ELEMENT TO BE SELECTED *****************//
	public void waitForElementToBeSelected(WebDriver driver, By locators) throws UserDefinedException {
		try {
			wait = new WebDriverWait(driver,Constant.explicitwait_secounds);
			wait.until(ExpectedConditions.elementToBeSelected(locators));
			log.info("--WAIT FOR ELEMENT TO BE SELECTED METHOD IS SUCCESSFULLY EXICUTED--");
		} catch (Exception e) {
			throw new UserDefinedException("--WAIT FOR ELEMENT TO BE SELECTED METHOD IS FAILED--"+e.getMessage());
		}
	}

	//******** TO SCROLL DOWN THE WEB PAGE BY THE  VISIBILITY OF THE ELEMENT *********//
	public void scrollByVisibleElement(WebDriver driver,By locator) throws UserDefinedException {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			waitForVisibilityOfElementLocated(driver, locator);
			WebElement element=driver.findElement(locator);
			js.executeScript("arguments[0].scrollIntoView();", element);
			log.info("--TO SCROLL DOWN THE WEB PAGE BY THE  VISIBILITY OF THE ELEMENT METHOD IS SUCCESSFULLY EXICUTED--");
		} catch (Exception e) {
			throw new UserDefinedException("--SCROLL BY VISIBLE ELEMENT METHOD IS FAILED--"+e.getMessage());
		}

	}
	
	//******** TO SCROLL DOWN THE WEB PAGE BY THE  VISIBILITY OF THE ELEMENT *********//
		public void scrollByVisibleElementAndClick(WebDriver driver,By locator) throws UserDefinedException {
			try {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				waitForVisibilityOfElementLocated(driver, locator);
				WebElement element=driver.findElement(locator);
				js.executeScript("arguments[0].scrollIntoView();", element);
				element.click();
				log.info("--TO SCROLL DOWN THE WEB PAGE BY THE  VISIBILITY OF THE ELEMENT AND CLICK METHOD IS SUCCESSFULLY EXICUTED--");
			} catch (Exception e) {
				throw new UserDefinedException("--SCROLL BY VISIBLE ELEMENT AND CLICK METHOD IS FAILED--"+e.getMessage());
			}

		}

	
	
	
	
	
	//******* GETTING ACTUAL STRING OF THE ELEMENT *********//
	public String  gettingTextOfElement(WebDriver driver,By locator) {
		return driver.findElement(locator).getText();
	}

	//******** CLOSING THE FIRST TAB IN CHROME ********//
	public void closingFirstTabWindowsHandler() {

	}

	//******** GET CURRENT METHOD NAME USING STRACKTRACE *******//
	public String getCurrentMethodName() {
		String curentMethodName = new Throwable().getStackTrace()[0].getMethodName();
		return curentMethodName;

	}

	public void switchtoNewFrame(WebDriver driver) {
		driver.switchTo().frame("checkoutPrefetch");
	}

}
