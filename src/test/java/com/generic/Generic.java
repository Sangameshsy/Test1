package com.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

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
	
	
	@BeforeTest
	public void openApp()
	{
		BrowserSetup.openBrowser(prop.getProperty("Browser"));
		driver.get(prop.getProperty("URL"));
		driver.findElement(By.name("q")).sendKeys("Gmail",Keys.ENTER);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
