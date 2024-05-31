package Session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// To perform the various mouse actions
		
		//Case 1:- hover the mouse and perform the right click operation
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement txt = driver.findElement(By.xpath("//a[text()=\"Mobiles\"]"));
		
		
		Actions act = new Actions(driver);
		act.moveToElement(txt).perform();
		act.contextClick(txt).perform(); // contextclick method is used to perform the right click action of the mouse
*/
		
		//Normal Approach
		 /*driver.get("https://www.saucedemo.com/v1/");
			driver.navigate().forward();
			driver.findElement(By.id("user-name")).sendKeys("standard_user");  // Sendkeys():- it is used to pass the the values from script to the application
			driver.findElement(By.id("password")).sendKeys("secret_sauce");   // Sendkeys():- it is used to pass the the values from script to the application
			driver.findElement(By.id("login-button")).click();
			*/
		
		
		// Case 2:- Using mouse actions we will try to login
		
		// Using mouse actions we will try to login
		
		/*WebDriver driver=new ChromeDriver();	
	    driver.get("https://www.saucedemo.com/v1/");
	    WebElement USERNAME = driver.findElement(By.id("user-name")); // Sendkeys():- it is used to pass the the values from script to the application
		WebElement PASSWORD = driver.findElement(By.id("password"));  // Sendkeys():- it is used to pass the the values from script to the application
		WebElement LOGIN = driver.findElement(By.id("login-button"));
		
		Actions act = new Actions(driver);
		/*act.sendKeys(USERNAME,"standard_user").perform();
		act.sendKeys(PASSWORD,"secret_sauce").perform();
		act.click(LOGIN).perform();*/
		
		
		//act.sendKeys(USERNAME,"standard_user").sendKeys(PASSWORD,"secret_sauce").click(LOGIN).build().perform();
	    // build ():- build method is used to run the overall code applications /*
		
		
		// Case 3:- To perform the drag and drop operations Scenario
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		//act.dragAndDrop(drag, drop).perform();
		
		//act.clickAndHold(drag).perform();
		//act.release(drop).perform();
		
		act.clickAndHold(drag).release(drop).perform();*/
		
		// case 3:- double click mouse action
		
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement ele = driver.findElement(By.xpath("//button[text()=\"Double-Click Me To See Alert\"]"));
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();*/
		
		//case 4:- moveByoffset():- it is use to close the pop up on clicking on anywhere on the webpage
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		Actions act = new Actions(driver);
		act.moveByOffset(20, 20).click().perform();
		
		
		
	}

}
