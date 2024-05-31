package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopUp {

	public static void main(String[] args) {
		// Scenario:- to select the dates for multiple calender pop ups
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()=\"Departure\"]")).click();
		
		
		// Dynamic Xpath:- path remains same we need to change only values
		//ancestor :- it is use to traversing from child to  any parent
		// descendant:- it is use to traversing from parent to any child
		String month = "April 2024";
		String date="20";
		driver.findElement(By.xpath("//div[text()=\""+month+"\"]/ancestor::div[@class=\"DayPicker-Months\"]/descendant::p[text()=\""+date+"\"]")).click();

	}

}
