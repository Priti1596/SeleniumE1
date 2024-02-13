package takesSceenshot;

import java.time.Duration;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByDownCasting {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.flipkart.com/");
		
		RemoteWebDriver rwd =(RemoteWebDriver) driver;// to perform downcasting
		
		File src= rwd.getScreenshotAs(OutputType.FILE);// to take screenshot of web page
		
		File dest = new File("./screenshots/Flipkart.jpg");// To specify the location, name, and extension
		
		Files.copy(src, dest);//To copy and paste the screenshot in the specified folder

	}

}
