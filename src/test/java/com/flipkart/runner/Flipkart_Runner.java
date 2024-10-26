package com.flipkart.runner;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\kaviv\\eclipse-workspace\\Cucumber\\src\\test\\java\\com\\flipkart\\feature\\flipkart.feature" + "",
		glue = "com.flipkart.stepdefinition",
		monochrome = true, 
		dryRun = true, 
		tags = "@smoketest", 
		publish = true,
		plugin = {"pretty", "json:Reports/cucumber-reports/Cucumber1.json", "html:Reports/cucumber-reports1.html"})

public class Flipkart_Runner {
	
	public static WebDriver driver;
	@BeforeClass
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@AfterClass
	public static void closeBrowser() {
		driver.close();
	}
	
	
}
