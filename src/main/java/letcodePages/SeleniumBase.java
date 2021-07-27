package letcodePages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumBase {

	RemoteWebDriver driver;

	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void closeTheWindow() {
		driver.close();

	}

	public void quitTheWindow() {
		driver.quit();

	}
}
