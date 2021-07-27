package letCodeHomePage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import letcodePages.HomePage;

public class T002 extends HomePage {

	SoftAssert softAssert = new SoftAssert();

	@BeforeMethod
	public void OpenBrowser() {
		openBrowser();

	}

	@Test(enabled =false)
	public void totalLinks() {

		softAssert.assertEquals(noOFLinks(), 16);

	}

	@Test(enabled =false)
	public void FooterFacebook() {

		softAssert.assertEquals(facebook(), "https://www.facebook.com/ortoni/");
		closeTheWindow();
	}

	@Test
	public void FooterInsta() {

		softAssert.assertEquals(insta(), "https://www.instagram.com/accounts/login/");
		closeTheWindow();
	}

	@Test(enabled =false)
	public void FooterLinkedIn() {

		softAssert.assertEquals(linkedIn(), "https://www.linkedin.com/in/ortoni");
		closeTheWindow();
	}

	@Test(enabled =false)
	public void FooterYouTube() {

		softAssert.assertEquals(youtube(), "https://www.youtube.com/letcode");
		closeTheWindow();
	}

	@AfterMethod
	public void Down() {
		quitTheWindow();

	}

	@AfterSuite(enabled =false)
	public void assertt() {
		softAssert.assertAll();
	}

}
