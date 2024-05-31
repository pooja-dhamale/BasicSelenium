package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement searchBar = driver.findElement(By.xpath("//textarea[@name=\"q\"]"));
		searchBar.sendKeys("Pro Kabaddi Table");
		searchBar.submit();
		
		List<WebElement> list = driver.findElements(By.xpath("//th[@role=\"columnheader\"]"));
		int i=0;
		for (WebElement webElement : list) 
		{
			System.out.println(webElement.getText());
			i++;
		}
		
		List<WebElement> list1 = driver.findElements(By.xpath("(//span[@class=\"tsp-w tsp-el tsp-db\"])[1]|(//td[@class=\"tsp-kscs tsp-cm\"])[1]|(//td[@class=\"tsp-kscs tsp-cm\"])[2]|(//td[@class=\"tsp-kscs tsp-cm\"])[3]|(//td[@class=\"tsp-kscs tsp-cm tsp-kshc\"])[1]|(//td[@class=\"tsp-kscs tsp-cm tsp-kshc\"])[2]|(//td[@class=\"tsp-kscs tsp-cm tsp-fb\"])[1]"));
		int j=0;
		for (WebElement webElement : list1) 
		{
			System.out.println(webElement.getText());
			j++;
		}
		
		/*List<WebElement> list2 = driver.findElements(By.xpath("(//span[@class=\"tsp-w tsp-el tsp-db\"])[2]|(//td[@class=\"tsp-kscs tsp-cm\"])[2]|(//td[@class=\"tsp-kscs tsp-cm\"])[3]|(//td[@class=\"tsp-kscs tsp-cm\"])[4]|(//td[@class=\"tsp-kscs tsp-cm tsp-kshc\"])[2]|(//td[@class=\"tsp-kscs tsp-cm tsp-kshc\"])[3]|(//td[@class=\"tsp-kscs tsp-cm tsp-fb\"])[2]"));
		int k=0;
		for (WebElement webElement : list2) 
		{
			System.out.println(webElement.getText());
			k++;
		}*/
		
		
		
		
		/*WebElement th1 = driver.findElement(By.xpath("(//th[@role=\"columnheader\"])[2]"));
		System.out.println(th1.getText());
		
		WebElement th2 = driver.findElement(By.xpath("(//th[@role=\"columnheader\"])[3]"));
		System.out.println(th2.getText());
		
		WebElement th3 = driver.findElement(By.xpath("(//th[@role=\"columnheader\"])[4]"));
		System.out.println(th3.getText());
		
		WebElement th4 = driver.findElement(By.xpath("(//th[@role=\"columnheader\"])[5]"));
		System.out.println(th4.getText());
		
		WebElement th5 = driver.findElement(By.xpath("(//th[@role=\"columnheader\"])[6]"));
		System.out.println(th5.getText());
		
		WebElement th6 = driver.findElement(By.xpath("(//th[@role=\"columnheader\"])[7]"));
		System.out.println(th6.getText());
		
		WebElement th7= driver.findElement(By.xpath("(//th[@role=\"columnheader\"])[8]"));
		System.out.println(th7.getText());*/
        
	}

}
