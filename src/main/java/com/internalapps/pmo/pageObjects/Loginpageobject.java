package com.internalapps.pmo.pageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.internalapps.pmo.helper.Log;
import com.internalapps.pmo.helper.waitHelper;
import com.internalapps.pmo.utils.Baseclass;


public class Loginpageobject extends Baseclass
{
	Properties prop,properties;
	public static WebDriver driver;
	public Loginpageobject(WebDriver driver,Properties properties) throws IOException
	{
		super(driver);
		prop = getProperties("login.properties");
		this.properties=properties;
	}
	public WebElement username() throws IOException 
	{
		
		return findElement(prop.getProperty("username"),"css selector");
		
	}
				
	public WebElement password() throws IOException 
	{
		return findElement(prop.getProperty("password"),"css selector");
					
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
	
	
}
