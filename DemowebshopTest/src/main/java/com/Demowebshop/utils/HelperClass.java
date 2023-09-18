package com.Demowebshop.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperClass {
	private static HelperClass helperClass;
	private static WebDriver driver;
	private static WebDriverWait wait;
	public final static int TimeOUT = 10;
	
	
	HelperClass() {
		// TODO Auto-generated constructor stub
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver,Duration.ofSeconds(TimeOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeOUT));
		driver.manage().window().maximize();
	}
	
	public static void openPage(String url) {
		driver.get(url);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setUpDriver() {
		if(helperClass==null) {
			helperClass = new HelperClass();
		}
	}
	public static void tearDown() {
		if(helperClass!=null) {
			driver.quit();
		}
		helperClass = null;
	}

}
