package runner;

import org.common.WebDriverHelper;
import org.testng.annotations.Test;

import com.gricit.AccountInformation;
import com.gricit.RegisterUserHomePage;
import com.gricit.LogOffAssertion;
import com.gricit.MyAccountInformation;
import com.gricit.WelcomePage;

public class TestGricit extends WebDriverHelper {
	WelcomePage welcomPage = new WelcomePage();
	AccountInformation accountInformation = new AccountInformation();
	MyAccountInformation myAccountInformation = new MyAccountInformation();
	LogOffAssertion loggOffAssertion = new LogOffAssertion();
	RegisterUserHomePage continuebtnVery = new RegisterUserHomePage();

	// @Test
	public void testRegistration() throws Exception {
		welcomPage.clickContiueButton();
		accountInformation.registration();
	}

	@Test
	public void loginToAccount() {
		welcomPage.signIn();
		myAccountInformation.verifyLogin();
		myAccountInformation.logOff();
		loggOffAssertion.verfeyLogOff();
		loggOffAssertion.clickOnContinueNext();
		continuebtnVery.verifyRegisterUserHomePage();
	}

}
