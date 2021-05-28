package com.htc.amazon.pageObjects;

import org.openqa.selenium.By;

public interface HomePageObjects {
	
	
	public By accountButton=By.xpath("//a[@id=\"nav-link-accountList\"]");
	public By returnsAndOrdersButton=By.xpath("//a[@id=\"nav-orders\"]");
	public By cartButton=By.xpath("//a[@id=\"nav-cart\"]");
	public By languageButton=By.xpath("//a[@id=\"icp-nav-flyout\"]");	
	public By searchTxtBox=By.xpath("//input[@id=\"twotabsearchtextbox\"]");
	public By searchButton=By.xpath("//input[@id=\"nav-search-submit-button\"]");
	public By searchAllDropDownButtton=By.xpath("//select[@id=\"searchDropdownBox\"]");
	public By selectYourAddressButton=By.xpath("//a[@id=\"nav-global-location-popover-link\"]");
	public By logoReloadButton=By.xpath("//a[@id=\"nav-logo-sprites\"]");
	public By signOutButton=By.xpath("//a[@id=\"nav-item-signout\"]");
	
	

}
