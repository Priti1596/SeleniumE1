package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesInBlueStone {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		WebElement chatFrame = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		
		
		driver.switchTo().frame(chatFrame);
		driver.findElement(By.xpath("//div[@id='chat-icon']")).click();
		
		
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
        driver.findElement(By.id("chat-fc-name")).sendKeys("Priti");
        Thread.sleep(2000);
		

       driver.close();

	}

}
