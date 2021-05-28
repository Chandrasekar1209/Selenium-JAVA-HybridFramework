package com.htc.amazon.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.htc.amazon.base.BasePage;
import com.htc.amazon.pageObjects.ChangingUserNamePageObjects;
import com.htc.exceptionHandler.UserDefinedException;

public class ChangingUserName extends BasePage implements ChangingUserNamePageObjects{

	public ChangingUserName(WebDriver driver) {
		super(driver);
	}
	Logger log = Logger.getLogger(ChangingUserName.class.getName());
	
	public  void changeUserName() throws UserDefinedException, InterruptedException {
		try {
			clickableMethod(loginAndSecurity);
			Thread.sleep(50000);
			log.info("--CHANGE USERNAME METHOD IS SUCCESSFULLY EXICUTED--");
			
		} catch (UserDefinedException e) {
			throw new UserDefinedException("--CHANGE USERNAME METHOD IS FAILED--"+e.getMessage());
		}
	}
		
		
	
	
}
