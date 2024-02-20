package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformVerticalScrollingOperations {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();//To launch the browser
		driver.manage().window().maximize();// To maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// To provide Implicit wait
		driver.get("https://www.selenium.dev/");//To launch the web application
		
		JavascriptExecutor js = (JavascriptExecutor)driver;// To typecast from Webdriver to JavascriptExecutor
		
		// To perform ScrollDownward operation
		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(2000);
		
		// To perform ScrollUpward operation
		js.executeScript("window.scrollBy(0,-500)");
		
		driver.close();

		
	}

}
