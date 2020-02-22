package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLoginPageImplicityWait {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://app.hubspot.com/login");
		
		// applied for all elements
		//global wait
		//dynamic wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement emailId = driver.findElement(By.id("username"));
		//WebElement passwordId = driver.findElement(By.id("password"));
		//WebElement loginBtnId = driver.findElement(By.id("loginBtn"));
	
		emailId.sendKeys("test@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		
		
	}

}
