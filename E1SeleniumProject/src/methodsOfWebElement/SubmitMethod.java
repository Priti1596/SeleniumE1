package methodsOfWebElement;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 public class SubmitMethod {
   public static void main(String[] args) {

					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
					driver.get("http://www.instagram.com/");
					
					driver.findElement(By.name("username")).sendKeys("Qsiders");
					
					driver.findElement(By.name("password")).sendKeys("Idon'tknow");
					
					 WebElement loginButton = driver.findElement(By.xpath("//div[text() = 'Log in']"));
					 loginButton.submit();
					
   }
 }