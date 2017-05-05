package com.gricit;

import org.common.Utility;
import org.common.WebDriverHelper;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterUserHomePage extends WebDriverHelper {
	Utility utility = new Utility();
	By btnVerfy = By.xpath("//div[text()='Categories']");

	public void verifyRegisterUserHomePage() {
		String Catagoriestxt = utility.getElementText(btnVerfy);
		Assert.assertEquals(Catagoriestxt, "Categories");
	}
}