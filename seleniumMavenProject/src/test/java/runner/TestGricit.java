package runner;

import org.common.WebDriverHelper;
import org.testng.annotations.Test;

import com.gricit.AccountInformation;
import com.gricit.RegistraionPage;

public class TestGricit extends WebDriverHelper {
	RegistraionPage registrationPage = new RegistraionPage();
	AccountInformation accountInformation = new AccountInformation();
	@Test
	public void testRegistration() throws Exception {

		registrationPage.clickContiueButton();
		accountInformation.registration();

	}
}
