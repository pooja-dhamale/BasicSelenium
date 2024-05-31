package DDTFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingExcelDataUsingDataformatter {

	public static void main(String[] args) throws Throwable, Throwable {
		// TODO Auto-generated method stub

		
		//Step 1:- Set file path
				FileInputStream fes = new FileInputStream("./FetchingSingleDataFromExel.xlsx");
				
				//Step 2:- Excel in read mode
				Workbook book = WorkbookFactory.create(fes);
				
				//Step 3:- Fetch the required sheet
				Sheet sheet = book.getSheet("Page");
				
				//Step 4:- fetch the required row
				Row row = sheet.getRow(0);
				
				//Step 5:- fetch the the required columns
				Cell cell = row.getCell(2);
				
				DataFormatter data = new DataFormatter();
				String exceldata = data.formatCellValue(cell);
				System.out.println(exceldata);
	}
	
	

}
