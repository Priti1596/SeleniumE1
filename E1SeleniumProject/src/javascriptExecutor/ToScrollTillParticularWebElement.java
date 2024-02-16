package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollTillParticularWebElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//To launch the browser
		driver.manage().window().maximize();// To maximize browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// To provide Implicit wait
		driver.get("https://www.selenium.dev/");//To launch the web application
		
		WebElement scrollTarget = driver.findElement(By.xpath("//h2[text() = 'News']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;// To typecast from Webdriver to JavascriptExecutor
		
		
		js.executeScript("arguments[0].scrollIntoView(false)",scrollTarget);
		

		driver.close();
	}

}
