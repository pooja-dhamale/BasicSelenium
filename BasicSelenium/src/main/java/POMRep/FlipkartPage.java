package POMRep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPage {
	
	public FlipkartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

//	@FindBys({@FindBy(name="q"),@FindBy(xpath="//input[@title=\"Search for Products, Brands and More\"]")})
//	private WebElement searchBar;
	
	@FindBys({@FindBy(name="q"),@FindBy(xpath="//input[@title=\"Search for Products, Brands and More\"]")})
    private WebElement searchBar;
	
	public void passValues(String Name)
	{
		searchBar.sendKeys(Name);
	}
	
	
}
