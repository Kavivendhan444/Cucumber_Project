package com.Adactin.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\kaviv\\eclipse-workspace\\Cucumber\\src\\test\\java\\com\\Adactin\\feature\\adactin.feature"
,glue = "com.Adactin.Stepdefinition" 
, monochrome = true , dryRun = false , tags = "@smoketest" ,publish = true, plugin = {"pretty",
		"json:Reports/cucumber-reports/Cucumber.json", "html:Reports/cucumber-reports.html" })

public class Test_Runner {
	
 public static WebDriver driver;
	
	@BeforeClass
	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();	
	}
	@AfterClass
	public static void close() {
		driver.close();
	}
}
