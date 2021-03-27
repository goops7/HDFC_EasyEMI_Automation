package com.EasyEMI.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.EasyEMI.qa.Base.TestBase;

public class LoginPage extends TestBase {
  
	//Page factory ---Object repository: Test comment added by sachin
	
	@FindBy(id="userName")
	WebElement userName;
	
	@FindBy(id="userPassword")
	WebElement userPassword;
	
	@FindBy(xpath="//*[@id=\"loginBtn\"]/span[1]")
	WebElement LoginBtn;
	
	@FindBy(xpath= "/html/body/app-root/app-login/form/div/div[1]/span/div[1]/div/img")
	WebElement HDFCLogo;
	//Initializing page objects:
	//how to initialize the page factory objects===above
	public LoginPage() {
	//this will initialize the objects ====this keyword means will initialize the objects of current class
	// the the WebElement will initialize with driver variable
		PageFactory.initElements(driver, this);
			
	}
	//Actions: 
	public String ValidateLoginPageTitle() {
	return driver.getTitle();
	//To check HDFC Logo is present or not
	}
	public boolean validateHDFCLogo() {
	return	HDFCLogo.isDisplayed();
	}
	
	public void Login(String un, String pwd) throws Throwable   {
		userName.sendKeys(un);
		Thread.sleep(3000);
		userPassword.sendKeys(pwd);
		Thread.sleep(3000);
		LoginBtn.click();
		Thread.sleep(3000);
		
     
	}
	
	
}

