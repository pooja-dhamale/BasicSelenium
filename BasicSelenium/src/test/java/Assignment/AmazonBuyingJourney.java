package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AmazonBuyingJourney {
	
	public static void main(String[]args) throws Throwable
	
	{
		WebDriver driver=new ChromeDriver();
		// Launch the browser
		driver.get("https://www.amazon.in");
		//maximize th window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//using css selector serach the nike shoes
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Nike Shoes");
		
		// using robot class click on enter
		Robot rob1 = new Robot();
		rob1.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob1.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		
		// using robot class scroll down the page
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		// with the help of getwindowhandle and switch window, handle the window
		WebElement Shoe = driver.findElement(By.xpath("//span[text()=\"Mens Air Zoom Pegasus 39 Running Shoes\"]"));
		Shoe.click();
		Set<String> allwins = driver.getWindowHandles();
		for (String windows : allwins) 
		{
			driver.switchTo().window(windows);
			String title = driver.getTitle();
			System.out.println(title);
			{
				if(title.contains("Buy Nike Men's Running Shoes Air Zoom Pegasus 39-Platinum Tint/Lt Crimson-White-Adobe-Dh4071-009-9Uk at Amazon.in\r\n"
						+ ""))
				{
					break;
				}
			}
		
		}
		
		// scroll down the page using robot class
		
		Robot rob2 = new Robot();
		rob2.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob2.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
		// click on add t cart cta
		driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
		
		// click on proceed to checkout cta
		driver.findElement(By.xpath("//input[@name=\"proceedToRetailCheckout\"]")).click();
		
		//enter the email address and password and click on sign in cta in sign in page
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("poojadhamale85@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Pooja08@");
		driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
		
		
		
		
		
		
		

		
		
	}

}
