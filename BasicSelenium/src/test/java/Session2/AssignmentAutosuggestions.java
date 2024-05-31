package Session2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentAutosuggestions {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("lipstick");
	
	Thread.sleep(1000);
	List<WebElement> alllist = driver.findElements(By.xpath("//div[@class=\"s-suggestion s-suggestion-ellipsis-direction\"]"));
	
	for (WebElement list : alllist)
	{
		String data = list.getText();
		System.out.println(data);
		
		if(data.contains("lipstick uder 100"));
		{
			list.click();
			break;
		}
	}
	
	}

}
