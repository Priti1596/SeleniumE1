package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandDeselectionMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Admin/Desktop/note++%20selenium/MultiSelectDD1.html");
		  
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		Select sel = new Select(multiSelectDD);
		

		
		sel.selectByIndex(3);//To select an option by using theIndex value
		Thread.sleep(2000);//To stop for 2 sec
		sel.deselectByIndex(3);//To deselect the selected option by using theIndex value
		
		sel.selectByValue("v2");//To select an option by using the value of the option
		Thread.sleep(2000);//To stop for 2 sec
		sel.deselectByValue("v2");//To deselect the selected option by using the value of the option
		
		sel.selectByVisibleText("chai");//To select an option by using the Text of the option
        Thread.sleep(2000);//To stop for 2 sec
		sel.deselectByVisibleText("chai");//To deselect the selected option by using the Text of the option

		
		
		//To select all the option from the dropdownusing for loop
		//for(int i=0; i<=6; i++){
		//sel.deselectByIndex(i);
		//Thread.sleep(2000);
		//}
		
		
		//To deselect all the selected option from the dropdownusing for loop
		//for(int j=0; j<=6; j++){
		//sel.deselectByIndex(j);
		//Thread.sleep(2000);
		//}
		
	}

}
