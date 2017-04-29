package runner;

import org.common.WebDriverHelper;
import org.testng.annotations.Test;

import com.gricit.AccountInformation;
import com.gricit.MyAccountInformation;
import com.gricit.WelcomePage;

public class TestGricit extends WebDriverHelper {
	WelcomePage welcomPage = new WelcomePage();
	AccountInformation accountInformation = new AccountInformation();
	MyAccountInformation myAccountInformation = new MyAccountInformation();
	// @Test
	public void testRegistration() throws Exception {
	welcomPage.clickContiueButton();
	accountInformation.registration();
	

	}

	@Test
	public void loginToAccount() {
		welcomPage.signIn();
		myAccountInformation.verifyLogin();

	}
}
