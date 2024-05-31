package DDTFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDatainExcelFileUsingApahepoi {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		FileInputStream fes = new FileInputStream("./FetchingSingleDataFromExel.xlsx");
		
		Workbook book = WorkbookFactory.create(fes);
		 
		Sheet sheet = book.getSheet("Page");
		 
		Row row = sheet.createRow(9);
		Cell cell = row.createCell(10);
		cell.setCellValue("Lipstick");
		 
		 
		FileOutputStream fos = new FileOutputStream("./FetchingSingleDataFromExel.xlsx");
		book.write(fos);
		book.close();

	}

}
