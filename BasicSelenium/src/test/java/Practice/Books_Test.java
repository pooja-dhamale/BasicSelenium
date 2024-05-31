package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Books_Test extends BaseClass_Test {
	
	
	@Test
	public void books() throws Throwable
	{
		driver.findElement(By.partialLinkText("Books")).click();
	//imeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1,0);
		Reporter.log("User is able to click on book",true);
		Thread.sleep(20000);
		
	}
	
	


}
