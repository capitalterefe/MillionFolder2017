package com.gricit;

import org.common.Utility;
import org.common.WebDriverHelper;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AccountEdit extends  WebDriverHelper { 
	
	
	Utility utility = new Utility();
    By firstNameVerify = By.xpath("//td[text()='First Name:']");
    By rewritename =By.xpath("//input[@name='firstname']");
    By editfirstname = By.xpath("//input[@name='firstname']");
    
    
    
    public void accountEditingPageVerfiy(){
    	String firstnametxt =utility.getElementText(firstNameVerify);
    	Assert.assertEquals(firstnametxt, "First Name:");
    }
	
	
	
   public void typeNewName() {
	   utility.typeInto(editfirstname, "Caroline");
   }
}
