package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPractice {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Lipstick");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		// Locator 4:- linktext(); :- 
		driver.findElement(By.linkText("Amazon miniTV")).click();
		Thread.sleep(100);
		driver.navigate().back();
		
	 
		// Locator 5:- Partiallinktext(); :- 
		driver.findElement(By.partialLinkText("Amazon")).click();
		driver.navigate().back();
		
		// Locator 6:- cssSeletor(); :- 
		driver.findElement(By.cssSelector("[placeholder=\"Search Amazon.in\"]")).sendKeys("Iphone");
	}

}
