package AdvanceScenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		//Case 1:- Implicite Wait():- Version 4
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
	
		
		 driver.get("https://www.saucedemo.com/v1/");
		driver.navigate().forward();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");  // Sendkeys():- it is used to pass the the values from script to the application
		driver.findElement(By.id("password")).sendKeys("secret_sauce"); 
		
		// Sendkeys():- it is used to pass the the values from script to the application
		
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		// Case 2:- Explicite wait():- 
		 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		 //wait.until(ExpectedConditions.elementToBeClickable(loginButton));
	     //loginButton.click();  // Click():- click method is used to click on the particular web element of the page
		 
	     // method 1:- 
	    // wait.until(ExpectedConditions.titleContains("Swag Labs"));
	     //driver.findElement(By.xpath("//div[text()=\"Sauce Labs Backpack\"]")).click();
	     
	     //method 2:- 
	     wait.until(ExpectedConditions.attributeContains(loginButton, "id", "login-button"));
	     loginButton.click();
	     
		 driver.navigate().back(); 

	}

}
