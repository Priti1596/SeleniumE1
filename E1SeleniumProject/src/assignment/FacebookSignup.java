package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/signup");
		
		WebElement dayDropdown = driver.findElement(By.id("day"));
		WebElement monthDropdown = driver.findElement(By.id("month"));  
		WebElement yearDropdown = driver.findElement(By.id("year"));
		
		Select daySelect = new Select(dayDropdown);
		boolean result1 = daySelect.isMultiple();
		System.out.println("dayDropdown is multiple ? : "+result1);
		
	   List<WebElement>	dayOptions = daySelect.getOptions();
	   for (WebElement we : dayOptions)
	   {
		   System.out.println(we.getText());
		   
		 }
	   
	   daySelect.selectByIndex(0);
	   System.out.println("-----------------------------------------------------------------------------------------");
	   System.out.println();
	   
	   
	   Select monthSelect = new Select(monthDropdown);
		boolean result2 = monthSelect.isMultiple();
		System.out.println("monthDropdown is multiple ? : "+result2);
		
	   List<WebElement>	monthOptions = monthSelect.getOptions();
	   for (WebElement we : monthOptions)
	   {
		   System.out.println(we.getText());
		   
		 }
	   
	   monthSelect.selectByValue("5");
	   System.out.println("-----------------------------------------------------------------------------------------");
	   System.out.println();
	   
	   
	   Select yearSelect = new Select(yearDropdown);
		boolean result3 = yearSelect.isMultiple();
		System.out.println("yearDropdown is multiple ? : "+result3);
		
	   List<WebElement>	yearOptions = yearSelect.getOptions();
	   for (WebElement we : yearOptions)
	   {
		   System.out.println(we.getText());
		   
		 }
	   
	   yearSelect.selectByVisibleText("1996");
	   System.out.println("-----------------------------------------------------------------------------------------");
	   System.out.println();
	   
		
		
	}

}
