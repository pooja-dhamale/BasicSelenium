package HondaCar;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://hondacarindia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//button[text()=\"ACCEPT ALL\"][1]")).click();
		
	   driver.findElement(By.xpath("//div[@class=\"swiper-button-next\"]")).click();
	   driver.findElement(By.xpath("//div[@class=\"swiper-button-next\"]")).click();
	   driver.findElement(By.xpath("//div[@class=\"swiper-button-next\"]")).click();
	   driver.findElement(By.xpath("//div[@class=\"swiper-button-next\"]")).click();
	   driver.findElement(By.xpath("//div[@class=\"swiper-button-next\"]")).click();
	   driver.findElement(By.xpath("//div[@class=\"swiper-button-next\"]")).click();
	   driver.findElement(By.xpath("//div[@class=\"swiper-button-next\"]")).click();
	   driver.findElement(By.xpath("//div[@class=\"swiper-button-next\"]")).click();
	   driver.findElement(By.xpath("//div[@class=\"swiper-button-next\"]")).click();
	   
	   
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//div[@class=\"swiper-button-prev\"]")).click();
	   driver.findElement(By.xpath("//div[@class=\"swiper-button-prev\"]")).click();
	   driver.findElement(By.xpath("//div[@class=\"swiper-button-prev\"]")).click();
	   driver.findElement(By.xpath("//div[@class=\"swiper-button-prev\"]")).click();
	   driver.findElement(By.xpath("//div[@class=\"swiper-button-prev\"]")).click();
	   driver.findElement(By.xpath("//div[@class=\"swiper-button-prev\"]")).click();
	   driver.findElement(By.xpath("//div[@class=\"swiper-button-prev\"]")).click();
	   driver.findElement(By.xpath("//div[@class=\"swiper-button-prev\"]")).click();
	
	   Robot rob = new Robot();
	   rob.keyPress(KeyEvent.VK_PAGE_DOWN);
	   rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
	 
	   
	   driver.findElement(By.xpath("(//button[text()=\"Book test drive\"])[1]")).click();
	   Thread.sleep(3000);
	   
//	   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
//	   wait.until(ExpectedConditions.titleContains("Book a Honda Elevate Test Drive Today | Honda Cars India"));
       driver.navigate().back();
       
       rob.keyPress(KeyEvent.VK_PAGE_DOWN);
	   rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
	 

       driver.findElement(By.xpath("(//button[text()=\"Explore\"])[1]")).click();
       Thread.sleep(3000);
       driver.navigate().back();
       
       rob.keyPress(KeyEvent.VK_PAGE_DOWN);
       rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
       rob.keyPress(KeyEvent.VK_PAGE_DOWN);
       rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
       
       driver.findElement(By.xpath("//li[text()=\"exterior\"]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//li[text()=\"interior\"]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//li[text()=\"range\"]")).click();
       Thread.sleep(3000);
       
       rob.keyPress(KeyEvent.VK_PAGE_DOWN);
       rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
       
       driver.findElement(By.xpath("//h3[text()=\"FIND A DEALER\"]")).click();
       Thread.sleep(3000);
       driver.navigate().back();
       
       rob.keyPress(KeyEvent.VK_PAGE_DOWN);
       rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
       
		
	   
	
	}

}
