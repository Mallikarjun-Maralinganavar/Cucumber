package com.Demowebshop.Locators.Register;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterLocators {
	
	@FindBy(id = "gender-male") public static WebElement selectGender;
	@FindBy(id = "FirstName") public static WebElement enterName;
	@FindBy(id ="LastName") public static WebElement enterLastName;
	@FindBy(id ="Email") public static WebElement enaterEmail;
	@FindBy(id ="Password") public static WebElement enterPassWord;
	@FindBy(id ="ConfirmPassword") public static WebElement enterConfirmPassWord;
	
	@FindBy(id ="register-button") public static WebElement clickRegisterbtn;
}
