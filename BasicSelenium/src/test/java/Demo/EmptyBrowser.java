package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// import io.github.bonigarcia.wdm.WebDriverManager;


public class EmptyBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// case 1:- Using selenium 3.69 we can write the project
	/*	String key="webdriver.driver.chrome";
		String Value="./chromedriver.exe";
		System.setProperty(key, Value);
		WebDriver driver=new ChromeDriver(); */
		
		// Case 2:- using webDriver manager we can update all the browser
		// WebDriverManager.chromedriver().setup();
		// WebDriver driver=new ChromeDriver();
		
		// Case 3:- Using version 4 we cannot required a webdriver manager
		 //WebDriver driver=new ChromeDriver();
		  WebDriver driver=new EdgeDriver();
		//WebDriver driver=new FirefoxDriver();
		 
	    driver.get("https://www.flipkart.com"); // get method:- it is used to launch the application
	    String title = driver.getTitle();   // fetching the title of the web page
	    System.out.println(title); // print the title of the web page
		
	    
	    // getCurrentUrl:- it is used to displayed the current url 
	    
	    String URL = driver.getCurrentUrl(); // fetching the current webpage 
	    System.out.println(URL); // print the current url of the web page
 
	    
	    // getPageSource:- it is used to fetch the source code of the webpage
	    
	    //String source = driver.getPageSource(); // fetching the source code of the webpage
	    //System.out.println(source); // print the fetch the source code of the webpage
		
	    
	    // Maximize Window->to maximize the window we can use the following two methods
	    
	   /* Options opt = driver.manage(); // method 1
	    Window win = opt.window();
	    win.maximize(); */
	    
	    // Or
	    
	    // manage(); method:- manage method is used to maximize, minimize and full screen the actions of the web page
	    
	    driver.manage().window().maximize(); // method2:- method channing basically we used because method channing one method calling another method
        driver.manage().window().minimize();
        driver.manage().window().fullscreen();
        
      
        
       
	}
	

}
