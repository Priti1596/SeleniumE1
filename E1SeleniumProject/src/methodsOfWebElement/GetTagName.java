package methodsOfWebElement;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class GetTagName {

		public static void main(String[] args) {

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("http://desktop-a371l5s/login.do");
			
			 WebElement loginButton = driver.findElement(By.id("loginButton"));
			 String loginTag =loginButton.getTagName();
			 System.out.println(loginTag);
			  
			 WebElement usn = driver.findElement(By.name("username"));
			 String usnTag = usn.getTagName();
			 System.out.println(usnTag);

  }
}