package com.htc.amazon.pageObjects;

import org.openqa.selenium.By;

public interface CareerPageObjects {
	
	public By careers=By.xpath("//a[text()='Careers']");
	public By searchJobTitle=By.xpath("(//input[@id='search_typeahead'])[2]");
	public By location=By.xpath("(//input[@id='location-typeahead'])[2]");
	public By searchButton=By.id("search-button");
	public By jobSelection=By.xpath("(//h3[@class='job-title'])[1]");
	public By applyNow=By.id("apply-button");
	public By assertMessage=By.xpath("(//h5[@class='card-title'])[1]");

}
