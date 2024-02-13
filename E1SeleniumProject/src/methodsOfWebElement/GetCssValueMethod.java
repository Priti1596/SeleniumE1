package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;


		public class GetCssValueMethod {
			public static void main(String[] args)  {
			
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.get("http://desktop-a371l5s/login.do");
		
			
				 WebElement loginButton = driver.findElement(By.id("loginButton"));
				  String cssValue = loginButton.getCssValue("background");// to get the cssvalue used for
				  System.out.println(cssValue);// to print the recieved value in the console
				  
				   String color = loginButton.getCssValue("color");// to get the color(value) of login button
				   System.out.println(color);// to print the value in console
				   
			}

		}
	