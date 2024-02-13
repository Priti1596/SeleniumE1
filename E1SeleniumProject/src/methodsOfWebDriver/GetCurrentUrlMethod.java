package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod 
{

	public static void  main(String[] args) throws InterruptedException
	{
		
	     WebDriver driver = new ChromeDriver(); //To launch chrome browser
				
				Thread.sleep(2000); // To stop the execution for 5 seconds
				
				driver.manage().window().maximize();
				
				Thread.sleep(1000);
				
				driver.get("https://www.flipkart.com/"); //To launch the application
                
				Thread.sleep(2000);

                String currentUrl = driver.getCurrentUrl();

				System.out.println(currentUrl);

	}
}