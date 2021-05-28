package com.htc.amazon.pageObjects;

import org.openqa.selenium.By;

public interface DownloadAmazonAppPageObjects {
	
	public By downloadTheApp=By.xpath("//a[text()='Amazon App Download']");
	public By emailAddress=By.xpath("//input[@type=\"email\"]");
	public By sendTheLink=By.xpath("//input[@class=\"a-button-input\"]");
	public By assertingMessage=By.xpath("//span[@id=\"mgt-email-sms-success-text\"]");

}
