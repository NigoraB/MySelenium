package SeleniumSessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetAndNavigateTo {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "/Users/nigorabowles/Downloads/chromedriver");
		
		
		WebDriver driver = new ChromeDriver();//launch Chrome
		
		driver.get("http://www.amazon.com");// enter url	
		
		driver.navigate().to("http://www.amazon.com");
		
		System.out.println(driver.getTitle());
	}

}
