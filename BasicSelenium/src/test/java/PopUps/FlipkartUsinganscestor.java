package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//navigate to the flipkart website search the phones in the searchbar and print the phone price using ancestor

public class FlipkartUsinganscestor {

	@Test
	public void FlipkartUsinganscestor() throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		 WebElement searchBar = driver.findElement(By.name("q"));
		 searchBar.sendKeys("Phones");
		 
		 Robot rob = new Robot();
		 rob.keyPress(KeyEvent.VK_ENTER);
		 rob.keyRelease(KeyEvent.VK_ENTER);
		 
		 String discountprice = "₹5,499";
		 //String originalprice = "14,999";
		 
		 driver.findElement(By.xpath("//div[text()=\""+discountprice+"\"]/ancestor::div[@class=\"_25b18c\"]")).click();
		
		System.out.println(discountprice);

	}

}
