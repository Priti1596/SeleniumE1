package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Admin/Desktop/note++%20selenium/MultiSelectDD1.html");
		  
		WebElement multiSelectDD = driver.findElement(By.id("menu"));// To locate th dropdown and store it in variable
		Select sel = new Select(multiSelectDD);
		 
		WebElement element = sel.getWrappedElement();
		String textOfOptions = element.getText();
		System.out.println(textOfOptions);
	}

}
