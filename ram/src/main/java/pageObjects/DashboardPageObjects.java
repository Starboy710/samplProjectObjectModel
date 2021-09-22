package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPageObjects {

	@FindBy(linkText="Admin")
	public static WebElement adminLink;
	
	@FindBy(linkText="User Management")
	public static WebElement userManagementLink;
	
	@FindBy(linkText="Users")
	public static WebElement usersLink;
}
