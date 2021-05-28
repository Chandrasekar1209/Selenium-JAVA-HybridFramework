package com.htc.amazon.pageObjects;

import org.openqa.selenium.By;

public interface ProductSelectionPageObjects {
	
	public By productToBeSelected=By.xpath("(//a[@class=\"a-link-normal a-text-normal\"])[5]");
	public By shopByPrice=By.xpath("(//li[@class=\"a-carousel-card textnav-pill\"])[2]");
	public By avgCustomerReview=By.xpath("//li[@id=\"p_72/1318476031\"]");
	
}
