package com.htc.amazon.pageObjects;

import org.openqa.selenium.By;

public interface ProductDiscriptionPageObjects {

	public By addToCartButton=By.xpath("//input[@id=\"add-to-cart-button\"]");
	public By buyNowButton=By.xpath("//input[@id=\"buy-now-button\"]");
	public By deliveryButton=By.xpath("(//div[@id=\"contextualIngressPtLabel_deliveryShortLine\"])[2]");
	public By differentDeliveryAdrress=By.xpath("(//input[@class=\"a-button-input\"])[42]");
	public By quantity=By.xpath("//select[@id=\"quantity\"]");
}
