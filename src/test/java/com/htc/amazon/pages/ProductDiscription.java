package com.htc.amazon.pages;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.htc.amazon.base.BasePage;
import com.htc.amazon.pageObjects.CartPageObjects;
import com.htc.amazon.pageObjects.ProductDiscriptionPageObjects;
import com.htc.exceptionHandler.UserDefinedException;

public class ProductDiscription extends BasePage implements ProductDiscriptionPageObjects,CartPageObjects{

	public ProductDiscription(WebDriver driver) {
		super(driver);
	}

	Logger log = Logger.getLogger(ProductDiscription.class.getName());


	private void productDiscriptionWindowsHandler() throws InterruptedException, UserDefinedException {
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
					clickableMethod(addToCartButton);
					clickableMethod(cart);
					String actualMessage=gettingTextOfElement(driver,shoppingCartTxt);
					System.out.println(actualMessage);
					System.out.println("Child window title is=="+driver.getTitle());
					Thread.sleep(3000);
					driver.close();
				}
			}
			driver.switchTo().window(parent);
			log.info("--PRODUCT DISCRIPTION WINDOWS HANDLER METHOD IS SUCCESSFULLY EXICUTED--");
			System.out.println("Parent window title is=="+driver.getTitle());
		} catch (UserDefinedException e) {
			e.printStackTrace();
			throw new UserDefinedException("--PRODUCT DISCRIPTION WINDOWS HANDLER METHOD IS FAILED--"+e.getMessage());
		}
	}

	public void AddToCartAction() throws InterruptedException, UserDefinedException {

		try {
			productDiscriptionWindowsHandler();
			log.info("--ADD TO CART ACTION METHOD IS SUCCESSFULLY EXICUTED--");
		} catch (UserDefinedException e) {
			throw new UserDefinedException("--ADD TO CART ACTION METHOD IS FAILED--"+e.getMessage());
		}


	}



}
