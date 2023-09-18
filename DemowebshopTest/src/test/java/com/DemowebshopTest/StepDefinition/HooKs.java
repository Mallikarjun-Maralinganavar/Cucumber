package com.DemowebshopTest.StepDefinition;



import com.Demowebshop.utils.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooKs {
@Before
public void setUP() {
	HelperClass.setUpDriver();
}
@After
public void setDown() {
	HelperClass.tearDown();
}

}
