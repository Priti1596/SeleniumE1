package takesSceenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByWebElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();// to Upcast WebDriver interface
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://instagram.com/");//To launch Instagram
		Thread.sleep(5000);
		
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Log in']"));// To find login button
		
		File src= loginButton.getScreenshotAs(OutputType.FILE);//To take Screenshot of WebElement
		File dest = new File("./screenshots/loginButton.png");//To Specify location, name
		Files.copy(src, dest);

	}

}
