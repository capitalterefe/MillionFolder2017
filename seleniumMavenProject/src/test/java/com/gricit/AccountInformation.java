package com.gricit;

import org.common.Utility;
import org.common.WebDriverHelper;
import org.openqa.selenium.By;


public class AccountInformation extends WebDriverHelper {

	Utility utility = new Utility();
	By gender = By.xpath("//input[@value='f']");
	By Name = By.name("firstname");
	By lastName = By.name("lastname");
	By dateOfBirth = By.name("dob");
	By email = By.name("email_address");
	By companyName = By.name("company");
	By streetAddress = By.name("street_address");
	By suburb = By.name("suburb");
	By postCode = By.name("postcode");
	By city = By.name("city");
	By state = By.name("state");
	By selectDropDownElement = By.xpath("//select[@name='country']");
	By telephoneNumber = By.name("telephone");
	By faxNumber = By.name("fax");
	By newsLetter = By.name("newsletter");
	By password = By.name("newsletter");
	By passwordConfirmationTxt = By.name("newsletter");
    By continueBtn = By.xpath("//span[text()='Continue']");
    
	// This is what we trying to avoid
	public void typeFirstName() {
		// firstName = driver.findElement(By.name("firstname"));
		// firstName.sendKeys("MY FirstName");
	}
     public void registration() throws Exception {
   	utility.clickOn(gender);
    utility.typeInto(Name, "Suzan");
	utility.typeInto(lastName, "Knoll");
	utility.typeInto(dateOfBirth, "01/10/2004");
	utility.typeInto(email, "suzanknoll@gmail.com");
	utility.typeInto(companyName, "knoll DDS");
	utility.typeInto(streetAddress, "1907 East West HWY");
	utility.typeInto(suburb, "Fredrik");
	utility.typeInto(postCode,"3456");
	utility.typeInto(city, "Bethesda");
	utility.typeInto(state, "Maryland");
	utility.selectDropDownByVisibleTxt(selectDropDownElement, "Germany");
	utility.typeInto(telephoneNumber, "1-301-593-9528");
	utility.typeInto(faxNumber, "1-301-593-0049");
	utility.clickOn(newsLetter);
	utility.typeInto(password, "Selenium_batch@2017");
	utility.typeInto(passwordConfirmationTxt, "Selenium_batch@2017");
	//utility.clickOn(continueBtn);
	Thread.sleep(6000);
		
	

	}

}
