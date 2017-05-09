package runner;

import org.common.WebDriverHelper;
import org.testng.annotations.Test;

import interviewExcerciseFilesPages.AllLinksPage;

public class InterViewExcerciseFiles extends WebDriverHelper {

	AllLinksPage allLinksPage = new AllLinksPage();

	// @Test
	public void uploadAfile() {
		allLinksPage.navigateToUpload();
		allLinksPage.uploadAfile();
		allLinksPage.clickOnUpload();
		allLinksPage.verifyUploadDocument();

	}

	@Test
	public void testAlerts() {
		allLinksPage.clickOnJavaScriptAlerts();

	}
}
