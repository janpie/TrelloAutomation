package com.test.automation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.trello.TestBase.TestBase;

public class HomePageObject extends TestBase {
	
	WebDriver driver;
	
	
	@FindBy(xpath="//a[contains(@href, 'signup?')]")
	public WebElement signUpButton;
	
	@FindBy(xpath="//a[contains(@href, 'login?')]")
	public WebElement logInButton;
	
	public HomePageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver, 10);
		
	}
	
	public void clickOn(WebElement button) {
		wait.until(ExpectedConditions.elementToBeClickable(button)).click();
	}
	
	
	
	

}
