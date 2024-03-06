package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {
		
		//To reate the object of FileInputStream class
	FileInputStream fis = new	FileInputStream("./data/config.properties");
		
	//To create the object of properties class
		Properties prop = new Properties();
		
		//load all the keys
		prop.load(fis);
		
		//use get property method
		 String data = prop.getProperty("url");
		
		System.out.println(data);

	}

}
