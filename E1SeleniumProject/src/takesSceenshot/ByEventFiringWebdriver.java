package takesSceenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.google.common.io.Files;

@SuppressWarnings("deprecation")
public class ByEventFiringWebdriver {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();// to upcast webdriver interface
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://instagram.com/");
		
		EventFiringWebDriver efwd = new EventFiringWebDriver(driver);// to create object of EventFiringWebDriver
		
		File src = efwd.getScreenshotAs(OutputType.FILE);//to take screenshot of web page
		
		File dest = new File("./screenshots/instagram.png");//To specify the location, name, and extension
			
		Files.copy(src, dest);//to save the screen shot into screenshot folder
		//OR
		//FileHandler.copy(src, dest);
		

	}

}
