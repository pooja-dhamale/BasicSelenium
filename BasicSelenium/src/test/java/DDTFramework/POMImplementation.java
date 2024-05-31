package DDTFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMRep.LoginPage;

public class POMImplementation {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// Step 1:- Connecting path to the test script using FileinputStream class
	    FileInputStream fis = new FileInputStream("C:\\Users\\pdhama01\\Downloads\\PropertiesData11.properties");
		//FileInputStream fis = new FileInputStream("./PropertiesData11.properties");
		
		//Step2:-  help to read data from the files 
		Properties pro = new Properties();
		
		// Steo 3:- load the file using load method
		pro.load(fis);
		
		// Step 4:- with the help of variables and class update the file keys
		 String URL = pro.getProperty("Url");
		 String USERNAME=pro.getProperty("username");
		 String PASSWORD=pro.getProperty("password");
		 driver.get(URL);
		 
		 
	    // Step5:- using page object model we can fetch the data
		 
	   // Case 1:- Using Getter Method
	   /* LoginPage login = new LoginPage(driver);
		 login.getUsernameTextField().sendKeys(USERNAME);
		 login.getPasswordField().sendKeys(PASSWORD);
		 login.getLoginbutton().click();*/
		 
		 // Case 2:- Using Business Logic
		 LoginPage login = new LoginPage(driver);
		 login.LoginToApplication(USERNAME, PASSWORD);
	}
	

}
