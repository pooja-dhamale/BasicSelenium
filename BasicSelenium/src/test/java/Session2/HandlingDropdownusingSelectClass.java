package Session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownusingSelectClass {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		
        Thread.sleep(1000);
		
        /*/ Case 1:-  select By index
		WebElement datelist= driver.findElement(By.id("day"));
		datelist.click();
		
		Select date = new Select(datelist);
		date.selectByIndex(14);
		
		Thread.sleep(1000);
		
		WebElement monthlist = driver.findElement(By.id("month"));
		monthlist.click();
		
		Select month = new Select(monthlist);
		month.selectByIndex(5);
		
		
		WebElement yearlist = driver.findElement(By.id("year"));
		yearlist.click();
		
		Select year = new Select(yearlist);
		year.selectByIndex(26);*/
        
        //Case 2:-  Select By Value
        
        /*WebElement datelist= driver.findElement(By.id("day"));
		datelist.click();
		
		Select date = new Select(datelist);
		date.selectByValue("15");
		
		Thread.sleep(1000);
		
		WebElement monthlist = driver.findElement(By.id("month"));
		monthlist.click();
		
		Select month = new Select(monthlist);
		month.selectByValue("6");
		
		
		WebElement yearlist = driver.findElement(By.id("year"));
		yearlist.click();
		
		Select year = new Select(yearlist);
		year.selectByValue("1998");*/
		
		
    //Case 3:-  Select By Text
        
        WebElement datelist= driver.findElement(By.id("day"));
		datelist.click();
		
		Select date = new Select(datelist);
		date.selectByVisibleText("19");
		
		Thread.sleep(1000);
		
		WebElement monthlist = driver.findElement(By.id("month"));
		monthlist.click();
		
		Select month = new Select(monthlist);
		month.selectByVisibleText("Jun");
		
		
		WebElement yearlist = driver.findElement(By.id("year"));
		yearlist.click();
		
		Select year = new Select(yearlist);
		year.selectByVisibleText("1992");
        
	}
	
}
