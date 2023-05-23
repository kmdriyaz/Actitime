package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name="username")
	private WebElement untbx;
	@FindBy(name="pwd")
	private WebElement pwtbx;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbt;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogin(String us,String psw) {
		untbx.sendKeys(us);
		pwtbx.sendKeys(psw);
		lgbt.click();
	}
}
