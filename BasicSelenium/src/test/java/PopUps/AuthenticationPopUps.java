package PopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		// Syntax:- driver.get("https://username:password@url");
		
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.get("https://qa-access:f60db2ef7ca856f6308df87e42a4ec95@https://revamp-test-phase2.hondacarindia.co.in/");

	}

}
