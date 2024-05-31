package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentHandlingpopupsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Windows.html");
	  
		driver.findElement(By.xpath("//a[text()=\"Open New Seperate Windows\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"click\"]")).click();
		
		
		String mainWin = driver.getWindowHandle();
		System.out.println(mainWin);
		
		
		Set<String> allWin = driver.getWindowHandles();
		System.out.println(allWin);
		
		
		for (String win : allWin) 
		{
			if(!mainWin.equals(win));
			driver.switchTo().window(win);
			
			
		}
		driver.findElement(By.xpath("//span[text()=\"Downloads\"]")).click();

		
	}

}
