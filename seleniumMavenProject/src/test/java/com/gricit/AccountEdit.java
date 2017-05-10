package com.gricit;

import org.common.Utility;
import org.common.WebDriverHelper;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AccountEdit extends WebDriverHelper {

	Utility utility = new Utility();
	By firstNameVerify = By.xpath("//td[text()='First Name:']");

	By editfirstname = By.xpath("//input[@name='firstname']");
	By clickContinue = By.xpath("//span[text()='Continue']");

	public void accountEditingPageVerfiy() {
		String firstnametxt = utility.getElementText(firstNameVerify);
		Assert.assertEquals(firstnametxt, "First Name:");
	}

	public void typeNewName() throws Exception {
		utility.typeInto(editfirstname, "Caroline");
	}

	public void getElementText() {
		String getNewNameg = utility.getElementText(editfirstname);
		Assert.assertEquals(getNewNameg, "Carolin");

	}

	public void clickContinueBtn() {
		utility.clickOn(clickContinue);
	}

}
