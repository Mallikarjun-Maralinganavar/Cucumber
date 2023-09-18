package com.Demowebshop.Locators.Login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocator {
	@FindBy (id="Email") public static WebElement enterEmail;
	@FindBy (id="Password") public static WebElement eneterPassWord;
	@FindBy (id="RememberMe") public static WebElement clickRemeberMe;
	@FindBy (xpath ="//input[@value='Log in']") public static WebElement clickLogin;
}
