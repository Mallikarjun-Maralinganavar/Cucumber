package com.Demowebshop.Runfile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class RunnerClass {
	@CucumberOptions(
			tags="",
			features = {"C:\\Users\\mmaralinganavar\\Desktop\\Java_Fun_T\\program\\class_work\\DemowebshopTest\\src\\test\\resources\\Features\\Register.feature","C:\\Users\\mmaralinganavar\\Desktop\\Java_Fun_T\\program\\class_work\\DemowebshopTest\\src\\test\\resources\\Features\\Login.feature"},
			glue ="com.DemowebshopTest.StepDefinition",
			plugin = {"usage:target/cucumber-usage.json","pretty:target/cucumber-reports/cucumber.html","pretty:target/cucumber-reports/cucumber.json","pretty:target/cucumber-reports/cucumber.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
			)
	public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

	}
}

