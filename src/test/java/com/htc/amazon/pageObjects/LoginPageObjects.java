package com.htc.amazon.pageObjects;

import org.openqa.selenium.By;

public interface LoginPageObjects {
	
	public By emailOrMobileNumberTxtBox=By.xpath("//input[@id=\"ap_email\"]");
	public By continueButton=By.xpath("//input[@id=\"continue\"]");
	public By passwordTxtBox=By.xpath("//input[@id=\"ap_password\"]");
	public By sigInButton=By.xpath("//input[@id=\"signInSubmit\"]");
	public By keepMeSignedInCheckBox=By.xpath("//input[@type=\"checkbox\"]");
	public By assertingAccountName=By.xpath("//h2[text()='Hi, Sekar']");
	
	

}
