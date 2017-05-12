package interviewExcerciseFilesPages;

import org.common.Utility;
import org.common.WebDriverHelper;
import org.openqa.selenium.By;
import org.testng.Assert;

public class JavaScriptAlertClickOnAssertion extends WebDriverHelper {

	Utility utility = new Utility();
	By javascriptaletrs = By.xpath("//h3[text()='JavaScript Alerts']");
	By jsAlert = By.xpath("//button[text()='Click for JS Alert']");
	By jsConfirm = By.xpath("//button[text()='Click for JS Confirm']");
	By jsPrompt = By.xpath("//button[text()='Click for JS Prompt']");
	By jsPromptTxt = By.xpath("//button[text()='Click for JS Prompt']");
	public void verifyJavaScriptAlertsClickOn() {
		String jsAlertTxt = utility.getElementText(javascriptaletrs);
		Assert.assertEquals(jsAlertTxt, "JavaScript Alerts");

	}

	public void ClickForJSAlert() {
		utility.clickOn(jsAlert);
		utility.handlePopupHitOk();

	}

	public void ClickForJSConfirm() {
		utility.clickOn(jsConfirm);
		utility.handlePopupHitCancel();
	}

	public void ClickForJSPrompt()  {
		utility.clickOn(jsPrompt);
	
		utility.typeInto(jsPrompt, "ali");
		utility.handlePopupHitOk();

	}

}
