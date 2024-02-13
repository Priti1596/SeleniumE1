package takesSceenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.google.common.io.Files;

public class ByExplicitTypecasting {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://google.co.in/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;// To perform typecasting
		
		File src = ts.getScreenshotAs(OutputType.FILE);//to take screenshot of web page
		
			File dest = new File("./screenshots/google.png");//To specify the location, name, and extension
			
		Files.copy(src, dest);//to save the screen shot into screenshot folder
		//OR
		//FileHandler.copy(src, dest);
		
	}

}
