package SeleniumSessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForwardButton {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/nigorabowles/Downloads/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();//launch Chrome
		
		driver.get("http://www.google.com");// enter url	
		
		driver.navigate().to("http://www.amazon.com");
		driver.navigate().back(); //we can use different way:
		
		//Navigation nav = driver.navigate();
		//nav.back();
		
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
		

	}

}
