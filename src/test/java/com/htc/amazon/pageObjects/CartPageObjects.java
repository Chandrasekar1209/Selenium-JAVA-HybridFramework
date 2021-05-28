package com.htc.amazon.pageObjects;

import org.openqa.selenium.By;

public interface CartPageObjects {
	
	public By addInstalationButton=By.xpath("//*[@id=\"btnVasModalContinue\"]/span/input");
	public By noThanksButton=By.xpath("//*[@id=\"btnVasModalSkip\"]/span/input");
	public By cartButton=By.xpath("//a[@id=\"hlb-view-cart-announce\"]");
	public By cart=By.xpath("//*[@id='attach-view-cart-button-form']");
	public By shoppingCartProduct=By.xpath("(//span[@class=\"a-truncate-cut\"])[1]");
	public By shoppingCartTxt=By.xpath("//*[@id=\"sc-active-cart\"]/div/div[1]/div[1]/h1");
	
}
