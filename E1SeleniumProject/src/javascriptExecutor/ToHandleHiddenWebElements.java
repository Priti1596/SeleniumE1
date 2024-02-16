package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenWebElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//To launch the browser
		driver.manage().window().maximize();// To maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));// To provide Implicit wait
		driver.get("hhttps://www.facebook.com/");//To launch the web application
		 
		Thread.sleep(2000);
		
		WebElement hiddenElement = driver.findElement(By.xpath("//input[@name= 'custom_gender']"));
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		
		js.executeScript("arguments[0].value='qsiders'",hiddenElement);
		
		

	}

}
