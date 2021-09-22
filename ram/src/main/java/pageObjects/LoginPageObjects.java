package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPageObjects {

	@FindBy(id="txtUsername")
	public static WebElement username; 
	
	@FindBy(id="txtPassword")
	public static WebElement password; 
	
	@FindBy(id="btnLogin")
	public static WebElement loginButton;
}
