package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass_Test {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void db()
	{
		Reporter.log("the db connection is connected",true);
	}
	
	@BeforeTest()
	public void precondition()
	{
		Reporter.log("user is able to write the precondition",true);
	}
	
	@BeforeClass()
	
	public void launch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("user is able to launch the url",true);
	}
	
	@BeforeMethod()
	public void login()
	{
		driver.findElement(By.partialLinkText("Log in")).click();;
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("poojadhamale85@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("Pooja@123");
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
//		Actions act=new Actions(driver);
//		act.click(login).perform();
//		act.sendKeys(email,"poojadhamale85@gmail.com").perform();
//		act.sendKeys(password,"Pooja@123").perform();
//		act.click(loginbutton).perform();
	
		Reporter.log("user is able to login into the application",true);
	}
	
	@AfterMethod()
	public void logout()
	{
		Reporter.log("usr is able to logout the session",true);
		driver.quit();
	}
	
	@AfterClass
	public void close()
	{
		Reporter.log("user is able to close the browser",true);
	}
	
	@AfterTest
	
	public void postcon()
	{
		Reporter.log("user is able to write the post condition",true);
	}
	
	@AfterSuite
	
	public void closedb()
	{
		Reporter.log("user is able to close the db connection",true);
	}
	
	

}
