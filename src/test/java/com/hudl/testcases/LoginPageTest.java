package com.hudl.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hudl.base.TestBase;
import com.hudl.pages.HomePage;
import com.hudl.pages.LoginPage;


public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	

	@BeforeMethod
	
	public void setup() {
		initialization();
		 loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String loginTitle = loginPage.validateLoginPageTitle();
		Assert.assertEquals(loginTitle, "Log In - Hudl","Log in Page Title Not matched");
		
	}
	
	@Test(priority=2)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

