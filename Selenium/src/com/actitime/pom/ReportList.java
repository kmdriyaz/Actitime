package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportList {
@FindBy(xpath="//span[.='New Report']")
private WebElement newRep;
@FindBy(xpath="//div[.='Leave Time & Balances']")
private WebElement leaveTime;
@FindBy(xpath = "//div[.='Configure Report Parameters']")
private WebElement configRep;
@FindBy(xpath = "//td[@class='middle-left-cell contents customRightPart']")
private WebElement selectMon;
@FindBy(xpath = "  ")
private WebElement preMon;
@FindBy(xpath = "(//button[@type='button' and @class='x-btn-text'])[2]")
private WebElement dropDown;
@FindBy(xpath="//a[.='Departments' and @class='x-menu-item']")
private WebElement seleDept;
@FindBy(xpath = "//span[text()='All Staff' and @class=' hierarchySelectorButton']")
private WebElement allStaff;
@FindBy(xpath = "//label[.='Include users without data' and @class='x-form-cb-label']")
private WebElement checkBox;
@FindBy(xpath = "(//span[.='Close'])[1]")
private WebElement closeBt;
@FindBy(xpath = "(//span[.='Generate HTML Report' and @class='innerLabel'])[2]")
private WebElement genBt;

public ReportList(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getNewRep() {
	return newRep;
}

public WebElement getLeaveTime() {
	return leaveTime;
}

public WebElement getConfigRep() {
	return configRep;
}

public WebElement getSelectMon() {
	return selectMon;
}

public WebElement getPreMon() {
	return preMon;
}

public WebElement getDropDown() {
	return dropDown;
}

public WebElement getSeleDept() {
	return seleDept;
}

public WebElement getAllStaff() {
	return allStaff;
}

public WebElement getCheckBox() {
	return checkBox;
}

public WebElement getCloseBt() {
	return closeBt;
}

public WebElement getGenBt() {
	return genBt;
}














}
