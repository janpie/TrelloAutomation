package com.automation.HomePage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.trello.TestBase.TestBase;
import com.test.automation.PageObjects.HomePageObject;
import com.test.automation.PageObjects.LogInPageObject;

public class TC2_LogInWithAccount extends TestBase {

	
	
	@Test
	public void createAccount() {
		HomePageObject homePage = new HomePageObject(driver);
		LogInPageObject logIn = new LogInPageObject(driver);
		homePage.clickOn(homePage.logInButton);
		logIn.logInWithCredentials(prop.getProperty("username"), prop.getProperty("password"));
		wait.until(ExpectedConditions.titleContains("|"));
		Assert.assertEquals(driver.getCurrentUrl(), "https://trello.com/");

	}
}
