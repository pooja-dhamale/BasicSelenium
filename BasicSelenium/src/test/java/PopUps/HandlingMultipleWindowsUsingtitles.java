package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindowsUsingtitles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Windows.html");
	  
		driver.findElement(By.xpath("//a[text()=\"Open New Seperate Windows\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"click\"]")).click();

		
		Set<String> allwins = driver.getWindowHandles();

		for (String wins : allwins) 
		{
			driver.switchTo().window(wins);
			String title = driver.getTitle();
			System.out.println(title);
			
			if(title.contains("Selenium"))
			{
				break;
			}
			
		}
		
		driver.findElement(By.xpath("//a[text()=\"Read all about it!\"]")).click();
		
		Set<String> allwins1 = driver.getWindowHandles();

		for (String wins1 : allwins1) 
		{
			driver.switchTo().window(wins1);
			String title1 = driver.getTitle();
		System.out.println(title1);
			
		if(title1.contains("WebDriver BiDi - The future of cross-browser automation  |  Blog  |  Chrome for Developers"))
			{
				break;
			}
			
		}
		
     driver.findElement(By.xpath("//a[contains(text(),\"Get inspired\")]")).click();
	}
	

}
