package WebElementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		// methods 1,2,3=sendkeys(),clear,submit
	
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.amazon.in");
		WebElement searchBar = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		searchBar.sendKeys("Puma"); // sendKeys() is use to pass the values
		searchBar.clear(); // clear method is use to clear the previous data 
		Thread.sleep(1000);
		searchBar.sendKeys("Nike");
		searchBar.submit(); // submit method is only use for search bar */
		
		//driver.get("https://www.facebook.com");
		/* method 4:- getLocation():- it is used to fetch the x & y co-ordinates of location
		WebElement ele = driver.findElement(By.xpath("//a[@title=\"Buy and sell on Facebook Marketplace.\"]"));
		Point loc=ele.getLocation(); 
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		
		// method 5:- getSize():- it is used to identify the size
		Dimension elem=ele.getSize();
		System.out.println(elem.getHeight());
		System.out.println(elem.getWidth());
		
		// method 6:- getRect():- it is a combination os get location and get size
		 Rectangle element = ele.getRect();
		 System.out.println(element.getX());
		 System.out.println(element.getY());
		 System.out.println(element.height);
		 System.out.println(element.width); */
		
		//method7:- getcssValue():- it is used to get the color and font size
		/*WebElement element = driver.findElement(By.xpath("//a[@title=\"Browse in Video\"]"));
		System.out.println(element.getCssValue("color"));
		System.out.println(element.getCssValue("font-size"));
		
		//method 8:- getTagName():- it is used to get the tag name of the element
		System.out.println(element.getTagName());*/
		
		
		// method 9:-getAttribute():- if u give the attribute name attribute value should be printed 
		//driver.get("https://www.flipkart.com");
		//WebElement searchbar = driver.findElement(By.name("q"));
		//System.out.println(searchbar.getAttribute("title"));
		
		// method 10:- getDomAttribute():- it is used to fetch the backend data it is called as document object model
		
		//System.out.println(searchbar.getDomAttribute("placeholder"));
		
		
		//method 11:- getDomProperty()
		//WebElement element = driver.findElement(By.xpath("//span[text()=\"Grocery\"]"));
		//System.out.println(element.getDomProperty("tagName"));
		
		
		//method 12:- isDisplayed()
		/*WebElement logo = driver.findElement(By.xpath("//img[@title=\"Flipkart\"]"));
		
		if(logo.isDisplayed())
		{
			System.out.println("Logo is displayed");
		}
		else
		{
			System.out.println("Logo is not displayed");
		}
		*/
		
		//method 13:- isEnabled()
		/*WebElement product = driver.findElement(By.name("q"));
		if(product.isEnabled())
		{
			product.sendKeys("bucket");
		}
		
		else
		{
			System.out.println("product is not eneabled");
		}*/
		
		//method 14:- isSelected()
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		Thread.sleep(2000);
		
		WebElement radio = driver.findElement(By.xpath("//input[@value=\"1\"]"));
		
		radio.click();
		
		if(radio.isSelected())
		{
			System.out.println("radio button is selected");
		}
		else
		{
			System.out.println("radio button is not selected");
		}
		
		//method 15:- getAriaRole():- it is displayed what type of element it is
		WebElement name = driver.findElement(By.name("firstname"));
		System.out.println(name.getAriaRole());

		Thread.sleep(2000);
		WebElement radio1 = driver.findElement(By.xpath("//input[@value=\"1\"]"));
		System.out.println(radio.getAriaRole());
		
		//method 16:-getAccessibleName():- it is used to capture the name as it is present on the webpage
		
		System.out.println(name.getAccessibleName());
		
	}
	
	
	

}
