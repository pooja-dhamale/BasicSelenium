package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBrowser {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		//launching empty browser
		WebDriver driver=new ChromeDriver();
		
		// launching an application
		driver.get("https://www.flipkart.com");
		
		// driver.navigate().to("https://www.flipkart.com");
		
		
		// thread.sleep is a java method which is used to give a time
		Thread.sleep(2000);
		
		// navigate() back:- it is used to navigating  backward button
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		// Backward():- it is used to navigating  backward button
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		
		
		// refresh():- it is used to navigating  backward button
		driver.navigate().refresh();
		
		// close():- closes the window/tab where  driver is currently focus
		driver.close();
		
		
		// quite():- closes all the window/tab including browser
		
		driver.quit();
		
		
		
	}

}
