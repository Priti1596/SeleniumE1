package synchronization;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//To launch the Chrome browser
		driver.manage().window().maximize();//To maximize the browser
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));//To declare implicit wait
		WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));//To declare explicit wait
		
		driver.get("http://www.shopperstack.com/");// to launch browser
		
		
		driver.findElement(By.xpath("//span[text()='Apple iPhone 14 Pro']")).click();
		driver.findElement(By.id("Check delivery")).sendKeys("411033");
		
		//1st way to use Explicit wait or provide waiting condition
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[[@id = 'Check']")));
		//driver.findElement(By.xpath("//button[@id = 'Check']")).click();
		
		//2st way to use Explicit wait or provide waiting condition
		
		WebElement checkButton =driver.findElement(By.xpath("//button[@id = 'Check']"));
		wait.until(ExpectedConditions.elementToBeClickable(checkButton));
		checkButton.click();
		
	}

}
