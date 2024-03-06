package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		for(int i=1; i <=10; i++) {
		
		//To specify the path of the excel file
		 FileInputStream fis = new FileInputStream("./data/testData.xlsx");
		 		
		 //To make the file ready to read
		  Workbook wb = WorkbookFactory.create(fis);
		      
		  //To get into the sheet
		    Sheet sheet = wb.getSheet("ipl");
		    
		    //To get into the row
		   Row row = sheet.getRow(i);
		   
		   //To get into the cell
		  Cell cell = row.getCell(0);
		   
		   //To read the data from the cell
		  String data = cell.getStringCellValue();
		  
		  System.out.println(data);
		  
		}
		      
		
	}
	
	

}
