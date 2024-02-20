package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePromptAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//To launch the browser
		driver.manage().window().maximize();// To maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));// To provide Implicit wait
		driver.get("https://omayo.blogspot.com/");//To launch the web application
		 
		
		//To generate prompt alert Popup
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(2000);
		
		//To switch the control to Alert Popup
		Alert promptAlert = driver.switchTo().alert();
		
		//To get the text of the popup and print in console
		String promptText = promptAlert.getText();
		System.out.println(promptText);
		Thread.sleep(2000);
		
		//To pass the input to prompt alert popup
		promptAlert.sendKeys("My name is Priti");
		Thread.sleep(2000);
		
		//To click on OK button
		promptAlert.accept();
		
		
		//To click on dismiss button
		//alertPopup.dismiss();
		
		
		driver.close();
	}

}
