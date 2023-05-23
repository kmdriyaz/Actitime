package com.actitime.Testscript;

import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.ReportList;

public class ReportTab extends BaseClass {
     @Test
      public void customerReport() throws InterruptedException {
    	 HomePage h=new HomePage(driver);
    	 h.setrepTb();
    	 ReportList r=new ReportList(driver);
    	 r.getNewRep().click();
    	 r.getLeaveTime().click();
    	 r.getConfigRep().click();
    	// r.getSelectMon().click();
    	 Thread.sleep(1000);
    	// r.getPreMon().click();
    	 r.getDropDown().click();
    	 r.getSeleDept().click();
    	 r.getAllStaff().click();
    	 r.getCheckBox().click();
    	 r.getCloseBt().click();
    	 r.getGenBt().click();
    	 
     }
}
