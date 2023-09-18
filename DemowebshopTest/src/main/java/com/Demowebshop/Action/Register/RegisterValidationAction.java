package com.Demowebshop.Action.Register;

import org.openqa.selenium.support.PageFactory;

import com.Demowebshop.Locators.Register.RegisterValidation;
import com.Demowebshop.utils.HelperClass;

public class RegisterValidationAction {
	RegisterValidation rgValidation = null;
	
	public RegisterValidationAction() {
		// TODO Auto-generated constructor stub
		this.rgValidation = new RegisterValidation();
		
		PageFactory.initElements(HelperClass.getDriver(), rgValidation);
	}
	
	public String getRegsistorText() {
		return rgValidation.registerPage.getText();
	}
}
