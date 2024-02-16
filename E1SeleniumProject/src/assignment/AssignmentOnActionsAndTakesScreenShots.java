package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class AssignmentOnActionsAndTakesScreenShots {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.bluestone.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
			
		Actions act = new Actions(driver);
		WebElement coins = driver.findElement(By.id("goldCoins"));
		act.moveToElement(coins).perform();
		Thread.sleep(2000);
		
		WebElement oneGmCoins = driver.findElement(By.xpath("//span[text()='1 gram']"));
		act.moveToElement(oneGmCoins).click().perform();
		  Thread.sleep(2000);
		
		File src = oneGmCoins.getScreenshotAs(OutputType.FILE);//To take Screenshot of WebElement
		File dest = new File("./screenshots/oneGmCoins.png");//To Specify location, name
		Files.copy(src, dest);
		
		driver.close();
		
	

}
}