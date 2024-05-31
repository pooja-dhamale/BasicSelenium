package Session2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleAutoSuggestion {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
//		Actions act = new Actions(driver);
//		act.moveByOffset(20, 10).click().perform();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		Thread.sleep(1000);
		List<WebElement> alllist = driver.findElements(By.xpath("//div[@class=\"lnnVSe\"]"));
		
		for (WebElement element : alllist) 
		{
			Thread.sleep(1000);
			String data = element.getText();
			System.out.println(data);
		
		if(data.contains("selenium webdriver download"));
		{

			element.click();
			break;
			}
			
		}
	}

}
