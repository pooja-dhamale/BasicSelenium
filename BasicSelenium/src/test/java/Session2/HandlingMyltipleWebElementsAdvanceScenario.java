package Session2;

import java.util.List;

// WASJP to print the multiple links on the webpage
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMyltipleWebElementsAdvanceScenario {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		Thread.sleep(2000);
		for (WebElement list : alllinks) 
		{
			System.out.println(list.getText());// printls the link text
			//System.out.println(list.getAttribute("href"));// print the links URL
		}
	}

}
