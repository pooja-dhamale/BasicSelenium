package POMRep;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


// Create Constructo
public class LoginPage {

	// Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	
	@FindBy(id="user-name")
	private WebElement UsernameTextField;
	
	@FindBy(id="password")
	private WebElement PasswordField;
	
	@FindBy(id="login-button")
	private WebElement Loginbutton;

	
	// Getter methods
	public WebElement getUsernameTextField() {
		return UsernameTextField;
	}

	public WebElement getPasswordField() {
		return PasswordField;
	}

	public WebElement getLoginbutton() {
		return Loginbutton;
	}
	
	// Business Logic
	
	public void LoginToApplication(String username, String password)
	{
		UsernameTextField.sendKeys(username);
		PasswordField.sendKeys(password);
		Loginbutton.click();
		
		
	}
	
	

}
