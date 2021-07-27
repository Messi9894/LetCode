package letCodeHomePage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import letcodePages.HomePage;

public class T001 extends HomePage {

	SoftAssert softAssert = new SoftAssert();

	@BeforeMethod
	public void OpenBrowser() {
		openBrowser();

	}

	@Test
	public void VerifyPageTitle() {
		softAssert.assertEquals(getTitle(), "LetCode with Koushik");

	}

	@Test
	public void verifyPageURL() {
		softAssert.assertEquals(pageURL(), "https://letcode.in/");

	}

	@AfterMethod
	public void Down() {
		quitTheWindow();
		softAssert.assertAll();
	}

}
