package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// Locator 1:- id();
		
		 driver.get("https://www.saucedemo.com/v1/");
		 driver.manage().window().maximize();
	
		
	}

}
