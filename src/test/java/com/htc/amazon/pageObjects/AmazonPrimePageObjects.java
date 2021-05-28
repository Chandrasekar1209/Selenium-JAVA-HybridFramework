package com.htc.amazon.pageObjects;

import org.openqa.selenium.By;

public interface AmazonPrimePageObjects {
	
	public By  pimeIconInHomePage=By.xpath("//a[@id='nav-link-prime']");
	public By  backToTopButton=By.xpath("//a[@id='navBackToTop']");
	public By  termsAndConditions=By.xpath("//*[@id=\"primeDetailPage\"]/div[1]/div[2]/a");
	public By shippingAndDelivery=By.xpath("//a[(text()='Shipping and Delivery')]");
	public By shippingBenefits=By.xpath("//a[(text()=' Amazon Prime Shipping Benefits')]");
	public By yesButton=By.xpath("//span[@id='a-autoid-1']");
	public By noButton=By.xpath("//span[@id='a-autoid-2']");
	public By yesAssertMessage=By.xpath("//div[@id='hmd-ConfirmYesBox']");
	

}
