package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.Utility.TestUtil;

public class TestBase {
	TestUtil util;
	public static WebDriver driver;
	public static Properties prop;
	
	public String propFile ="/Users/jamila/eclipse-workspace/Target_Automation_Final/src/main/java/com/Configuration/config.properties";
	
	// creating Constractor
	public TestBase() {
		prop = new Properties();
		try {
			FileInputStream file = new FileInputStream(propFile);
			try {
				prop.load(file);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}		
	}
	//Initializations
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/jamila/eclipse-workspace/Target_Automation_Final/Drivers/chromedriver 2");
			driver = new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "/Users/jamila/eclipse-workspace/Target_Automation_Final/Drivers/geckodriver");
			driver = new FirefoxDriver();
		}else {
			driver = new SafariDriver();
		}
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
//		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_Wait_Time, TimeUnit.MILLISECONDS);
//		driver.manage().timeouts().implicitlyWait(TestUtil.implicit_Wait_Time, TimeUnit.MILLISECONDS);
		driver.get(prop.getProperty("url"));
		
		
	}
	
	
	

}
