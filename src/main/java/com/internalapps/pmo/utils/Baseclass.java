package com.internalapps.pmo.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.internalapps.pmo.helper.Log;

public class Baseclass extends Driversetup implements WebElement
{
	public static WebDriver driver;
	private static WebDriverWait wait;
	public Baseclass(WebDriver driver) 
	{
        Baseclass.driver = driver;
    }
	
	 public static WebElement findElement(String elementLocator, String selector) throws IOException 
	 {
		 
		 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        if (driver == null) 
	        {
	            throw new IllegalStateException("Driver not initialized. Call setDriver() first.");
	        }
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	        switch (selector) 
	        {
	        
	            case "xpath":
	                return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(elementLocator))));
	            case "id":
	                return driver.findElement(By.id(elementLocator));
	            case "link text":
	                return driver.findElement(By.linkText(elementLocator));
	            case "partial link text":
	                return driver.findElement(By.partialLinkText(elementLocator));
	            case "name":
	                return driver.findElement(By.name(elementLocator));
	            case "tag name":
	                return driver.findElement(By.tagName(elementLocator));
	            case "class name":
	                return driver.findElement(By.className(elementLocator));
	            case "css selector":
	                return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(elementLocator))));
	            default:
	                return wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(elementLocator))));
	              //  throw new IllegalArgumentException("Unsupported selector type: " + selector);
	        }
	      
	 }
	 public static List<WebElement> findElements(String elementLocator, String selector) throws IOException 
	 {
		 
		
	        if (driver == null) 
	        {
	            throw new IllegalStateException("Driver not initialized. Call setDriver() first.");
	        }
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	        switch (selector) 
	        {
	            case "xpath":
	                return driver.findElements(By.xpath(elementLocator));
	            case "id":
	                return driver.findElements(By.id(elementLocator));
	            case "link text":
	                return driver.findElements(By.linkText(elementLocator));
	            case "partial link text":
	                return driver.findElements(By.partialLinkText(elementLocator));
	            case "name":
	                return driver.findElements(By.name(elementLocator));
	            case "tag name":
	                return driver.findElements(By.tagName(elementLocator));
	            case "class name":
	                return driver.findElements(By.className(elementLocator));
	            case "css selector":
	                return driver.findElements(By.cssSelector(elementLocator));
	            default:
	                return driver.findElements(By.cssSelector(elementLocator));
	              //  throw new IllegalArgumentException("Unsupported selector type: " + selector);
	        }
	      
	 }
	 public WebElement searchelement(List<WebElement> list, String text)
	 {
		
		 for (WebElement item : list) 
			{	
			
				if (item.getText().equalsIgnoreCase(text)) 
				{
					
					return item;
				} 
				
				
			}
		return null;
		
		
	 }
	 
	 public Properties getProperties(String propertiesFileName) throws IOException
	 {
		 	Properties prop = new Properties();
			String paths = System.getProperty("user.dir") + "\\src\\main\\java\\config\\"+propertiesFileName;
			FileInputStream fis = new FileInputStream(paths);
			prop.load(fis);
			return prop;
	 }
	 public void click(WebElement element) 
	 {
		 
		element.click();
		Log.info("element clicked");
	 }
	 public void sendKeys(WebElement element, String text)
	  {
		  element.sendKeys(text);
	  }

	@Override
	public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public void submit() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTagName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAttribute(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSelected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebElement> findElements(By by) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WebElement findElement(By by) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Point getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension getSize() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Rectangle getRect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCssValue(String propertyName) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void click() {
		// TODO Auto-generated method stub
		
	}


	public void sendKeys(CharSequence... keysToSend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
	
		
	public static By getByLocator(String locatorValue, String locatorType) {
        switch (locatorType) {
            case "id":
                return By.id(locatorValue);
            case "name":
                return By.name(locatorValue);
            case "css selector":
                return By.cssSelector(locatorValue);
            case "xpath":
                return By.xpath(locatorValue);
            // Add more cases as needed for other locator types
            default:
                throw new IllegalArgumentException("Invalid locator type: " + locatorType);
               
        }
    }
	public WebElement waitforelement(By locator) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		System.out.println(locator);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Log.info("Element found");
               return element;
    }
	
	
		public void WaitForElement(WebElement element,Duration timeOutInSeconds){
			Log.info("waiting for element visibilityOf..");
			WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
			wait.until(ExpectedConditions.visibilityOf(element));
			Log.info("element is visible..");
		}
	
}