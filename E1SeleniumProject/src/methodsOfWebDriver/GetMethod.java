package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod 
{

	public static void  main(String[] args) throws InterruptedException
	{
		
	     WebDriver driver = new ChromeDriver(); //To launch chrome browser
				
				Thread.sleep(5000); // To stop the execution for 5 seconds
				
				driver.get("https://www.flipkart.com/"); //To launch the application

	}

}