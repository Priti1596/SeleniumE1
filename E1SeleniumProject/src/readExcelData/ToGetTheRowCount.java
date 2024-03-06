package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToGetTheRowCount {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	
	{
		//Provide path of excel
	        FileInputStream fis = new FileInputStream("./data/testData.xlsx");
	        
	        //To make file ready to read
	       Workbook wb = WorkbookFactory.create(fis);	
	       
	       //To get into sheet
	        Sheet sheet = wb.getSheet("invalidcreds");
	        
	        //To get the number of rows
	       int rc = sheet.getLastRowNum();
	  
	      System.out.println(rc);
	
	
	}

}
