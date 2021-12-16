package com.hudl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hudl.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//span[contains(text(),'Coach B')]")
	WebElement userNameLabel;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomepageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyUserNameAfterLogin() {
		return userNameLabel.isDisplayed();
	}

	
	
}
