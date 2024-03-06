package handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByPassingFrameElement {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
		
		//To identify the web element by writing xpath
		WebElement FrameName = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
		
		//To pass the reference of frame element
		driver.switchTo().frame(FrameName);
		
		//To perform operation on element designed inside frame
		driver.findElement(By.id("regEmail")).sendKeys("8000000000");

	}

}
