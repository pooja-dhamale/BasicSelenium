package Session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownUsingXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[text()=\"17\"]")).click();
        driver.findElement(By.xpath("//option[text()=\"Oct\"]")).click();
        driver.findElement(By.xpath("//option[text()=\"2021\"]")).click();

	}

}
