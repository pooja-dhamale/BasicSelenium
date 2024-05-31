package DDTFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsertDataToPropertiesFile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		Properties pro1 = new Properties();
		pro1.setProperty("username", "standard_user");
		pro1.setProperty("password", "secret_sauce");
		pro1.setProperty("Url", "https://www.saucedemo.com/v1/");
		
		FileOutputStream fos = new FileOutputStream("./PropertiesData11.properties");
		pro1.store(fos, "Common");
		System.out.println("Data Fetch Successfully");
		

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
		 
		 
		 // update the variable 
		 driver.get(URL);
		 driver.findElement(By.id("user-name")).sendKeys(USERNAME);  // Sendkeys():- it is used to pass the the values from script to the application
		 driver.findElement(By.id("password")).sendKeys(PASSWORD);
		 driver.findElement(By.id("login-button")).click();
	}

}
