package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.name("q")).sendKeys("Iphone");
        driver.findElement(By.xpath("//button[@class=\"_2iLD__\"]")) // Updated xpath for search button
                .click();

        List<WebElement> priceElements = driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));

        // Loop through each price element
        for (WebElement priceElement : priceElements) {
            String priceText = priceElement.getText();
            int price = Integer.parseInt(priceText.replaceAll("[^0-9]", ""));

            // Check if the price is less than 60,000
            if (price > 60000) {
                // Print the price
                System.out.println("Price: " + price);
            } else {
                System.out.println("Price is not less than 60,000");
            }
        }

        // Close the browser
        driver.quit();
    }

}
