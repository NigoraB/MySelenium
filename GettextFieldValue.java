package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GettextFieldValue {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("test@gmail.com");
		String value =driver.findElement(By.id("login1")).getAttribute("value");
		System.out.println(value);
		
		// get.Text()-works for links, buttons, error messages;
		// get.Attribute()-works for text fields
		
	}

}
