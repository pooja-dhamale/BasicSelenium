package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopUps {

	@Test
	public void AlertPopUps()
	{
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// // handling pop ups to  click on Ok pop ups
		
		/*driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
		
		Alert alt = driver.switchTo().alert();
		alt.accept();*/
		
		
		// handling pop ups to click on cancel or else click on Ok pop ups
		
	  driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
		
		Alert alt = driver.switchTo().alert();
		//Thread.sleep(1000);
		alt.accept();
		
		//alt.dismiss();
		
		String txt = alt.getText();
		System.out.println(txt);
		
		
		//handling alert pop up to pass the data and click on ok
		
		/*driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Arjavi");
		alt.accept();*/
	
		
	}

}
