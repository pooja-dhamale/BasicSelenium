package Session2;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownUsingRobotClass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		
		Thread.sleep(1000);
		
		WebElement datelist = driver.findElement(By.id("day"));
		datelist.click();
		
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
		
		rob.keyPress(KeyEvent.VK_UP);
		rob.keyRelease(KeyEvent.VK_UP);
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
	
		
		Thread.sleep(2000);
		

		WebElement monthlist = driver.findElement(By.id("month"));
		monthlist.click();
		
		
		Robot rob1 = new Robot();
		rob1.keyPress(KeyEvent.VK_DOWN);
		rob1.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		rob1.keyPress(KeyEvent.VK_UP);
		rob1.keyRelease(KeyEvent.VK_UP);
		Thread.sleep(2000);
		
		rob1.keyPress(KeyEvent.VK_DOWN);
		rob1.keyRelease(KeyEvent.VK_DOWN);
	
		

		WebElement yearlist = driver.findElement(By.id("year"));
		yearlist.click();
		
		
		Robot rob2 = new Robot();
		rob2.keyPress(KeyEvent.VK_DOWN);
		rob2.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(2000);
		
		rob2.keyPress(KeyEvent.VK_UP);
		rob2.keyRelease(KeyEvent.VK_UP);
		Thread.sleep(2000);
		
		rob2.keyPress(KeyEvent.VK_DOWN);
		rob2.keyRelease(KeyEvent.VK_DOWN);
	
		
		
	}

}
