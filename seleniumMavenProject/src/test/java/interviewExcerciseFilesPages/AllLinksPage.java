package interviewExcerciseFilesPages;

import org.common.Utility;
import org.common.WebDriverHelper;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AllLinksPage extends WebDriverHelper {

	Utility utility = new Utility();
	By fileUpload = By.xpath("//a[text()='File Upload']");
	By chooseAfile = By.xpath("//input[@id='file-upload']");
	By uploadBtn = By.xpath("//input[@id='file-submit']");
	By uploadedFileName = By.xpath("//div[@id='uploaded-files']");
	By jsAlertElement = By.xpath("//a[text()='JavaScript Alerts']");
	By clickJsAlertElement = By.xpath("//button[text()='Click for JS Alert']");
	public void navigateToUpload() {
		utility.clickOn(fileUpload);
	}

	public void uploadAfile() {
		utility.uploadDoc(chooseAfile, "C:\\Users\\capital terefe\\Documents\\Test2.pdf");
	}

	public void clickOnUpload() {
		utility.clickOn(uploadBtn);
	}

	public void verifyUploadDocument() {
		String uploadedDocTxt = utility.getElementText(uploadedFileName);
		Assert.assertEquals(uploadedDocTxt, "Test2.pdf");
	}

	public void clickOnJavaScriptAlerts() {
		utility.clickOn(jsAlertElement);
		//utility.clickOn(clickJsAlertElement);
		//utility.handlePopupHitOk();
	}

}
