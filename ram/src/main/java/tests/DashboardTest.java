package tests;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import basePackage.commonFunctions;
import pageObjects.DashboardPageObjects;

public class DashboardTest extends commonFunctions{

	public static void clickUserslink() {
		
		Actions actions = new Actions(driver);
		actions.moveToElement(DashboardPageObjects.adminLink);
		actions.moveToElement(DashboardPageObjects.userManagementLink);
		actions.moveToElement(DashboardPageObjects.usersLink);
		actions.click().build().perform();
	}
	
	@Test
	public void dashBoardTestCases() {
		
		PageFactory.initElements(driver, DashboardPageObjects.class);
		clickUserslink();
		
	}
}
