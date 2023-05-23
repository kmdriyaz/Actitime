package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addNewBt; 
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newCust;
	
	@FindBy(xpath = "//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement enterCustName;
	
	@FindBy(xpath = "//textarea[@class='textarea' and @placeholder='Enter Customer Description']")
	private WebElement enterCustDesrp;
	
	@FindBy(xpath = "//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectIteam;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement ourCom;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createCust;
	
	@FindBy(xpath = "//div[text()='+ New Tasks' and @class='item createNewTasks']")
	private WebElement newTask;
	
	@FindBy(xpath = "//div[text()='- Select Project -' and @class='emptySelection']")
	private WebElement Operation;
	@FindBy(xpath = "//div[text()='Flight operations' and @class='itemRow cpItemRow ']")
	private WebElement filghtOp;
	
	public WebElement getFilghtOp() {
		return filghtOp;
	}

	public WebElement getOperation() {
		return Operation;
	}

	@FindBy(xpath = "(//span[@class='checkmark checkMark'])[1]")
    private WebElement checkBox;
	@FindBy(xpath = "//div[@id='closeCreateTasksPopupButton']")
	private WebElement closeBt;
	
	
	public WebElement getCloseBt() {
		return closeBt;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getOurCom() {
		return ourCom;
	}

	public WebElement getNewTask() {
		return newTask;
	}

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBt() {
		return addNewBt;
	}

	public WebElement getNewCust() {
		return newCust;
	}

	public WebElement getEnterCustName() {
		return enterCustName;
	}

	public WebElement getEnterCustDesrp() {
		return enterCustDesrp;
	}

	public WebElement getSelectIteam() {
		return selectIteam;
	}

	public void setOurCom() {
		ourCom.click();
	}

	public WebElement getCreateCust() {
		return createCust;
	}

}
