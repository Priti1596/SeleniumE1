package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniqueAttribute {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.fireflink.com/signin");
		Thread.sleep(5000);
		
		WebElement email = driver.findElement(By.xpath("//input[@name='emailId']"));
		email.sendKeys("kartikahajare@gmail.com");
		Thread.sleep(1000);
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Priti@123");
		Thread.sleep(1000);
		 
		 WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		  loginButton.click();
	}
}
