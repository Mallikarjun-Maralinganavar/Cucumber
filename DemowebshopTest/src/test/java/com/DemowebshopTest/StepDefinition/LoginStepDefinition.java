package com.DemowebshopTest.StepDefinition;

import org.testng.Assert;

import com.Demowebshop.Action.Login.LoginAction;
import com.Demowebshop.Action.Login.LoginValidationAction;
import com.Demowebshop.utils.HelperClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	LoginAction la = new LoginAction();
	LoginValidationAction lva = new LoginValidationAction();
	
	@Given("Open the Login Page {string}.")
	public void open_the_login_page(String url) {
	    HelperClass.openPage(url);
	}

	@When("^User Enter the (.*) and (.*)$")
	public void user_enter_the_user_name_and_max1234(String UserName,String PassWord) {
	    	la.login(UserName, PassWord);
	}

	@When("click Login Btn")
	public void click_login_btn() throws InterruptedException {
		la.clickLoginbtn();
		Thread.sleep(5000);

	}

	@Then("Validate with Login Successfull.")
	public void validate_with_login_successfull() {
		Assert.assertEquals(lva.getValdationText(), "Welcome to our store");
	}

}
