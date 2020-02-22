package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "/Users/nigorabowles/Downloads/chromedriver");
		
		
	WebDriver driver = new ChromeDriver();//launch Chrome
	
	driver.get("http://www.google.com");// enter url	
		
		String title = driver.getTitle();// get the title
		System.out.println(title);
		
		// validation point: act vs exp
		if(title.equals("Google")) {
			System.out.println("correct title");
		}else {
			System.out.println("incorrect title");
		}
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		//driver.quit();// 5.close the browser
		
		//driver.close();
		

	}

}
