package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id="logoutLink")
	private WebElement lgout;
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement tsTb;
	@FindBy(xpath="//div[text()='Reports' and @class='label']")
	private WebElement repTb;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setLgOut() {
		lgout.click();
	}
	
	public void setTsTb() {
		tsTb.click();
	}
	public void setrepTb() {
		repTb.click();
	}
	
}
