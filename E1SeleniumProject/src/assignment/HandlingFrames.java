package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		driver.findElement(By.xpath("//section[text()='iframes']")).click();
		
		//To find the frame and store in variable
		WebElement frameOne = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		
		//To switch the control to web element
		driver.switchTo().frame(frameOne);
		
		//To find the element present inside frame
		driver.findElement(By.id("username")).sendKeys("USERNAME");
		driver.findElement(By.id("password")).sendKeys("PASSWORD");
		
		//To switch the control back to webpage
		driver.switchTo().defaultContent();
		
		//To click on nested iframe options on main page
		driver.findElement(By.partialLinkText("Nested iframe")).click();
		
	}

}
