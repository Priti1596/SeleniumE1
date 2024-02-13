package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
	
		
		 WebDriver driver = new ChromeDriver(); //To launch chrome browser
		
		 driver.navigate().to("https://www.flipkart.com/"); //To launch the application

			
			Thread.sleep(3000); // To stop the execution for 5 seconds
			
			driver.navigate().back(); //To launch the application

			Thread.sleep(1000);
			
			driver.navigate().forward();
			
			Thread.sleep(1000);
			
			driver.navigate().refresh();
			

	}

}