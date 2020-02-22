package SeleniumSessions;
// this is ActionEvents
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsEvents {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://app.hubspot.com/login");
		Thread.sleep(5000);
		
		WebElement emailId = driver.findElement(By.id("username"));
		WebElement passwordId = driver.findElement(By.id("password"));
		WebElement loginBtnId = driver.findElement(By.id("loginBtn"));
	
		Actions action = new Actions(driver);
		action.sendKeys(emailId, "test@gmail.com").build().perform();
		action.sendKeys(passwordId, "test@123").build().perform();
		action.click(loginBtnId).build().perform();
		
		
		
		
	}

}
