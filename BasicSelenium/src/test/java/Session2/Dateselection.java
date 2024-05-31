package Session2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dateselection {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		
		Thread.sleep(1000);
		
		WebElement datelist = driver.findElement(By.id("day"));
		datelist.click();
		datelist.sendKeys(Keys.ARROW_DOWN);
		datelist.sendKeys(Keys.ARROW_DOWN);
		datelist.sendKeys(Keys.ARROW_UP);
		datelist.sendKeys(Keys.ARROW_UP);
		
		WebElement monthlist = driver.findElement(By.id("month"));
		monthlist.click();
		monthlist.sendKeys(Keys.ARROW_DOWN);
		monthlist.sendKeys(Keys.ARROW_DOWN);
		
		
		WebElement yearlist = driver.findElement(By.id("year"));
		yearlist.click();
		yearlist.sendKeys(Keys.ARROW_DOWN);
		yearlist.sendKeys(Keys.ARROW_DOWN);
		
		
		
	}

}
