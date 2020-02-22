package MySelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopupHandle_3 {
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		String text= alert.getText();
	System.out.println(text);
		
	if(text.equals("Please enter a valid user name")) {
		System.out.println("correct message..");
	}
	else {
		System.out.println("incorrect message");
	}
	alert.accept();//click on OK button
	
	//alert.dismiss();//cancel alerts, by clicking ESC or NO
	
	
	// right click inspect>console>alert('this is testing');
		//alert window is not web element, we can't inspect it
		//alert class responsible  for JS PopUps
		//steps to reproduce:
		//1.driver.switchTo().alert();
		//2.alert.getText();
		//3.alert.accept();
	}

}
