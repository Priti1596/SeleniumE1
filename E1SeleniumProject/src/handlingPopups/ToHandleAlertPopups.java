package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//To launch the browser
		driver.manage().window().maximize();// To maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));// To provide Implicit wait
		driver.get("https://omayo.blogspot.com/");//To launch the web application
		 
		
		//To generate alert Popup
		driver.findElement(By.id("alert1")).click();
		Thread.sleep(2000);
		
		//To switch the control to Alert Popup
		Alert alertPopup = driver.switchTo().alert();
		
		//To click on OK button
		alertPopup.accept();
		
		
		//To click on dismiss button
		//alertPopup.dismiss();
		
		
		driver.close();
		
		

	}

}
