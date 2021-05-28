package com.htc.amazon.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.htc.amazon.base.BasePage;
import com.htc.amazon.pageObjects.HomePageObjects;
import com.htc.constant.Constant;
import com.htc.exceptionHandler.UserDefinedException;

public class Home extends BasePage implements HomePageObjects  {

	public Home(WebDriver driver) {
		super(driver);
	}
	Logger log = Logger.getLogger(Home.class.getName());

	public void clickAccountButton() throws UserDefinedException {
		try {
			clickableMethod(accountButton);
			log.info("--CLCIK ACCOUNT BUTTON METHOD IS SUCCESSFULLY EXICUTED--");
		} catch (UserDefinedException e) {
			throw new UserDefinedException("--CLCIK ACCOUNT BUTTON METHOD IS FAILED--"+e.getMessage());
		}
	}

	public void clickreturnsAndOrdersButton() throws UserDefinedException {
		try {
			clickableMethod(returnsAndOrdersButton);
			log.info("--CLCIK RETURNS AND ORDERS BUTTON METHOD IS SUCCESSFULLY EXICUTED--");
		} catch (UserDefinedException e) {
			throw new UserDefinedException("--CLCIK RETURNS AND ORDERS BUTTON METHOD IS FAILED--"+e.getMessage());
		}
	}

	public  void clickcartButton() throws UserDefinedException {
		try {
			clickableMethod(cartButton);
			log.info("--CLCIK CART BUTTON BUTTON METHOD IS SUCCESSFULLY EXICUTED--");
		} catch (UserDefinedException e) {
			throw new UserDefinedException("--CLCIK CART BUTTON METHOD IS FAILED--"+e.getMessage());
		}		
	}

	public void setSearchProduct() throws UserDefinedException {

		try {
			sendKeysMethod(searchTxtBox, Constant.searchProduct);
			clickableMethod(searchButton);
			log.info("--SEARCH PRODUCT METHOD IS SUCCESSFULLY EXICUTED--");
		} catch (UserDefinedException e) {
			throw new UserDefinedException("--SEARCH PRODUCT METHOD IS FAILED--"+e.getMessage());
		}
	}

	public  void clickLogoReloadButton() throws UserDefinedException {
		try {
			clickableMethod(selectYourAddressButton);
			log.info("--CLCIK LOGO RELOAD BUTTON METHOD IS SUCCESSFULLY EXICUTED--");
		} catch (UserDefinedException e) {
			throw new UserDefinedException("--CLCIK LOGO RELOAD BUTTON METHOD IS FAILED--"+e.getMessage());
		}
	}

	public  void selectSearchAllDropDownButtton() throws UserDefinedException {
		try {
			selectMethod(searchAllDropDownButtton, "search-alias=appliances");
			log.info("--SEARCH ALL DROPDOWN BUTTON METHOD IS SUCCESSFULLY EXICUTED--");
		} catch (UserDefinedException e) {
			throw new UserDefinedException("--SEARCH ALL DROPDOWN BUTTON METHOD IS FAILED--"+e.getMessage());
		}
	}

	public void clickSignOut() throws InterruptedException, UserDefinedException {
		try {
			actionMouseHoverMethod(driver, accountButton);
			actionMouseHoverAndClickMethod(driver, signOutButton);
			log.info("--SIGNOUT METHOD IS SUCCESSFULLY EXICUTED--");
			Thread.sleep(3000);
			driver.close();
		} catch (UserDefinedException e) {
			throw new UserDefinedException("--SIGNOUT METHOD IS FAILED--"+e.getMessage());
		}

	}


}
