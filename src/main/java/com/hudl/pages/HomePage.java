package com.hudl.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.hudl.base.TestBase;
import com.hudl.util.TestUtil;

public class HomePage extends TestBase {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
	
	@FindBy(xpath="//span[contains(text(),'Coach B')]")
	WebElement userNameLabel;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomepageTitle() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Coach B')]")));
		return driver.getTitle();
	}
	
	public boolean verifyUserNameAfterLogin() {
		return userNameLabel.isDisplayed();
	}

	
	
}
