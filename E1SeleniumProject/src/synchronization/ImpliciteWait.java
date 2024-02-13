package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImpliciteWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//To launch the Chrome browser
		driver.manage().window().maximize();//To maximize the browser
		
		//To apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://www.instagram.com/");
		
		 driver.findElement(By.name("username")).sendKeys("Qsider");
		

	}

}
