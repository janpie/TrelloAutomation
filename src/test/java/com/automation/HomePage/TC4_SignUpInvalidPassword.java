package com.automation.HomePage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.automation.trello.TestBase.TestBase;
import com.test.automation.PageObjects.HomePageObject;
import com.test.automation.PageObjects.SignUpPageObject;

public class TC4_SignUpInvalidPassword extends TestBase {

	
	
	@Test
	public void createAccount() {
		HomePageObject homePage = new HomePageObject(driver);
		SignUpPageObject signUp = new SignUpPageObject(driver);
		homePage.clickOn(homePage.signUpButton);
		signUp.signUpInvalidMail("Name Surname", "aaa", "anyPassword123");
		wait.until(ExpectedConditions.visibilityOf(signUp.emailError));
		Assert.assertTrue(signUp.emailError.isDisplayed());

	}
}
