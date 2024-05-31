package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkartxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Iphone");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

		List<WebElement> alllist = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
		
		int count=0;
		
		for (WebElement list : alllist)
		{
			System.out.println(list.getText());
			count++;	
		}
		
		
		 List<WebElement> pricelist = driver.findElements(By.xpath("//div[@class=\"_25b18c\"]"));
		 
		 int count1=0;
		 for (WebElement price : pricelist) 
		 {
			System.out.println(price.getText());
			count1++;
		}
		System.out.println("Total number of phone"+count1);
		
	}

}
