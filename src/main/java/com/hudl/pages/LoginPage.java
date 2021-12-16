package com.hudl.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hudl.base.TestBase;

public class LoginPage extends TestBase {
	
	//Defining OR
	
	@FindBy(id = "email")
	
	// Optional to Improve the performance
	
	@CacheLookup
	WebElement email;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy (id="logIn")
	WebElement login;
	
	//Initializing the Page
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String eml, String pwd) {
		
		email.sendKeys(eml);
		password.sendKeys(pwd);
		login.click();
		
		return new HomePage();
	}

}
