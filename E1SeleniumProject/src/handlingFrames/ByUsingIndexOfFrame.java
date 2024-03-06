package handlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingIndexOfFrame {

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.dream11.com/");
	
	//To pass the index of frame 
	driver.switchTo().frame(0);
	
	//To perform operation on element designed inside frame
	driver.findElement(By.id("regEmail")).sendKeys("8000000000");

	}

}
