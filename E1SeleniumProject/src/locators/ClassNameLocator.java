package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
				
				WebDriver driver = new ChromeDriver();//To launch the Browser
				driver.manage().window().maximize();//To maximize the browser
				driver.get("file:///C:/Users/Admin/Desktop/selenium webelement html/Textbox.html");//To launch Web Application
				Thread.sleep(2000);
				
				WebElement passtextBox = driver.findElement(By.className("pass-textbox")); //Find Password Textfield on the Webpage
				passtextBox.sendKeys("Admin");//To pass the input to the password text field
				
				
				//Note:- Inputs are passed to Username TextField because it is the 1st element designed with input tagname
				

	}

}
