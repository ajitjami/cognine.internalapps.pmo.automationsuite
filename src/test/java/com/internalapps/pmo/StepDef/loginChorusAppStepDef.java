package com.internalapps.pmo.StepDef;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.internalapps.pmo.helper.waitHelper;
import com.internalapps.pmo.pageObjects.loginChorusAppPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginChorusAppStepDef {
	
	public  static WebDriver driver;
	loginChorusAppPage loginChrous;
	
	
	@Given("^user lanuch the chrous website \"([^\"]*)\"$")
		public void i_am_on_the_Login_page_URL(String args1) throws Throwable {
			
		driver.get(args1);
			
		}
	
	@When("^user enters the credentials$")
	public void userEntersCredentials() throws IOException {
		loginChrous.userCredentials();
	}
	
	@Then("^user should be on dashboard page$")
	public void dashboardIsDisplayed() {
		
	}
	
}
