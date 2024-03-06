package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
	
		//To create the object of FileInputStream class
	FileInputStream fis = new	FileInputStream("./data/config.properties");
	
	//To create the object of properties class
	Properties prop = new Properties();
	
	//load all the keys
	prop.load(fis);
	
	//use get property method
    String value = prop.getProperty("browser");
	
	System.out.println(value);
	
	String value2 = prop.getProperty("url1");
	
	System.out.println(value2);
    
	}

}
