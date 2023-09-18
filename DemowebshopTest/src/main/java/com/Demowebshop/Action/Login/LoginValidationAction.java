package com.Demowebshop.Action.Login;

import org.openqa.selenium.support.PageFactory;

import com.Demowebshop.Locators.Login.LoginValidation;
import com.Demowebshop.utils.HelperClass;

public class LoginValidationAction {
	LoginValidation lgValidation = null;
	
	public LoginValidationAction() {
		this.lgValidation = new LoginValidation();
		
		PageFactory.initElements(HelperClass.getDriver(), lgValidation);
	}
	
	public String getValdationText() {
		return lgValidation.loginValidation.getText();
	}
}