package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
  
import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
	}
	public WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		Reporter.log("openBrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		@AfterClass
		public void closeBrowser() {
		Reporter.log("closeBrowser",true);
		driver.close();
		}
		@BeforeMethod
		public void login() throws IOException {
			Reporter.log("login",true);
			FileLib f=new FileLib();
			String url = f.getPropertyData("url");
			String us = f.getPropertyData("us");
			String psw = f.getPropertyData("psw");
			driver.get(url);
			LoginPage l=new LoginPage(driver);
			l.setLogin(us, psw);
		}
		
		@AfterMethod
		public void logOut() {
			Reporter.log("LogOut",true);
			HomePage h=new HomePage(driver);
			h.setLgOut();
		}
		
		
		
		
		
		
		
		
		
		
}
