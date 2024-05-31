package Session2;

import java.util.Iterator;
import java.util.List;

// // to find the all links on the webpage and ttal number of link count
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment {

	@Test
	public void Assignment()throws Throwable {
		
		

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		Thread.sleep(2000);
		int count=0;
		for (WebElement lists : allLinks) 
		{
			//System.out.println(lists.getAttribute("href"));
			System.out.println(lists.getDomAttribute("href")); // to find the all links on the webpage and ttal number of link count
			count++;
		}
		System.out.println("total no.of links"+count);
	}
	

}
