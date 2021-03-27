package com.EasyEMI.qa.TestCases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.EasyEMI.qa.Base.TestBase;
import com.EasyEMI.qa.Pages.LoginPage;

public class LoginPageTest extends TestBase {
 
	LoginPage loginpage;
	
	//Why super keyword?
	//firstly it will call super class constructor bcz want to initialize my property also
	// bcz in initialization method prop is used in order to use that super constructor called
	//so compulsory to call TestBase class constructor so how to call super class constructor by 
	//using super keyword
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void Setup() {
		initialization();
			loginpage= new LoginPage();
	}
			@Test(priority = 1)
			public void loginPageTitleTest() {
			String title=loginpage.ValidateLoginPageTitle();
			System.out.println(title);
			//Assert.assertEquals("title", "EasyEMI");
			}
			@Test(priority = 2)
			public void LogintoApplication() throws Throwable {
				loginpage.Login(prop.getProperty("Username"), prop.getProperty("Password"));
				
			}
		
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
	
		
		
	}
	
	

