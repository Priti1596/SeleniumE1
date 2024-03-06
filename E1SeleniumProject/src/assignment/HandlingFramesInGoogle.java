package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class HandlingFramesInGoogle {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
//		driver.switchTo().frame(0); 
//		
//		driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();
//		driver.switchTo().parentFrame();
//		Thread.sleep(3000);
		
		//To click on google apps options
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		
		//To switch the control to frames
		driver.switchTo().frame("app");
		
		//To click on Maps app
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		Thread.sleep(3000);
		
		
		//To take the screenshot of the map
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/maps.png");
		Files.copy(src, dest); 
		
		
		//To navigate backwords
		driver.navigate().back();
		
		driver.close();
		
		
	}

}
