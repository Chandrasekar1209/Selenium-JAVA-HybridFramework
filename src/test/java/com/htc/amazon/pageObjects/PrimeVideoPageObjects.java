package com.htc.amazon.pageObjects;

import org.openqa.selenium.By;

public interface PrimeVideoPageObjects {

	public By amazonPrimeAndMovies=By.xpath("//a[@class=\"nav-imageHref\"]");
	public By redirectToPrimeVideo=By.xpath("//a[@aria-label=\"LOL\"]");
	public By primeVideoIcon=By.xpath("(//div[@class=\"pv-brand-logo\"])[1]");
	public By welcomeTextOfPrimeVideo=By.xpath("//h1[text()='Welcome to Prime Video']");
	//public By yourOrders=By.xpath("//a[@id=\"nav_prefetch_yourorders\"]");
	
	public By primeButton=By.id("nav-link-prime");
	public By loginToJoinPrimeButton=By.className("a-button-text");
	public By explorePrimeVideo=By.xpath("(//a[text()='Explore Prime Video'])[1]");
	public By joinPrimeToWatchButton=By.xpath("//a[@aria-label='Join Prime']");
	public By assertPrime=By.xpath("//h1[text()='Welcome to Prime Video']");
	public By dropDownButton=By.id("pv-nav-accounts-cerberus");
	public By primeVideoSignOut=By.xpath("//a[@id='pv-nav-sign-out']");
	
	
	
}
