package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

  public class GetSizeMethod {
	   public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.do;jsessiond=krxcqrslr0wo");
		
	     // To find username textBox and store in a variable
		 WebElement userTb = driver.findElement(By.name("username"));
		 userTb.sendKeys("admin");
		 
		 Dimension size = userTb.getSize();
		 int height = size.getHeight();
		 int width = size.getWidth();
		 System.out.println("Height is :"+height  +"Width is :"+width);
		 
	}
}
