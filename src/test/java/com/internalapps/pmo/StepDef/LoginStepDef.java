package com.internalapps.pmo.StepDef;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.internalapps.pmo.pageObjects.Loginpageobject;
import com.internalapps.pmo.utils.Baseclass;
import com.internalapps.pmo.utils.Driversetup;

import io.cucumber.java.en.When;

public class LoginStepDef
{

public static WebDriver driver;
Loginpageobject loginpage;
@When("user enter login credetails")
public void user_enter_login_credetails() throws IOException {
	 driver=Driversetup.launchDriverWindows();
	 Properties prop=Driversetup.launchapplication();	 
	loginpage=new Loginpageobject(driver,prop);
	loginpage.sendKeys(loginpage.username(),loginpage.usernamevalue());
	loginpage.sendKeys(loginpage.password(),loginpage.passwordvalue());
  
}

@When("click on login button and check user navigated to home page")
public void click_on_login_button_and_check_user_navigated_to_home_page() throws IOException {
	
	loginpage.click(loginpage.login());
//    By locator=By.cssSelector("button[type='submit']");
//       WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(locator));
//      element.click();
    //driver.findElement(By.cssSelector("button[type='submit']")).click();
    
}

}
