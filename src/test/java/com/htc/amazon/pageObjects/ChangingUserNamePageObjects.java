package com.htc.amazon.pageObjects;

import org.openqa.selenium.By;

public interface ChangingUserNamePageObjects {
	public By loginAndSecurity=By.xpath("(//a[@class='ya-card__whole-card-link'])[2]");
	public By editButton=By.xpath("//input[@id='auth-cnep-edit-name-button']");
	public By newNameField=By.className("a-input-text");
	public By saveChangesButton=By.cssSelector("#cnep_1C_submit_button");
	public By assertMsg=By.xpath("//h4[text()='Success']");
	public By doneButtton=By.id("auth-cnep-done-button");
	public By assertingAccountName=By.xpath("//h2[text()='Hi, Sekar']");

}
