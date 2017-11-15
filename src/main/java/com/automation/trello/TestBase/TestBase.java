package com.automation.trello.TestBase;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public class TestBase {

	public WebDriver driver;
	public Properties prop;
	public WebDriverWait wait;
	
	
	@BeforeTest
	public void startBrowser() {
		loadProperties();
		init(prop.getProperty("browser"), prop.getProperty("baseURL"));
		wait = new WebDriverWait(driver, 10);
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
	public void init(String browser, String url) {
		startBrowser(browser);
		getUrl(url);

	}

	public void startBrowser(String browser) {

		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			
		} else if (browser.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		} 
	}

	public void getUrl(String url) {

		driver.manage().deleteAllCookies();
		driver.get(url);
		
	}



	public void loadProperties() {
		prop = new Properties();
		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir")
					+ "\\src\\main\\java\\com\\test\\automation\\DataProviders\\config.properties");
			prop.load(file);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
