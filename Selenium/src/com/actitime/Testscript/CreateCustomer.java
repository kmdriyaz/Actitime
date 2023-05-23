package com.actitime.Testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CreateCustomer extends BaseClass {
@Test
public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
	HomePage h=new HomePage(driver);
	h.setTsTb();
	Reporter.log("Done");
	FileLib f=new FileLib();
	String CustomerName = f.getExcelData("CreateCustomer", 1, 2);
	String CustomerDescription = f.getExcelData("CreateCustomer", 1, 3);
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewBt().click();
	t.getNewCust().click();
	t.getEnterCustName().sendKeys(CustomerName);
	t.getEnterCustDesrp().sendKeys(CustomerDescription);
	t.getSelectIteam().click();
	TaskListPage tp=new TaskListPage(driver);
    tp.setOurCom();
	t.getCreateCust().click();
	Thread.sleep(5000);
	t.getAddNewBt().click();
	Thread.sleep(2000);
	t.getNewTask().click();
	Thread.sleep(1000);
	t.getOperation().click();
	t.getFilghtOp().click();
	t.getCheckBox().click();
	Thread.sleep(1000);
	t.getCloseBt().click();	
}
}
