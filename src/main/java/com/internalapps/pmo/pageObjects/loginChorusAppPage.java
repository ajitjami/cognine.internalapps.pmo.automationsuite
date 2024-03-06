package com.internalapps.pmo.pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.internalapps.pmo.helper.waitHelper;
import com.internalapps.pmo.utils.Baseclass;

public class loginChorusAppPage extends Baseclass {
	
	Properties prop,properties;
	public static WebDriver driver;
	
	waitHelper waitHelper;
	public loginChorusAppPage(WebDriver driver,Properties properties) throws IOException
	{
		super(driver);
		prop = getProperties("login.properties");
		this.properties=properties;
	}
	public WebElement username() throws IOException 
	{
		
		return findElement(prop.getProperty("username"),"id");
		
	}
	
	public WebElement nextButton() throws IOException {
		return findElement(prop.getProperty("next_button"),"id");
	}
				
	public WebElement password() throws IOException 
	{
		return findElement(prop.getProperty("password"),"xpath");
					
	}
	public WebElement login() throws IOException 
	{
		return findElement(prop.getProperty("login"),"xpath");
					
	}
	public String usernamevalue()
	{
		return(properties.getProperty("usernamevalue"));
	}
	public String passwordvalue()
	{
		return(properties.getProperty("passwordvalue"));
	}
	
	public void userCredentials() throws IOException {
		username().sendKeys(username);
		nextButton().click();
		password().sendKeys(password);
		login().click();
	}

}
