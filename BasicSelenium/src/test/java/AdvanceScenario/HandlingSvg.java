package AdvanceScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kayak.co.in/ ");
		
		// Handling SVG elements:- Scaler Vector graphics
		//Syntax:- //*[name()="svg" and @AttributName="AttributeValue()"]
		driver.findElement(By.xpath("//*[name()=\"svg\" and @class=\"c8LPF-icon\"]")).click();

	}

}
