package com.DemowebshopTest.StepDefinition;

import org.testng.Assert;

import com.Demowebshop.Action.Register.RegisterAction;
import com.Demowebshop.Action.Register.RegisterValidationAction;
import com.Demowebshop.utils.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinition {
	RegisterAction ra = new RegisterAction();
	RegisterValidationAction rav = new RegisterValidationAction();
	
	@Given("Opens the Demowebshop {string}")
	public void opens_the_demowebshop(String string) {
	   HelperClass.openPage(string);
	}

	@When("User Enter the register data.")
	public void user_enter_the_register_data() {
	   ra.regsister();
	}

	@When("Click the register btn")
	public void click_the_register_btn() throws InterruptedException {
	    ra.clickRegsistor();
	    Thread.sleep(5000);
	}

	@Then("Validating the user is registered successfully.")
	public void validating_the_user_is_registered_successfully() {
		try {
	    Assert.assertEquals(rav.getRegsistorText(),"Your registration completed");
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println("You are already registered ");
		}
	}
}
