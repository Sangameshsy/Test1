package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.Generic;
import com.utility.BrowserSetup;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass extends Generic
{
	@Test(priority = 0)
	public void T1()
	{
		System.out.println(" 1 st test");
		
	}

	@Test(priority = 1,enabled = true)
	public void T2()
	{
		System.out.println(" 2 st test");
		
	}
	
}
