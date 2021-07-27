package letcodePages;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HomePage extends SeleniumBase {

	public String getTitle() {
		String title = driver.getTitle();
		return title;

	}

	public String pageURL() {
		String title = driver.getCurrentUrl();
		return title;
	}

	public int noOFLinks() {

		List<WebElement> links = driver.findElements(By.tagName("a"));

		return links.size();
	}

	public String facebook() {
		String Pwindow = driver.getWindowHandle();
		WebElement ele = driver.findElement(By.xpath(
				"//a[@href='https://www.facebook.com/ortoni/']//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();
		Set<String> window = driver.getWindowHandles();
		for (String Cwindow : window) {
			if (!Cwindow.equals(Pwindow)) {
				driver.switchTo().window(Cwindow);
			}
		}
		return driver.getCurrentUrl();
	}

	public String insta() {
		String Pwindow = driver.getWindowHandle();
		WebElement ele = driver.findElement(By.xpath("//a[@href='https://www.instagram.com/ortonikc/']//*[local-name()='svg']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();
		Set<String> window = driver.getWindowHandles();
		for (String Cwindow : window) {
			if (!Cwindow.equals(Pwindow)) {
				driver.switchTo().window(Cwindow);
			}
		}
		return driver.getCurrentUrl();
	}

	public String linkedIn() {
		String Pwindow = driver.getWindowHandle();
		WebElement ele = driver.findElement(By.xpath(
				"//a[@href='https://www.linkedin.com/in/ortoni']//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();
		Set<String> window = driver.getWindowHandles();
		for (String Cwindow : window) {
			if (!Cwindow.equals(Pwindow)) {
				driver.switchTo().window(Cwindow);
			}
		}
		return driver.getCurrentUrl();
	}

	public String youtube() {
		String Pwindow = driver.getWindowHandle();
		WebElement ele = driver.findElement(By.xpath(
				"//a[@href='https://www.youtube.com/letcode']//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();
		Set<String> window = driver.getWindowHandles();
		for (String Cwindow : window) {
			if (!Cwindow.equals(Pwindow)) {
				driver.switchTo().window(Cwindow);
			}
		}
		return driver.getCurrentUrl();
	}
}
