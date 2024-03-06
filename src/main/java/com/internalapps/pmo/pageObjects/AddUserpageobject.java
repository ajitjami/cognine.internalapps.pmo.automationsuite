package com.internalapps.pmo.pageObjects;


import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.internalapps.pmo.helper.Log;
import com.internalapps.pmo.utils.Baseclass;

public class AddUserpageobject extends Baseclass
{
	Properties prop;
	public static WebDriver driver;
	private WebDriverWait wait;
	public AddUserpageobject(WebDriver driver) throws IOException
	{
		super(driver);
		prop=getProperties("adduser.properties");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	public WebElement adminbutton() throws IOException 
	{
		return wait.until(ExpectedConditions.elementToBeClickable(findElement(prop.getProperty("admin"),"xpath")));
		
	}
	public WebElement adduserbutton() throws IOException 
	{
		return wait.until(ExpectedConditions.elementToBeClickable(findElement(prop.getProperty("adduser"),"xpath")));
					
	}
	public WebElement UserRoledropdown() throws IOException
	{
		return wait.until(ExpectedConditions.elementToBeClickable(findElement(prop.getProperty("UserRole"),"xpath")));
					
	}
	public List<WebElement> userslist() throws IOException 
	{
		return findElements(prop.getProperty("userslist"),"css selector");
					
	}
	public WebElement EmployeeNamefield() throws IOException 
	{
		return wait.until(ExpectedConditions.elementToBeClickable(findElement(prop.getProperty("EmployeeName"),"css selector")));
					
	}
	public List<WebElement> Employeelist() throws IOException 
	{
		return findElements(prop.getProperty("Employeelist"),"css selector");
					
	}
	public WebElement Statusdropdown() throws IOException 
	{
		return wait.until(ExpectedConditions.elementToBeClickable(findElement(prop.getProperty("Status"),"xpath")));
					
	}
	public List<WebElement> Statuslist() throws IOException 
	{
		return findElements(prop.getProperty("Statuslist"),"css selector");
					
	}
	public WebElement Usernamefield() throws IOException 
	{
		return findElement(prop.getProperty("Username"),"css selector");
					
	}
	public WebElement Passwordfield() throws IOException 
	{
		return wait.until(ExpectedConditions.elementToBeClickable(findElement(prop.getProperty("Password"),"css selector")));
					
	}
	public WebElement ConfirmPasswordfield() throws IOException 
	{
		return findElement(prop.getProperty("ConfirmPassword"),"xpath");
					
	}
	public WebElement savebutton() throws IOException 
	{
		return findElement(prop.getProperty("save"),"css selector");
					
	}
	public WebElement toastmessage() throws IOException 
	{
		return wait.until(ExpectedConditions.elementToBeClickable(findElement(prop.getProperty("toastmessage"),"css selector")));
					
	}
	public WebElement usernamesearchfield() throws IOException, InterruptedException 
	{
		Thread.sleep(5000);
		return waitforelement(getByLocator(prop.getProperty("usernamesearch"),"xpath"));
					
	}
	public WebElement submitbutton() throws IOException 
	{
		return findElement(prop.getProperty("submit"),"css selector");
					
	}
	public List<WebElement> searcheduserslist() throws IOException, InterruptedException 
	{
		Thread.sleep(5000);
		return findElements(prop.getProperty("searcheduserslist"),"css selector");
					
	}
	
	
	
	
	
	
	
	
}
