package assignment;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartWithSynchronization {

		public static void main(String[] args) throws InterruptedException {
			
			WebDriver abc = new EdgeDriver();
			abc.manage().window().maximize();
			abc.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// Implicit wait for findElement() & findElements()
			
			WebDriverWait wait=	 new WebDriverWait(abc,Duration.ofSeconds(10));
			//explicitWait.until(ExpectedConditions.elementToBeClickable(null))
			abc.get("https://www.flipkart.com/");
			
			
			 abc.findElement(By.xpath("//input[@name='q']")).sendKeys("Laptop");
			 abc.findElement(By.xpath("//button[@class='2iLD_']")).click();
			
			WebElement fliterBrandDropdown = abc.findElement(By.xpath("//div[text()='Brand']"));
			fliterBrandDropdown.click();
			
			WebElement clickOnHPBrand = abc.findElement(By.xpath("//div[text()='HP']"));
			clickOnHPBrand.click();
			
			WebElement clickOnPROCESSOR = abc.findElement(By.xpath("//div[text()='Processor Generation']"));
			clickOnPROCESSOR.click();
			
			abc.findElement(By.xpath("//div[text()='10th Gen']")).click();
			
			WebElement clickOnOperatingSysteam = abc.findElement(By.xpath("//div[text()='Operating System']"));
			clickOnOperatingSysteam.click();
			
			WebElement clickOnWindows10 = abc.findElement(By.xpath("//div[text()='Windows 10']"));
			clickOnWindows10.click();
			
			List<WebElement> laptopHP = abc.findElements(By.xpath("//div[@class='_4rR01T']"));
			List<WebElement> laptopPrice = abc.findElements(By.xpath("//div[@class='_3pLy-c row'] / descendant :: div[@class='_30jeq3 _1_WHN1']"));
			
			for (int i = 0; i < laptopHP. size (); i++)
			{
			String ops = laptopHP.get(i).getText () ;
			
			for (int j = i ; j <= i ; j++) 
			{
			  String price = laptopPrice.get (j).getText ();
			System.out.print (ops +":" + price );
			Thread. sleep (2000) ;
			}
			System. out. println ("") ;
			}
//			for (WebElement as : laptopPrice) 
//			{
//			    String priceOptions = as.getText();
////			    System.out.println(priceOptions);
//			    Thread.sleep(1000);
//			
	//
//			for (WebElement we : laptopHP) {
//			    String options = we.getText();
//			    System.out.println(options + "--->" + priceOptions);
//			    Thread.sleep(1000);
//			}
//			}
			                   //OR
			//WebDriver driver = new EdgeDriver();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// Implicit wait for findElement() & findElements()
//			
//			WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//			//explicitWait.until(ExpectedConditions.elementToBeClickable(null))
//			driver.get("https://www.flipkart.com/");
//			
//			
//			WebElement click = driver.findElement(By.xpath("//input[@name='q']"));
//			click.sendKeys("Laptop");
//			
//			WebElement searchbtn = driver.findElement(By.xpath("//button[@type='submit_']"));
//			searchbtn.click();
//			
//			WebElement brand = driver.findElement(By.xpath("//div[text()='Brand']"));
//			brand.click();
//			driver.findElement(By.xpath("//div[text() = 'HP' and @class='_389cV']")).click();
//			Thread.sleep(1000);
//			
//			driver.findElement(By.xpath("//div[text() = 'Core i5']/preceding-sibling::div[@class='_24_Dny']")).click();
//			Thread.sleep(1000);
//			
//			driver.findElement(By.xpath("//div[text() = 'Operating System']")).click();
//			
//			driver.findElement(By.xpath("//div[text() = 'Windows 10']" )).click();
//		
//			
			
			

	}

}
