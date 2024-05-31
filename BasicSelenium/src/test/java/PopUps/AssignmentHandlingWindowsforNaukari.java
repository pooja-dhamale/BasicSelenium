package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentHandlingWindowsforNaukari {

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
		
		
		
		Set<String> allwin = driver.getWindowHandles();
		
	
		for (String win : allwin) 
		{
			driver.switchTo().window(win);
			String title = driver.getTitle();
			 if(title.contains("Resume Writing Services - CV - Bio data | Naukri Fastforward"))
			 {
				 break;
			 }
			
		}
	

	}

}
