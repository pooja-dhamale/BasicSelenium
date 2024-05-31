package TestNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LaunchingUrl {

	
	@Test
	
	public void launchingurl()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Reporter.log("url is launched",true);
	}
}
