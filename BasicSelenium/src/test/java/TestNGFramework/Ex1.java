package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex1 {

	@Test
	public void Saucelab()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		 driver.get("https://www.saucedemo.com/v1/");
		 driver.manage().window().maximize();
		 
		 // Xpath By Attribute Name=htmltag[@AttributeName=AttributeValue]
		 driver.findElement(By.xpath("//input[@data-test=\"username\"]")).sendKeys("standard_user");
		 driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce");
		 driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
	}
	

}
