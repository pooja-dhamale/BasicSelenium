package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// ID:- it is a locators which is  used to find out the web element 
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// Locator 1:- id();
		
		 /*driver.get("https://www.saucedemo.com/v1/");
		driver.navigate().forward();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");  // Sendkeys():- it is used to pass the the values from script to the application
		driver.findElement(By.id("password")).sendKeys("secret_sauce");   // Sendkeys():- it is used to pass the the values from script to the application
		driver.findElement(By.id("login-button")).click();  // Click():- click method is used to click on the particular web element of the page
		driver.navigate().back(); */
		
		
		// Locator 2:- name();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		// Locator 3:- className(); :- 
		driver.findElement(By.className("btn_action")).click();
		
		// Syntax 1 for css selector
		driver.findElement(By.cssSelector("[data-test=\"Username\"]")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("[data-test=\"password\"]")).sendKeys("secret_sauce");
		
		
		// Syntax 2 for css selector
		driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("\"standard_user\"");
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("secret_sauce");
		
		// Syntax 3 for css selector:- supports only id locator
		driver.findElement(By.cssSelector("#user-name")).sendKeys("");
		driver.findElement(By.cssSelector("#password")).sendKeys("");
		
		// Syntax 4 for css selector:-html#AttributeValue
		driver.findElement(By.cssSelector("input#user-name")).click();
		
		// Syntax 5 for css selector:- .AttrivuteValue
		
		driver.findElement(By.cssSelector(".btn_action")).click();
		
		// Syntax 6 for css selector:- htmltag.AttributeValue
		driver.findElement(By.cssSelector("input.btn_action")).click();
		
		
			
		
		
	
	}

}
