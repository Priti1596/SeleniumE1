package handlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//To launch the browser
		driver.manage().window().maximize();// To maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));// To provide Implicit wait
		driver.get("https://www.makemytrip.com/");//To launch the web application
		 
		
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='February 2024']/ancestor:: div[@class='DayPicker-Month']/descendant:://p[text()=25]")).click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
