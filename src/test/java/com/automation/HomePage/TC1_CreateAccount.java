package com.automation.HomePage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.trello.TestBase.TestBase;
import com.test.automation.PageObjects.HomePageObject;
import com.test.automation.PageObjects.SignUpPageObject;

public class TC1_CreateAccount extends TestBase {

	
	
	@Test
	public void createAccount() {
		HomePageObject homePage = new HomePageObject(driver);
		SignUpPageObject signUp = new SignUpPageObject(driver);
		homePage.clickOn(homePage.signUpButton);
		signUp.signUpWithCredentials("Name Surname", "myMail@mail11223.com", "SamplePassword123");
		wait.until(ExpectedConditions.titleContains("|"));
		Assert.assertEquals(driver.getCurrentUrl(), "https://trello.com/");

	}
}
