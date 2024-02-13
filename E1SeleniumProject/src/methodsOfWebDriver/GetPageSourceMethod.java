package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod 
{

	public static void  main(String[] args) throws InterruptedException
	{
		
	     WebDriver driver = new ChromeDriver(); //To launch chrome browser
				
				Thread.sleep(2000); // To stop the execution for 5 seconds
				
				driver.get("https://www.flipkart.com/"); //To launch the application
                
				Thread.sleep(2000);

                String pageSource = driver.getPageSource();

				System.out.println(pageSource);

	}
}