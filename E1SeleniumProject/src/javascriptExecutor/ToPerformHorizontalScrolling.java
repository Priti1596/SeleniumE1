package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformHorizontalScrolling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();//To launch the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// To provide Implicit wait
		driver.get("https://omayo.blogspot.com/");//To launch the web application
		
		JavascriptExecutor js = (JavascriptExecutor)driver;// To typecast from Webdriver to JavascriptExecutor
		
		// To perform ScrollRight operation
		js.executeScript("window.scrollBy(500,0)");
		
		Thread.sleep(2000);
		
		// To perform ScrollLeft operation
		js.executeScript("window.scrollBy(-150,0)");
		Thread.sleep(2000);
		
		
		driver.close();

	}

}
