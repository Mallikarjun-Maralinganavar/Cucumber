package com.Demowebshop.Action.Register;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.Demowebshop.Locators.Register.RegisterLocators;
import com.Demowebshop.utils.HelperClass;

public class RegisterAction {
		RegisterLocators rgLocators = null;
		
		public RegisterAction() {
			// TODO Auto-generated constructor stub
			this.rgLocators = new RegisterLocators();
			PageFactory.initElements(HelperClass.getDriver(), rgLocators);
		}
		
		public void setFristName(String fn) {
			rgLocators.enterName.sendKeys(fn);
		}
		
		public void setLastName(String ln) {
			rgLocators.enterLastName.sendKeys(ln);
		}
		
		public void setEmail(String em) {
			rgLocators.enaterEmail.sendKeys(em);
		}
		
		public void setGender() {
			rgLocators.selectGender.click();
		}
		
		public void setPassWord(String ps) {
			rgLocators.enterPassWord.sendKeys(ps);;
		}
		
		public void setConfPassWord(String conps) {
			rgLocators.enterConfirmPassWord.sendKeys(conps);
		}
		
		public void clickRegsistor() {
			rgLocators.clickRegisterbtn.click();
		}
		
		public void regsister() {
			File file = new File("C:\\Users\\mmaralinganavar\\Desktop\\Java_Fun_T\\program\\class_work\\DemowebshopTest\\src\\test\\resources\\Features\\data.properties");
			
			FileInputStream fileInput = null;
		    try {

		    	fileInput = new FileInputStream(file);

		   } catch(FileNotFoundException e) {

			   e.printStackTrace();

		   }

		    Properties prop = new Properties();

		    try {

				prop.load(fileInput);

		    } catch(IOException e1) {

		    	e1.printStackTrace();

		    }
		    
		    this.setGender();
		    this.setFristName(prop.getProperty("Name"));
		    this.setLastName(prop.getProperty("LastName"));
		    this.setEmail(prop.getProperty("Email"));
		    this.setPassWord(prop.getProperty("passWord"));
		    this.setConfPassWord(prop.getProperty("confpsw"));
		}
}


