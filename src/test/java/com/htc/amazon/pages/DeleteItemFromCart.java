package com.htc.amazon.pages;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.htc.amazon.base.BasePage;
import com.htc.amazon.pageObjects.DeleteItemFromCartPageObjects;
import com.htc.constant.Constant;
import com.htc.exceptionHandler.UserDefinedException;

public class DeleteItemFromCart extends BasePage implements DeleteItemFromCartPageObjects{

	public DeleteItemFromCart(WebDriver driver) {
		super(driver);
	}
	Logger log = Logger.getLogger(DeleteItemFromCart.class.getName());

	private void searchProduct() throws UserDefinedException {
		try {
			sendKeysMethod(searchTxtBox, Constant.searchProduct);
			clickableMethod(searchButton);
			log.info("SEARCH PRODUCT METHOD IS PASSED");
		} catch (UserDefinedException e) {
			throw new UserDefinedException("SEARCH PRODUCT METHOD IS FAILED"+e.getLocalizedMessage());
		}
	}

	private void productToBeSelect() throws UserDefinedException {
		try {
			scrollByVisibleElement(driver,productToBeSelected);
			clickableMethod(productToBeSelected);
			log.info("PRODUCT TO BE  SELECT METHOD IS PASSED");
		} catch (UserDefinedException e) {
			throw new UserDefinedException("PRODUCT TO BE  SELECT METHOD IS FAILED"+e.getLocalizedMessage());
		}


	}

	private  void clickAddtoCartButton() throws UserDefinedException {

		try {
			clickableMethod(addToCartButton);
			log.info("--CLCIK ADD TO CART BUTTON METHOD IS SUCCESSFULLY EXICUTED--");
		} catch (UserDefinedException e) {
			throw new UserDefinedException("--CLCIK ADD TO CART BUTTON METHOD IS FAILED--");
		}


	}

	private void removeProductWindowsHandler() throws InterruptedException, UserDefinedException {
		try {
			String parent=driver.getWindowHandle();
			Set<String> allWindows=driver.getWindowHandles();

			for(String child:allWindows)
			{
				if(!parent.equalsIgnoreCase(child))
				{
					driver.switchTo().window(child);
					clickAddtoCartButton();
					clickableMethod(cart);
					clickableMethod(deleteButton);
					String actualString=gettingTextOfElement(driver, assertMsg);
					System.out.println(actualString);
					Assert.assertEquals(actualString,"Your Amazon Basket is empty");
					Thread.sleep(3000);
					driver.close();
					log.info("--REMOVE PRODUCT WINDOW HANDLER METHOD IS SUCCESSFULLY EXICUTED--");
				}

			}
			driver.switchTo().window(parent);
		} catch (UserDefinedException e) {
			throw new UserDefinedException("--REMOVE PRODUCT WINDOW HANDLER METHOD IS FAILED--"+e.getLocalizedMessage());
		} 
	}

	public void addToCartAndDeleteTheItemFromTheCart() throws UserDefinedException, InterruptedException {
		try {
			searchProduct();
			productToBeSelect();
			removeProductWindowsHandler();
			log.info("--ADD TO CART AND DELETE THE ITEM FROM THE CART METHOD IS  PASSED--");
			//driver.close();
		} catch (UserDefinedException e) {
			throw new UserDefinedException("--ADD TO CART AND DELETE THE ITEM FROM THE CART METHOD IS FAILED--"+e.getLocalizedMessage());
		}


	}


}
