package assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePromptAlertPopupAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		 driver.findElement(By.xpath("//section[text()='Popups']"));
		 Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//section[text()='Javascript']"));
		 Thread.sleep(2000);
		 
		//To generate prompt alert Popup
				driver.findElement(By.xpath("//a[text()='Prompt']")).click();
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

