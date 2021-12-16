package com.hudl.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hudl.base.TestBase;
import com.hudl.pages.HomePage;
import com.hudl.pages.LoginPage;

public class HomePageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	public HomePageTest() {
		super();
	}
	
@BeforeMethod
	
	public void setUp() {
		initialization();
		 loginPage = new LoginPage();
		 homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}

    @Test (priority=2)
    public void verifyHomepageTitleTest() {
    	String homePageTitle = homePage.verifyHomepageTitle();
    	
    	Assert.assertEquals(homePageTitle, "Home - Hudl","Home Page Title Not Matched");
    }
    
 
	@Test (priority=1)
    public void verifyUserNameTest() {
    	Assert.assertTrue(homePage.verifyUserNameAfterLogin());
    	
    	  }
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
