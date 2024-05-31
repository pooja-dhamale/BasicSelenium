package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesPopUps {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		/*WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		
		// Case 1:- switching frame using index value. index starts with 0
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();*/
		
		
		// Case 2:- Switching frame using name and id
		

		/*WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		//driver.switchTo().frame("singleframe");
		driver.switchTo().frame("SingleFrame");
		
		WebElement searchbar = driver.findElement(By.xpath("//input[@type=\"text\"][1]"));
		searchbar.sendKeys("Pooja");*/
		
		
		// Case 3:- switching frames using webelemen
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Frames.html");
		WebElement txt = driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]"));
		driver.switchTo().frame(txt);
		driver.findElement(By.xpath("//input[@type=\"text\"][1]")).sendKeys("Hello Arjavi");
		
	}
}
