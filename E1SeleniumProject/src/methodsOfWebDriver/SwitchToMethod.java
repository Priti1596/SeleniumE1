package methodsOfWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void  main(String[] args) throws InterruptedException
	{
		
	     WebDriver driver = new ChromeDriver(); //To launch chrome browser
				
				Thread.sleep(2000); // To stop the execution for 5 seconds
				
				driver.manage().window().maximize();
				
				Thread.sleep(1000);
				
				driver.get("https://www.google.co.in/");
				
				Thread.sleep(2000);
				
			 driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	}
}