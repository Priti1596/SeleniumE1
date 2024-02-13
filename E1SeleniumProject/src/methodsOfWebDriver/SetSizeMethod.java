package methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeMethod {

  public static void  main(String[] args) throws InterruptedException
{
			
     WebDriver driver = new ChromeDriver(); //To launch browser
					
	    Thread.sleep(2000); // To stop the execution for 5 seconds
					
	driver.manage().window().maximize();//maximize the browser
					
	    Thread.sleep(1000); 
					
	  driver.get("https://www.flipkart.com/"); //To launch the application
	                
	  Thread.sleep(2000);
					
	Dimension targetSize =	new Dimension(500, 400);// To pass width and height to Dimension class
				
	   driver.manage().window().setSize(targetSize);

	      
       }
    }