package Session2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentHandlingrobotClass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		 WebElement txt = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		  txt.sendKeys("Puma");
		  //txt.clear();
		
		
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_A);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_A);
		
		rob.keyPress(KeyEvent.VK_DELETE); // it is used to clear the value
		rob.keyRelease(KeyEvent.VK_DELETE);
		
		txt.sendKeys("Nike");
		
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		//rob.keyPress(KeyEvent.VK_CONTROL);
		//rob.keyPress(KeyEvent.VK_A);
		
		
		Thread.sleep(1000);
		//rob.keyRelease(KeyEvent.VK_CONTROL);
		//rob.keyRelease(KeyEvent.VK_A);
		
		//rob.keyPress(KeyEvent.VK_CONTROL);
		//rob.keyPress(KeyEvent.VK_C);
		
	//	Thread.sleep(1000);
		//rob.keyRelease(KeyEvent.VK_CONTROL);
		//rob.keyRelease(KeyEvent.VK_C);
		
		//rob.keyPress(KeyEvent.VK_CLEAR);
		
		//rob.keyPress(KeyEvent.VK_TAB);
		
		//driver.findElement(By.name("q")).sendKeys("lipstick");
		
		//rob.keyPress(KeyEvent.VK_ENTER);

	}

}
