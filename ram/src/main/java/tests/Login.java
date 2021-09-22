package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import basePackage.commonFunctions;
import pageObjects.LoginPageObjects;

public class Login extends commonFunctions{

	@Test
	public void loginTestCases() {
		PageFactory.initElements(driver, LoginPageObjects.class);
		pageObjects.LoginPageObjects.username.sendKeys(properties.getProperty("username"));
		pageObjects.LoginPageObjects.password.sendKeys(properties.getProperty("password"));
		pageObjects.LoginPageObjects.loginButton.click();
	}
}
