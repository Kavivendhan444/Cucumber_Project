package com.Adactin.Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Adactin.Runner.Test_Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Def {

	WebDriver driver = Test_Runner.driver;
	@Given("User launch the adactin webpage")
	public void user_launch_the_adactin_webpage() {
      driver.get("https://adactinhotelapp.com/");
	}
	@When("User enter the username in username field")
	public void user_enter_the_username_in_username_field() {
      driver.findElement(By.id("username")).sendKeys("Admin1122");
	}
	@When("User enter the password in password field")
	public void user_enter_the_password_in_password_field() {
      driver.findElement(By.id("password")).sendKeys("Bgopi@2109");
	}
	@Then("User clicks the login button and User logged into the adactin webpage")
	public void user_clicks_the_login_button_and_user_logged_into_the_adactin_webpage() {
      driver.findElement(By.id("login")).click();
	}
}
