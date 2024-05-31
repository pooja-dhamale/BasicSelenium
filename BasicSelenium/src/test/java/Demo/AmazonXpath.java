package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//a[@data-csa-c-content-id=\"nav_avod_desktop_topnav\"]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()=\"Sell\"]")).click();
	}

}
