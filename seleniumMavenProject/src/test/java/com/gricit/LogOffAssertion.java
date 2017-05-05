package com.gricit;

import org.common.Utility;
import org.common.WebDriverHelper;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LogOffAssertion extends WebDriverHelper {
	Utility utility = new Utility();
	By logOfftext = By.xpath("//h1[text()='Log Off']");
	By clickOn = By.xpath("//span[text()='Continue']");
public void verfeyLogOff (){
	String logOffTxt = utility.getElementText(logOfftext);
	Assert.assertEquals(logOffTxt, "Log Off");
	
}
public void clickOnContinueNext(){
	utility.clickOn(clickOn);
}
	
}
	
