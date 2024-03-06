package handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingNameOrId {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
		
		//To pass the name or id  of frame element
		driver.switchTo().frame("send-sms-iframe");
		Thread.sleep(2000);
		
		//To perform operation on element designed inside frame
		driver.findElement(By.id("regEmail")).sendKeys("8000000000");

	}

}
