package com.gricit;

import org.common.WebDriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistraionPage extends WebDriverHelper {

	WebElement continueButton;

	public void clickContiueButton() {
		continueButton = driver.findElement(By.id("tdb4"));

		continueButton.click();
	}

}
