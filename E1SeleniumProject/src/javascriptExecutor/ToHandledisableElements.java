package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandledisableElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();//To launch the browser
		driver.manage().window().maximize();// To maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// To provide Implicit wait
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");//To launch the web application
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(2000);
		
		WebElement disableTextbox =driver.findElement(By.id("name"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;// To Typecast from WebDriver to JavascriptExecutor
	
     // To pass input disable element
	js.executeScript("document.getElementById('name').value='admin'");
	Thread.sleep(3000);
	
	//To clear content from disable Textbox
	//js.executeScript("document.getElementById('name').value=''");
	
	
	js.executeScript("arguments[0].value=''",disableTextbox);
	Thread.sleep(3000);
	driver.close();
	}

}
