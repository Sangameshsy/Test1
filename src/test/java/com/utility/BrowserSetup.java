package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.generic.ObjectRepo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup extends ObjectRepo
{
	public static WebDriver openBrowser(String browser)
	{
		if( browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		else if(browser.equalsIgnoreCase("IE"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		
		else
		{
			driver =null;
		}
		
		return driver;
	}
	
}
