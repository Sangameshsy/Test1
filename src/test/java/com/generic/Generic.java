package com.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.utility.BrowserSetup;

public class Generic extends ObjectRepo
{
	FileInputStream fis;
	Properties prop;
	
	@BeforeSuite
	public void setUp()
	{
		try {
			fis = new FileInputStream("./Config/config.properties");
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Parameters("Browser")
	@BeforeTest
	public void openApp(String BrowserType)
	{
//		BrowserSetup.openBrowser(prop.getProperty("Browser"));
		BrowserSetup.openBrowser(BrowserType);
		driver.get(prop.getProperty("URL"));
		driver.findElement(By.name("q")).sendKeys("Gmail",Keys.ENTER);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
