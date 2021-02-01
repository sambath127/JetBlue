package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.pojo.POJOClass;

import cucumber.api.Argument;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage extends BaseClass {
		
		
	@Given(":User has to be there in login page")
	public void user_has_to_be_there_in_login_page() {
	    loadDriver();
		loadurl("https://www.jetblue.com/");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		POJOClass c= new POJOClass();
		buttonClick(c.getLogo());
		buttonClick(c.getSignin());
		
	}

	@When(": user has to be enter username and password")
	public void user_has_to_be_enter_username_and_password() {
		POJOClass c= new POJOClass();
	  fill(c.getEmail(), "sambath.srm@gmail.com");
	  fill(c.getPassword(), "Chennai@1212");
	 
	}

	@When(": user clicks the login button")
	public void user_clicks_the_login_button() {
		POJOClass c= new POJOClass();
	 buttonClick(c.getSign());
	}

	@Then(": user has to be navigate home page")
	public void user_has_to_be_navigate_home_page() {
		System.out.println("user has to navigate to home page");
	}



}
