package com.EasyEMI.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.EasyEMI.qa.Base.TestBase;

public class LoginPage extends TestBase {
  
	//Page factory ---Object repository
	
	@FindBy(id="userName")
	WebElement userName;
	
	@FindBy(id="userPassword")
	WebElement userPassword;
	
	@FindBy(xpath="//*[@id=\"loginBtn\"]/span[1]")
	WebElement LoginBtn;
	
	//how to initialize the page factory objects===above
	public LoginPage() {
	//this will initialize the objects ====this keyword means will initialize the objects of current class
	// the the WebElement will initialize with driver variable
		PageFactory.initElements(driver, this);
		
	}
	
	
}
