package com.gricit;

import org.common.Utility;
import org.common.WebDriverHelper;
import org.openqa.selenium.By;


public class AccountInformation extends WebDriverHelper {

	Utility utility = new Utility();
	By firstName = By.name("firstname");
	By lastName = By.name("lastname");
	By dateOfBirth = By.name("dob");
	By email = By.name("email_address");
	By companyName = By.name("company");
	By streetAddress = By.name("street_address");
	By suburb = By.name("suburb");
	By postCode = By.name("suburb");
	By city = By.name("city");
	By state = By.name("state");
	By country = By.cssSelector("Algeria");
	By telephoneNumber = By.name("telephone");
	By faxNumber = By.name("fax");
	By newsLetter = By.name("newsletter");
	By password = By.name("newsletter");
	By passwordConfirmationTxt = By.name("newsletter");
	By selectDropDownElement = By.xpath("//select[@name='country']");
	By continueBtn = By.xpath("//span[text()='Continue']");
	// This is what we trying to avoid
	public void typeFirstName() {
		// firstName = driver.findElement(By.name("firstname"));
		// firstName.sendKeys("MY FirstName");
	}


	public void registration() throws Exception {
		utility.typeInto(lastName, "Terefe");
		utility.typeInto(firstName, "Capital");
		utility.selectDropDownByVisibleTxt(selectDropDownElement, "Albania");

	}

}
