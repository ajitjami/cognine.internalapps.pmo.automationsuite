package com.internalapps.pmo.helper;


import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitHelper {
	
	

		Logger logger = loggerHelper.getLogger(waitHelper.class);
		
		private WebDriver driver;
		
		public void WaitHelper(WebDriver driver){
			this.driver = driver;
		}
		
		public void WaitForElement(WebElement element,Duration i){
			logger.info("waiting for element visibilityOf..");
			WebDriverWait wait = new WebDriverWait(driver, i);
			wait.until(ExpectedConditions.visibilityOf(element));
			logger.info("element is visible..");
		}
		
	

}
