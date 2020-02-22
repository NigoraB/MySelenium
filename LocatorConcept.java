package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","/Users/nigorabowles/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login/");
		
		Thread.sleep(5000);
		
		//HTM DOM
		//1.id:
		
	
		By username = By.id("username");
		Util.getElement(driver, username).sendKeys("test@gmail.com");
		
		By password = By.id("password");
		Util.getElement(driver, password).sendKeys("test123");
		
		By loginButton = By.id("loginBtn");
		Util.getElement(driver, loginButton).click();
		
		//2/name:
		
		By username1 = By.name("username");
		Util.getElement(driver, username1).sendKeys("test@gmail.com");
		
		
		//3.xpath:
	//	driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test@gmail.com");
		
	//	WebElement element =driver.findElement(By.xpath("//*[@id='username']"));
	//	element.sendKeys("test@gmail.com");
		
		By username2 = By.xpath("//*[@id='username']");
		Util.getElement(driver, username2).sendKeys("test@gmail.com");
		
		
		// this is 1-approach
		//	WebElement userElement = driver.findElement(By.id("username"));
		//	userElement.sendKeys("naveen@gmail.com");
			
			//this is second approach
			//driver.findElement(By.id("username")).sendKeys("naveen@gmail.com");
			
			// this is 3-approach
			//By username = By.id("username");
			//WebElement userElement = driver.findElement(username);
			//userElement.sendKeys("test@gmail.com");
			
		//WebElement passwordElement = driver.findElement(By.id("password"));
		//passwordElement.sendKeys("test@123");
		
		
		//WebElement loginButton = driver.findElement(By.id("loginBtn"));
		//loginButton.click();
		
		//4.CSS Selector:
		By username3 = By.cssSelector("#username");
		Util.getElement(driver, username3).sendKeys("test@gmail.com");
		
		
		//5.class name
		//form-control private-form__control login-email
		//form-control private-form__control login-password m-bottom-3
		
		By username5 = By.className("login-email");
		Util.getElement(driver, username5).sendKeys("test@gmail.com");
		
		
		By password5 = By.className("login-password");
		Util.getElement(driver, password5).sendKeys("test123");
		
		
		//6. link Text works only for links
		
		By signUpLink = By.linkText("Sign Up");
		Util.getElement(driver, signUpLink).click();
		
		//7.partial link text: only for link
		
		By signUpLink1 = By.partialLinkText("Sign");
		Util.getElement(driver, signUpLink1).click();
		
		
		
	}

}
