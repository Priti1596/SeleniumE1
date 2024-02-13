package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		
		
    driver.findElement(By.xpath("//section[text()='Mouse Action']")).click();
    driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
    driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
    
    WebElement MobileChargerS = driver.findElement(By.xpath("//div[text() = 'Mobile Charger']"));
    WebElement LaptopChargerS = driver.findElement(By.xpath("//div[text() = 'Laptop Charger']"));
    
    WebElement MobileCoverS = driver.findElement(By.xpath("//div[text() = 'Mobile Cover']"));
    WebElement LaptopCoverS = driver.findElement(By.xpath("//div[text() = 'Laptop Cover']"));
    
    WebElement MobileAccessoriesT = driver.findElement(By.xpath("//div[text() = 'Mobile Accessories']"));
    WebElement LaptopAccessoriesT = driver.findElement(By.xpath("//div[text() = 'Laptop Accessories']"));
    
    Actions act = new Actions(driver);
     
    act.dragAndDrop(LaptopChargerS,LaptopAccessoriesT).perform();
    act.dragAndDrop(MobileChargerS,MobileAccessoriesT).perform();
    act.dragAndDrop(LaptopCoverS,LaptopAccessoriesT).perform();
    act.dragAndDrop(MobileCoverS,MobileAccessoriesT).perform();
    
    Thread.sleep(4000);
    driver.quit();
	}

}
