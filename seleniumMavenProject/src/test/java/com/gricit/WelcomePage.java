package com.gricit;

import org.common.ConfigProperty;
import org.common.Utility;
import org.common.WebDriverHelper;
import org.openqa.selenium.By;

public class WelcomePage extends WebDriverHelper {
	ConfigProperty config = new ConfigProperty();
	Utility utility = new Utility();
	By continueBtn = By.id("tdb4");
	By emailAddress = By.xpath("//input[@name='email_address']");
	By password = By.xpath("//input[@name='password']");
	By signButton = By.xpath("//span[text()='Sign In']");

	public void clickContiueButton() {
		utility.clickOn(continueBtn);
	}

	public void signIn() {
		utility.typeInto(emailAddress, config.getUserName());
		utility.typeInto(password, config.getPassword());
		utility.clickOn(signButton);
	}

}
