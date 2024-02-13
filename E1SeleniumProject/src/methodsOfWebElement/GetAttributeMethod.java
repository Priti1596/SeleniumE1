package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://127.0.0.1/login.do;jsessiond=krxcqrslr0wo");
		
	    
		 WebElement passwordTb = driver.findElement(By.name("pwd"));
		 String attributevalue = passwordTb.getAttribute("class");
		 System.out.println(attributevalue);
	}

}
