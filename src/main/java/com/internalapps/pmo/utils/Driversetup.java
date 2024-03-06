package com.internalapps.pmo.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import com.github.javafaker.Options;
import com.internalapps.pmo.enums.Browsers;
import com.internalapps.pmo.enums.OS;

public class Driversetup {
	public static WebDriver driver;
	static Properties prop;
	static String browserType;
	static Baseclass baseclass;
	public static String username;
	public static String password;
	static {
		try {
			// Load properties file
			prop = new Properties();
			String paths = System.getProperty("user.dir") + "\\src\\main\\java\\config\\setup.properties";
			FileInputStream fis = new FileInputStream(paths);
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static WebDriver launchDriverWindows() throws IOException {

	//	browserType = prop.getProperty("browser");
		if (System.getProperty("os.name").toLowerCase().contains(OS.WINDOWS.name().toLowerCase())) {

			if (browserType.equalsIgnoreCase(Browsers.CHROME.name())) {
				ChromeOptions Options = new ChromeOptions();
				Options.setAcceptInsecureCerts(true);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			} else if (browserType.equalsIgnoreCase(Browsers.FIREFOX.name())) {
				FirefoxOptions Options = new FirefoxOptions();
				Options.setAcceptInsecureCerts(true);
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
			} else if (browserType.equalsIgnoreCase(Browsers.IE.name())) {
				InternetExplorerOptions Options = new InternetExplorerOptions();
				Options.setAcceptInsecureCerts(true);
				driver = new EdgeDriver();
				driver.manage().window().maximize();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

		}
		return driver;
	}

	public static WebDriver launchDriverMac() throws IOException {

		browserType = prop.getProperty("browser");
		if (System.getProperty("os.name").toLowerCase().contains(OS.MAC.name().toLowerCase())) {

			if (browserType.equalsIgnoreCase(Browsers.CHROME.name())) {
				
				ChromeOptions Options = new ChromeOptions();
				Options.setAcceptInsecureCerts(true);driver = new ChromeDriver();
				driver.manage().window().maximize();
			} else if (browserType.equalsIgnoreCase(Browsers.FIREFOX.name())) {
				FirefoxOptions Options = new FirefoxOptions();
				Options.setAcceptInsecureCerts(true);
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
			} else if (browserType.equalsIgnoreCase(Browsers.SAFARI.name())) {
				SafariOptions Options = new SafariOptions();
				Options.setAcceptInsecureCerts(true);
				driver = new SafariDriver();
				driver.manage().window().maximize();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

		}
		return driver;
	}

	public static Properties launchapplication() throws IOException {
		String env = prop.getProperty("Env");
		if (env.equalsIgnoreCase("dev")) {

			baseclass = new Baseclass(driver);
			prop = baseclass.getProperties("DevEnvironment.properties");
			driver.get(prop.getProperty("DevURL"));

		} else if (env.equalsIgnoreCase("qa")) {

			baseclass = new Baseclass(driver);
			prop = baseclass.getProperties("QAEnvironment.properties");
			driver.get(prop.getProperty("QAURL"));

		}

		return prop;
	}

	public void teardown() {
		driver.quit();
	}

}
