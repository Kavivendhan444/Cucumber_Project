package com.flipkart.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.runner.Flipkart_Runner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_def {
	
	static Actions act;
	WebDriver driver = Flipkart_Runner.driver;
	@Given("Enter the url of flipkart webpage")
	public void enter_the_url_of_flipkart_webpage() {
	   driver.get("https://www.flipkart.com/");
	   driver.manage().window().maximize();
	}
	@When("User enter the flipkart webpage using url")
	public void user_enter_the_flipkart_webpage_using_url() {
	    System.out.println(driver.getTitle());
	}
	@Then("User entered the flipkart webpage")
	public void user_entered_the_flipkart_webpage() {
	    System.out.println(driver.getTitle());
	}
	
	@When("User clicks the login button in home page")
	public void user_clicks_the_login_button_in_home_page() {
		
	}
	@Then("User enter the login webpage")
	public void user_enter_the_login_webpage() {
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}
	
	@When("User clicks the create new account url")
	public void user_clicks_the_create_new_account_url() {
	    System.out.println(driver.getCurrentUrl());
	}
	@When("User enters the phone number in the phone number field")
	public void user_enters_the_phone_number_in_the_phone_number_field() {
		driver.findElement(By.xpath("//a[contains(text(),'New to Flipkart? Create an account')]")).click();
	}
	@Then("The number entered in the given count")
	public void the_number_entered_in_the_given_count() {
		driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("9876543210");
	}
	
	@When("User move to the element electronics")
	public void user_move_to_the_element_electronics() {
		act = new Actions(driver);
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		act.moveToElement(electronics).build().perform();
	}
//	@When("User clicks the mobiles link")
//	public void user_clicks_the_mobiles_link() {
//		WebElement Mobiles = driver.findElement(By.xpath("//a[@class='jBYtJt cNDIdi CP4tVY']"));
//		Mobiles.click();
//	}
//	@When("User enters the Mobiles webpage")
//	public void user_enters_the_mobiles_webpage() {
//		WebElement mobileText = driver.findElement(By.xpath("//h1[text()='Mobiles Big Shopping Utsav']"));
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOf(mobileText));
//		
//	}
//	@When("User navigate back to the Create new account page")
//	public void user_navigate_back_to_the_create_new_account_page() {
//		driver.navigate().back();
//	}
//	@Then("User navigates back to the create new account page ")
//	public void User_Enter_The_Create_Acc_Page() {
//	    System.out.println(driver.getTitle());
//	}
}
