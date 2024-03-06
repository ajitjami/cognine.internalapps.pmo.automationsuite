package com.internalapps.pmo.StepDef;

import java.io.IOException;
import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.github.javafaker.Faker;
import com.internalapps.pmo.helper.Log;
import com.internalapps.pmo.pageObjects.AddUserpageobject;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adduser {
	public static WebDriver driver;
	static AddUserpageobject addUserpageobject;
	Faker faker = new Faker();
	static String Lastname;
	@When("add the user with all the required details")
	public void adding_the_user_with_all_the_required_details() throws InterruptedException, IOException 
	{
		new LoginStepDef();
		driver = LoginStepDef.driver;
		addUserpageobject = new AddUserpageobject(driver);
		addUserpageobject.click(addUserpageobject.adminbutton());
		addUserpageobject.click(addUserpageobject.adduserbutton());
		addUserpageobject.click(addUserpageobject.UserRoledropdown());
		addUserpageobject.click(addUserpageobject.searchelement(addUserpageobject.userslist(), "ESS"));
		addUserpageobject.sendKeys(addUserpageobject.EmployeeNamefield(),"chio");
		addUserpageobject.click(addUserpageobject.searchelement(addUserpageobject.Employeelist(), "Bee B Chio"));
		addUserpageobject.click(addUserpageobject.Statusdropdown());
		addUserpageobject.click(addUserpageobject.searchelement(addUserpageobject.Statuslist(), "Enabled"));
		Lastname = faker.name().lastName();
		addUserpageobject.sendKeys(addUserpageobject.Usernamefield(), Lastname);
		addUserpageobject.sendKeys(addUserpageobject.Passwordfield(), Lastname + "@123");
		addUserpageobject.sendKeys(addUserpageobject.ConfirmPasswordfield(), Lastname + "@123");
		addUserpageobject.click(addUserpageobject.savebutton());
		Log.info("user added successfully");
		
	}
	@Then("check the toast message is displayed after successfully adding the user")
	public void check_the_toast_message_is_displayed_after_successfully_adding_the_user() throws IOException
	{
		addUserpageobject.toastmessage().isDisplayed();
	}
	@When("enter the user name")
	public void enter_the_user_name() throws IOException, InterruptedException
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		addUserpageobject.sendKeys(addUserpageobject.usernamesearchfield(),Lastname);
		addUserpageobject.click(addUserpageobject.submitbutton());
	}
	@Then("verify if the user is available in the list")
	public void verify_if_the_user_is_available_in_the_list() throws IOException, InterruptedException
	{
		
		Assert.assertEquals((addUserpageobject.searchelement(addUserpageobject.searcheduserslist(),Lastname)).getText(),Lastname);
		
	}
	
	
	
}
	
	
	
	
	
	
		// driver.findElement(By.xpath("//ul[@class='oxd-main-menu']//span[text()='Admin']")).click();
		// driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium
		// oxd-button--secondary']")).click();
		// WebElement text = driver.findElement(By.xpath("//div[@class='oxd-select-text
		// oxd-select-text--active'][1]"));
		// text.click();
		//// driver.findElement(By.xpath("//*[@class='oxd-select-wrapper']")).click();
		// List<WebElement> adminOption =
		// driver.findElements(By.cssSelector("div[role='listbox']
		// div[role='option']"));
		// Thread.sleep(2000);
		// System.out.println(adminOption.size());
//		for (WebElement item : adminOption) 
//		{				
//			if (item.getText().equalsIgnoreCase("ESS")) 
//			{
//				System.out.println("item found");
//				item.click();
//				break;
//			} else
//				System.out.println("item not found");
//		}
//		driver.findElement(By.cssSelector("input[placeholder='Type for hints...']")).sendKeys("chio");
//		Thread.sleep(5000);
//		List<WebElement> employeeName = driver
//				.findElements(By.cssSelector("div[role='listbox'] div[role='option'] span"));
////		System.out.println("emp size" + employeeName.size());
//		for (WebElement empname : employeeName)
//		{
//			if (empname.getText().equalsIgnoreCase("Bee B Chio"))
//			{
//				System.out.println("item found");
//
//				empname.click();
//				break;
//			} else
//				System.out.println("item not found");
//		}
//			driver.findElement(By.xpath("(//div[@class=\"oxd-select-wrapper\"])[2]")).click();
//			List<WebElement> status = driver
//					.findElements(By.cssSelector("div[role='listbox'] div[role='option'] span"));
//			System.out.println(status.size());
//			for (WebElement statustype : status) {
//				if (statustype.getText().equals("Enabled"))
//				{
//					System.out.println("item found");
//
//					statustype.click();
//					break;
//				} else
//					System.out.println("item not found");
//
//			}
//			Faker faker = new Faker();
//			
//			   // Firstname and Lastname Generator
//			String Lastname = faker.name().lastName();
//			System.out.println(Lastname);
//			driver.findElement(By.cssSelector("input[class=\"oxd-input oxd-input--active\"][autocomplete=\"off\"]")).sendKeys(Lastname);
//			driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Password@123");
//			driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Password@123");
//			driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
//			driver.findElement(By.cssSelector("div[class=\"oxd-toast oxd-toast--success oxd-toast-container--toast\"]")).isDisplayed();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]")).sendKeys(Lastname);
//			driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
//			List<WebElement> users = driver.findElements(By.cssSelector("div[class=\"oxd-table-row oxd-table-row--with-border\"] div[class=\"card-header-slot\"] div[class=\"data\"]"));
//			
//			for (WebElement user : users) {
//				if (user.getText().equals(Lastname))
//				{
//					System.out.println("user found");
//
//					
//					break;
//				} else
//					System.out.println("user not found");
//
//			}
//	
//	}

	
