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

	@Test(priority =1)
	public void totalLinks() {

		softAssert.assertEquals(noOFLinks(), 16);

	}

	@Test(priority =2)
	public void FooterFacebook() {

		softAssert.assertEquals(facebook(), "https://www.facebook.com/ortoni/");
		closeTheWindow();
	}

	@Test(priority =3)
	public void FooterInsta() {

		softAssert.assertEquals(insta(), "https://www.instagram.com/accounts/login/");
		closeTheWindow();
	}

	@Test(priority =4)
	public void FooterLinkedIn() {

		softAssert.assertEquals(linkedIn(), "https://www.linkedin.com/in/ortoni");
		closeTheWindow();
	}

	@Test(priority =6)
	public void FooterYouTube() {

		softAssert.assertEquals(youtube(), "https://www.youtube.com/letcode");
		closeTheWindow();
	}

	@AfterMethod
	public void Down() {
		quitTheWindow();

	}

	@AfterSuite()
	public void assertt() {
		softAssert.assertAll();
	}

}
