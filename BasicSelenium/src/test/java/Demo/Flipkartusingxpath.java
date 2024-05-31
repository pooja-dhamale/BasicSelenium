package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartusingxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// Xpath by Attribute:- //htmlTag[@AttributeName="AttributeValue"]
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Puma");
		// driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		// Xpath by text:- //htmlTag[text()="AttributeValue"]
		//driver.findElement(By.xpath("//span[text()=\"Travel\"]")).click();
		//driver.navigate().back();
		
		// Xpath by using contains:- //htmlTag[contains(@AttributeName,AttributeValue)]
		driver.findElement(By.xpath("//input[contains(@type,\"text\")]")).sendKeys("Puma");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
       String name = driver.findElement(By.xpath("(//a[@class=\"IRpwTa\"])[1]")).getText();
       System.out.println(name);

       String price=driver.findElement(By.xpath("(//div[@class=\"_30jeq3\"])[1]")).getText();
       System.out.println(price);
		
		
		

	}

}
