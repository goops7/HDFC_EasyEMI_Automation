package com.EasyEMI.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.EasyEMI.qa.Util.TestUtil;

public class TestBase {

	//this class is parent of all the classes created in project
	
  public static WebDriver driver;
  public static Properties prop;
	
	
	 public TestBase()  {
		//Read properties file 
		 try {
			prop= new Properties();
			FileInputStream fi= new FileInputStream("C:\\Users\\Lenovo\\git\\repository\\HDFC_CD_EasyEMI\\src\\main\\java\\com\\EasyEMI\\qa\\Config\\Config.properties");
			prop.load(fi);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
	 }
	public static void initialization() {
		String BrowserName= prop.getProperty("Brower");
		if (BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\git\\repository\\HDFC_CD_EasyEMI\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			System.out.println("Chrome brower executed");
		}else if (BrowserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Automation\\HDFC_CD_EasyEMI\\"
					+ "+Drivers\\geckodriver.exe");
			driver= new FirefoxDriver();
//			else {
//				System.out.println("Enter correct BrowserName");
//			}
			
		}{
			//created class testUtil for load timeout and used here instead of hard coded values
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
			driver.get(prop.getProperty("URL"));
			
		}
	}
	
}
