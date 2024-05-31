package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AssignmentCalenderPopUp {

	@Test
	public void AssignmentCalenderPopUp() throws Throwable
	{
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act = new Actions(driver);
		act.moveByOffset(20, 30).click().perform();
		
	
		driver.findElement(By.xpath("//span[text()=\"Departure\"]")).click();
		
		
		String months = "April 2024";
		String date = "6";
		driver.findElement(By.xpath("//div[text()=\""+months+"\"]/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()=\""+date+"\"]")).click();
		
	}

}
