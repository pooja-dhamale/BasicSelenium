package PopUps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class BrowserNotificationPopUps {

	@Test
	public void BrowserNotificationPopUps() {
		// TODO Auto-generated method stub
		
		// to disable the browser notification pop up using chrome driver
		
		/*ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable_notifications");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/train-search");*/
		
		
		// to disable the browser notification pop up using edge driver
		/* EdgeOptions opt1 = new EdgeOptions();
		opt1.addArguments("--disable_notifications");
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/train-search");*/
		
		
		// to Launch the Browser in incognito window
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");
		
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.amazon.in");
		
		



		
		
	}
	

}
