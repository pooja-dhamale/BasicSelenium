package Session2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionsList {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("lipstick");
		
		Thread.sleep(2000);
		List<WebElement> alllist = driver.findElements(By.xpath("//ul[@class=\"_1sFryS _2x2Mmc _3ofZy1\"]//li"));
		
		for (WebElement element : alllist) 
		{
			Thread.sleep(1000);
			String data = element.getText();
			System.out.println(data);
       	if(data.contains("lipstick matte waterproof"));
	{
	   element.click();
      break;
			}
		}

		
	}

}
