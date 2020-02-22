package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage1 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://app.hubspot.com/login");
		
		
		
		
		//page objects:
		By emailId = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		
		Utill util = new Utill(driver);
		
		String title = util.waitForTitlePresent("HubSpot", 10);
		System.out.println(title);
		/*
		util.getElement(emailId).sendKeys("test@gmail.com");
		util.getElement(password).sendKeys("test@123");
		util.getElement(loginButton).click();
		*/
		util.waitForElementPresent(emailId, 15);
		util.doSendKeys(emailId, "test@gmail.com");
		util.doSendKeys(password, "test@123");
		
		util.waitForElementPresent(loginButton, 5);
		util.doClick(loginButton);
	}

}
