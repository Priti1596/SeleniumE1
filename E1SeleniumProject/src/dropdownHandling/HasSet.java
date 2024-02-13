package dropdownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HasSet {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Admin/Desktop/note++%20selenium/MultiSelectDDDuplicate.html");
		  
		WebElement multiSelectDDDuplicate = driver.findElement(By.id("menu"));// To locate th dropdown and store it in variable
		
		Select sel = new Select(multiSelectDDDuplicate);//To create the object of Select
		
		//To remove the duplicate we are using TreeSet
		  HashSet<String> hs = new HashSet<String>();//To create the object of TreeSet
		
		List<WebElement> options = sel.getOptions();//To get the list of all the options
		
//		for(WebElement we : options) {
//			
//			String textToInsert = we.getText();
//			hs.add(textToInsert);
//			}
//		for(String text :hs)
//		{
//		
//		 System.out.println(text);
//		
//		}
		
		for(int i = 0; i<options.size(); i++)
		{
			String textToInsert = options.get(i).getText();
     		hs.add(textToInsert);
	}
           
		System.out.println(hs);
		
		for(String text :hs)
			{
			
			 System.out.println(text);
		
			}

   }
}