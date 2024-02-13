package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://desktop-a371l5s/login.do");
		
		 WebElement loginButton = driver.findElement(By.id("loginButton"));
		Rectangle rect = loginButton.getRect();
		 System.out.println(rect.getHeight());
		 System.out.println(rect.getWidth());
		 
		 System.out.println(rect.getX());
		 System.out.println(rect.getY());
		
	}

}
