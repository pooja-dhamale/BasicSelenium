package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesHandlingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// Launch the URL
		driver.get("https://the-internet.herokuapp.com/frames");
		//Click on Nested CTA
		driver.findElement(By.xpath("//a[text()=\"Nested Frames\"]")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		// first we have to go to right the path for the top frame which is parent frame
			
         WebElement topFrame = driver.findElement(By.name("frame-top"));
	     driver.switchTo().frame(topFrame);
	     WebElement leftFrame = driver.findElement(By.name("frame-left"));
		 driver.switchTo().frame(leftFrame);
		
		String txt = driver.findElement(By.xpath("//body[contains(text(),\"LEFT\")]")).getText();
		System.out.println(txt);
		

	
		// After that switch parent window to child window.to travel from parent to child used driver.swutchTo().parent() method
		driver.switchTo().parentFrame();
		
		WebElement middleChild = driver.findElement(By.xpath("//frame[@name=\"frame-middle\"]"));
		driver.switchTo().frame(middleChild);
		
		String txt1 = driver.findElement(By.xpath("//div[.=\"MIDDLE\"]")).getText();
		System.out.println(txt1);
		
		

		
		// After that travel child to botton parent.to travel from child to parent used driver.swutchTo().defaultContent() method
		
		driver.switchTo().defaultContent();
		
		WebElement bottomFrame = driver.findElement(By.xpath("//frame[@name=\"frame-bottom\"]"));
		driver.switchTo().frame(bottomFrame);
		
		String txt2 = driver.findElement(By.xpath("//body[contains(text(),\"BOTTOM\")]")).getText();
		System.out.println(txt2);
	
		

//		driver.switchTo().parentFrame();
//		WebElement rightFrame = driver.findElement(By.name("frame-right"));
//		driver.switchTo().frame(rightFrame);
//		
//		String righttxt = driver.findElement(By.xpath("//body[contains(text(),\"RIGHT\")]")).getText();
//		System.out.println(righttxt);
		}

}
