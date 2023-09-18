package com.Demowebshop.Action.Login;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.Demowebshop.Locators.Login.LoginLocator;
import com.Demowebshop.utils.HelperClass;

public class LoginAction {

	LoginLocator lgLocator = null;
	
	public LoginAction() {
		this.lgLocator = new LoginLocator();
		
		PageFactory.initElements(HelperClass.getDriver(), lgLocator);
	}
	
	public void setEmail(String email) {
		lgLocator.enterEmail.sendKeys(email);
	}
	
	public void setPassWord(String psw) {
		lgLocator.eneterPassWord.sendKeys(psw);
	}
	
	public void clickLoginbtn() {
		lgLocator.clickLogin.click();
	}
	
	public void login(String email,String psw) {
	    this.setEmail(email);
	    this.setPassWord(psw);
	}
}
