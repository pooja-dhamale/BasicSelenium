package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement txt = driver.findElement(By.xpath("//input[@id=\"file-upload\"]"));
		txt.sendKeys("C:\\Users\\pdhama01\\Downloads\\ProjectSetUpSteps");
		driver.findElement(By.xpath("//input[@value=\"Upload\"]")).click();
		
		
		
		

	}

}
