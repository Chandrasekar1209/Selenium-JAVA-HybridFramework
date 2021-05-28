package com.htc.amazon.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.htc.amazon.base.BasePage;
import com.htc.amazon.pageObjects.ProductSelectionPageObjects;
import com.htc.exceptionHandler.UserDefinedException;

public class ProductSelection extends BasePage implements ProductSelectionPageObjects {

	public ProductSelection(WebDriver driver) {
		super(driver);
	}
	Logger log = Logger.getLogger(ProductSelection.class.getName());
	
	
	public void productSelection() throws UserDefinedException {
		try {
			scrollByVisibleElement(driver,productToBeSelected);
			clickableMethod(productToBeSelected);
			log.info("--PRODUCT SELECTION METHOD IS SUCCESSFULLY EXICUTED--");
		} catch (UserDefinedException e) {
			throw  new UserDefinedException("--PRODUCT SELECTION METHOD IS FAILED--"+e.getMessage());
		}
		
	}
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


//private void priceSelection() {
//	clickableMethod(shopByPrice);
//}
//private void byCustomerReview() {
//	clickableMethod(avgCustomerReview);
//}
//private void driverNavigation() {
//	WebElement navigate=driver.findElement(By.xpath("(//a[@class=\"a-link-normal a-text-normal\"])[3]"));
//	String newTab=navigate.getAttribute("href");
//	driver.navigate().to(newTab);
//}