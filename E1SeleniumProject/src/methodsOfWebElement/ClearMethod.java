package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.do;jsessiond=krxcqrslr0wo");
		
	     // To find username textBox and store in a variable
		 WebElement userTb = driver.findElement(By.name("username"));
		 userTb.sendKeys("admin");
		 
		  Thread.sleep(2000);
		  userTb.clear();//To clear text present in username textBox
		  
		 

	}

}
