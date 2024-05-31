package DDTFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		FileInputStream fis = new FileInputStream("./flipkart.properties");
		
		Properties pro = new Properties();
		pro.load(fis);
		
		String URL = pro.getProperty("Url");
		driver.get(URL);

	}

}
