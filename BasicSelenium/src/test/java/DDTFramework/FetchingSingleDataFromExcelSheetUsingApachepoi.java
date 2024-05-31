package DDTFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingSingleDataFromExcelSheetUsingApachepoi {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		//Step 1:- Set file path
		FileInputStream fes = new FileInputStream("./FetchingSingleDataFromExel.xlsx");
		
		//Step 2:- Excel in read mode
		Workbook book = WorkbookFactory.create(fes);
		
		//Step 3:- Fetch the required sheet
		Sheet sheet = book.getSheet("Page");
		
		//Step 4:- fetch the required row
		Row row = sheet.getRow(14);
		
		//Step 5:- fetch the the required columns
		Cell cell = row.getCell(6);
		
		//Step 6:- get the set values n print 
		String ExcelData = cell.getStringCellValue();
		System.out.println(ExcelData);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys(ExcelData);

	}

}
