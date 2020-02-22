package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotConcept {



	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://app.hubspot.com/login");
		Thread.sleep(5000);
		
		
		takePageScreenshot(driver,"loginPage");
		
	/*	WebElement emailId = driver.findElement(By.id("username"));
		WebElement passwordId = driver.findElement(By.id("password"));
		WebElement loginBtnId = driver.findElement(By.id("loginBtn"));
		
		emailId.sendKeys("test@gmail.com");
		passwordId.sendKeys("test@123");
		loginBtnId.click();
		
	takeElementScreenshot(emailId, "emailId");
		takeElementScreenshot(passwordId, "passwordId");
		takeElementScreenshot(loginBtnId, "loginBtnId");
	
		takePageScreenshot(driver,"loginPageError");
	
		driver.quit();
		*/
	}
	
	
public static void takePageScreenshot(WebDriver driver, String fileName)  {
	
	File  SrcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(SrcFile, new File("./target/screenshots/"+fileName+".png"));
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}

/* for taking element screenshot  we need to use Selenium 4
	public static void takeElementScreenshot(WebElement element, String fileName)  {
	
		File  SrcFile = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		
			try {
				FileUtils.copyFile(SrcFile, new File("./target/screenshots/"+fileName+".png"));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		*/
		
}

