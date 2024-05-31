package AdvanceScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollByJS {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//a[text()=\"Instagram\"]"));
//		Point loc = ele.getLocation();
//		//identify the locations using get location methods
//		System.out.println(loc.getX());
//		System.out.println(loc.getY());
//		
		// use javascript interface the scroll the bar using window.scrollby method window.scrollBy(x,y)
	/*JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(1088,787)");
	ele.click();*/

	// use javascript interface the scroll the bar  using arguments method:- arguments[0].scrollIntoView()",ele
	/*JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].scrollIntoView()",ele);
	ele.click();*/
	
		// to scroll the entire page
	JavascriptExecutor jse = (JavascriptExecutor)driver; //downcasting the driver
	Thread.sleep(1000);
	jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	Thread.sleep(1000);
	jse.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	ele.click();

	}

}
