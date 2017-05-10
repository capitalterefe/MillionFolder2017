package com.gricit;

import org.common.Utility;
import org.common.WebDriverHelper;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ChangeMyAccountAssertion extends WebDriverHelper{
	
	Utility utility = new Utility();
	By changeName = By.xpath(".//*[@id='bodyContent']/table/tbody/tr/td");
	




 public void successfulNameChange(){
	String successfulTxt = utility.getElementText(changeName);
	Assert.assertEquals(successfulTxt, "Your account has been successfully updated");
	 
	 
 }
}