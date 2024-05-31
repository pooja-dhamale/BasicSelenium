package PopUps;

import java.time.Duration;
import java.util.Set;

// Switching two windows using id's

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingWindowsPopUpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		WebElement txt = driver.findElement(By.xpath("//div[text()=\"Jobs\"]"));
		
		
		Actions act = new Actions(driver);
		act.moveToElement(txt).perform();
		
		
		driver.findElement(By.xpath("//div[text()=\"Jobs by skill\"]")).click();
		driver.findElement(By.xpath("//div[text()=\"Services\"]")).click();
		//driver.findElement(By.xpath("//span[text()=\"RESUME WRITING\"]"));
		
		
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);

		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);
		
		for (String win : allWindow) 
		{
			if(!mainWindow.equals(win));
			{
				driver.switchTo().window(win);
				driver.findElement(By.xpath("//span[text()=\"RESUME WRITING\"]")).click();
			}
		}
	}
	

}
