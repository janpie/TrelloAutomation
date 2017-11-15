package com.test.automation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.trello.TestBase.TestBase;

public class LogInPageObject extends TestBase {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(css="input#user")
	WebElement usernameInput;
	
	@FindBy(css="input#password")
	WebElement passwordInput;
	
	@FindBy(css="input#login")
	WebElement logInButton;
	
	public LogInPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, 10);
		
	}
	

	public void logInWithCredentials(String username, String password) {
		wait.until(ExpectedConditions.visibilityOf(usernameInput)).sendKeys(username);
		passwordInput.sendKeys(password);
		logInButton.click();
	}
	
	

	

	
	
	
	

}
