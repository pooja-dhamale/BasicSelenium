package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone");
		driver.findElement(By.xpath("//input[@value=\"Go\"]")).click();
		
		//fetching all the phone names 
		 List<WebElement> alllist = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
		List<WebElement> price = driver.findElements(By.xpath("//span[@class=\"a-price-whole\"]"));
		// we have to see the total no of phone the count is used 
		
		
	 
	  /*int i =0;
		//using foreach loop 
		for (WebElement list : alllist) {
			System.out.println(list.getText());
			System.out.println(price.get(i).getText());
						i++;
			

         }*/
		int i=0;
		while (i<price.size()) {
		System.out.println(alllist.get(i).getText());
		System.out.println(price.get(i).getText());
			i++;
		}
		
        }
		
	}

	
