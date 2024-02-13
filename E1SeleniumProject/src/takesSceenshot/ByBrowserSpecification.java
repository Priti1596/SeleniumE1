package takesSceenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class ByBrowserSpecification {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();// to store the reference with  ChromeDriver class
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/");
		
		
		File src= driver.getScreenshotAs(OutputType.FILE);// to take screenshot of web page
		
		File dest = new File("./screenshots/Facebook.png");// To specify the location, name, and extension
		
		Files.copy(src, dest);//To copy and paste the screenshot in the specified folder



	}

}
