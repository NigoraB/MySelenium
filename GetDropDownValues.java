package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDropDownValues {

	
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			WebElement day = driver.findElement(By.id("day"));
			WebElement year = driver.findElement(By.id("year"));
			WebElement month = driver.findElement(By.id("month"));
			
			getDropDownValues(day);
			getDropDownValues(month);
			getDropDownValues(year);
	}

		/**
		 * This method is used to all the values from drop down
		 * @param element
		 */
		public static void getDropDownValues(WebElement element) {
			System.out.println("======================");
			Select select = new Select(element);
			List<WebElement> dropList = select.getOptions();
			System.out.println("total number of values in drop down is: "+ dropList.size());
			for(int i=0; i<dropList.size(); i++) {
				String text = dropList.get(i).getText();
				System.out.println(text);
				
			}
		}
		
		
		
}
