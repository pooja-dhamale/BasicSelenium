package AdvanceScenario;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingScrollBarUsingJavascriptExecutor {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 //scroll down
		 for(int i=0;i<3;i++)
		 {
			 Thread.sleep(1000);
			 js.executeScript("window by scrollBy(0,500)");
		 }
		 
		 // scroll up
		 for(int i=0;i<3;i++)
		 {
			 Thread.sleep(1000);
			 js.executeScript("window by scrollBy(0,-500)");
		 }

	}

}
