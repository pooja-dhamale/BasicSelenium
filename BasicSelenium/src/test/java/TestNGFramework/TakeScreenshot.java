package TestNGFramework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScreenshot {
	
	@Test
	public void screenshot() throws Throwable
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		TakesScreenshot ts=(TakesScreenshot)driver; // first we have to downcasting the driver
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./FailScript.png");
		FileUtils.copyFile(src, dest);
		
	}

}
