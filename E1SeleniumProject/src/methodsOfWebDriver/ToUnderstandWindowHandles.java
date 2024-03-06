package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToUnderstandWindowHandles {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://omayo.blogspot.com/");
		 
		String parentWindow =driver.getWindowHandle();//To get the address of parent window
		System.out.println(parentWindow);//To print the parent window address in console
		String parentTitle = driver.getTitle();//To get the title of parent window
		
		 Set<String> allWindows = driver.getWindowHandles();//To handle the address of all window
		  
		 //To iterate and switch the control to the window one by one
		for (String wh :allWindows ) 
		   {
		     String title = driver.switchTo().window(wh).getTitle();//To get the title of each window
			
			
			    //if(driver.getTitle().equals("omayo (QAFox.com)"))
			    if(!title.equals(parentTitle))//To compare the title with parent window title
			    {
				   driver.close();// To close child window
			
		        }
			
		    }
//		WebDriver driver= new ChromeDriver();
//		 driver.manage().window().maximize();
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		 driver.get("https://omayo.blogspot.com/");
//		 
//		String parentWindow =driver.getWindowHandle();//To get the address of parent window
//		System.out.println(parentWindow);//To print the parent window address in console
//		driver.findElement(By.partialLinkText("Open a popup window")).click();//To open a new window
//		 Set<String> allWindows = driver.getWindowHandles();//To handle the address of all window
//		
//		 //To iterate and switch the control to the window one by one
//		for (String wh :allWindows ) 
//		    {
//			     driver.switchTo().window(wh);//To get the title of each window
//			
//			
//			      if(driver.getTitle().equals("omayo (QAFox.com)"))
//			
//			      {
//				    driver.close();// To close child window
//			
//		          }
//			
//		      }
		

		
	}

}
