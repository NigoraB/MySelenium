package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String day = "//select[@id = 'day']/option";
		String month = "//select[@id = 'month']/option";
		String year = "//select[@id = 'year']/option";
		
		DropDownUtil.selectDropDownvalueWithoutSelect(driver, day, "13");
		DropDownUtil.selectDropDownvalueWithoutSelect(driver, month, "Jun");
		DropDownUtil.selectDropDownvalueWithoutSelect(driver, year, "1987");
	
	}
}