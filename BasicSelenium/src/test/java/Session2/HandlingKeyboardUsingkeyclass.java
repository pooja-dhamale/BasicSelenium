package Session2;

// Handling keys using key class
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyboardUsingkeyclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* normal Approach
		 driver.navigate().forward();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");  // Sendkeys():- it is used to pass the the values from script to the application
		driver.findElement(By.id("password")).sendKeys("secret_sauce");   // Sendkeys():- it is used to pass the the values from script to the application
		driver.findElement(By.id("login-button")).click();
		 */
		
		/*Case 1:- 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");  // Sendkeys():- it is used to pass the the values from script to the application
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");  
		password.sendKeys(Keys.ENTER); // keys class always return inside the sendkeys*/
		

		/*Case 2:- 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");  // Sendkeys():- it is used to pass the the values from script to the application
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce",Keys.ENTER);*/
		
		// case 3:- using tab method we can directly go to the next line of the script
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER); 

	}

}
