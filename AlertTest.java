package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertTest {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		String url = "https://mail.rediff.com/cgi-bin/login.cgi";
		By goBtn = By.name("proceed");
		
		driver = Util.launchBrowser(driver, "chrome");
		Util.launchURL(driver, url);
		System.out.println(Util.getPageTitle(driver));
		Util.doClick(driver, goBtn);
		
		Thread.sleep(4000);
		
		String text = Util.getAlertText(driver);
		if(text.equals("Please enter a valid user name")) {
			System.out.println("correct message");
		}else {
			System.out.println("incorrect message");
		}
		
		Util.closeBrowser(driver);
		
		
		
	}

}
