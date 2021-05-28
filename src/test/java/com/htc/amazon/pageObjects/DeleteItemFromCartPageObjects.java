package com.htc.amazon.pageObjects;

import org.openqa.selenium.By;

public interface DeleteItemFromCartPageObjects {
	
	public By searchTxtBox=By.xpath("//input[@id=\"twotabsearchtextbox\"]");
	public By searchButton=By.xpath("//input[@id=\"nav-search-submit-button\"]");
	public By productToBeSelected=By.xpath("(//a[@class=\"a-link-normal a-text-normal\"])[5]");
	public By addToCartButton=By.id("add-to-cart-button");
	public By cartButton=By.xpath("//a[@id='hlb-view-cart-announce']");
	public By seeAllBuyingOptions=By.id("buybox-see-all-buying-choices");
	public By cart=By.xpath("//*[@id='attach-view-cart-button-form']");
	//public By cartButton=By.id("hlb-view-cart-announce");
	public By deleteButton=By.xpath("(//input[@class='a-color-link'])[1]");
	public By assertMsg=By.className("sc-your-amazon-cart-is-empty");
}
