package com.test.automation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.trello.TestBase.TestBase;

public class SignUpPageObject extends TestBase {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(css="input#name")
	WebElement nameInput;
	
	@FindBy(css="input#email")
	WebElement emailInput;
	
	@FindBy(css="input#password")
	WebElement passwordInput;
	
	@FindBy(css="input#signup")
	WebElement signUpButton;
	
	@FindBy(css="input#accept-tos")
	WebElement termsAndConditionsCheckbox;
	
	@FindBy(css="p.error-message")
	public WebElement errorMessage;
	
	@FindBy(css="#email-error")
	public WebElement emailError;
	
	public SignUpPageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, 10);
		
	}
	
	public void signUpWithCredentials(String name, String email, String password) {
		wait.until(ExpectedConditions.visibilityOf(nameInput)).sendKeys(name);
		emailInput.sendKeys(email);
		passwordInput.sendKeys(password);
		signUpButton.click();
	}
	
	public void signUpInvalidMail(String name, String email, String password) {
		wait.until(ExpectedConditions.visibilityOf(nameInput)).sendKeys(name);
		emailInput.sendKeys(email);
		passwordInput.sendKeys(password);
	}
	
	

	

	
	
	
	

}
