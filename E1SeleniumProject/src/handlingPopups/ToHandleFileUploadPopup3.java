package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleFileUploadPopup3 {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("//input[@id='fileInput']")).sendKeys("C:\\Users\\Admin\\Downloads\\Test Engineering Freshers' resume (1).docx");
		
		 //or
		 
		// driver.findElement(By.id("fileInput")).sendKeys("C:\\Users\\Admin\\Downloads\\Test Engineering Freshers' resume (1).docx");
	


	}

}
