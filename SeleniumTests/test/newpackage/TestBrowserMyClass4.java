package newpackage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class TestBrowserMyClass4 extends TestBrowserBase {

	private static final String BASE_URL = "http://demo.guru99.com/test/block.html";

	@Test
	void testPartialLink() {
		driver.get(BASE_URL);
		driver.findElement(By.partialLinkText("Inside")).click();
		assertEquals("Google", driver.getTitle());
		driver.navigate().back();
		WebElement element = driver.findElement(By.partialLinkText("Outside"));
		if (driver instanceof FirefoxDriver) {
			/**
			 * The following should get past the inexplicable "could not be scrolled into
			 * view" problem.
			 * https://sqa.stackexchange.com/questions/32697/webdriver-firefox-element-could-not-be-scrolled-into-view
			 * 
			 * However, this doesn't work, because the following inexplicably behaves like a
			 * no-op.
			 * 
			 * Removing the "Inside" partial link test doessn't fix the problem.
			 * 
			 * The error message display the correct URL.
			 */
//			Actions action = new Actions(driver);
//			action.moveToElement(element).click().perform();
//			action.moveToElement(element).perform();
//			element.click();
			/**
			 * If I click the link manually, there is an ad that blocks the move to the
			 * FaceBook site. Furthermore, I wouldn't be able to get Selenium to click the
			 * ad's "Close" button, which redirects the flow to FaceBook, because the page
			 * source is not displayed.
			 */
		} else if (driver instanceof ChromeDriver) {
			element.click();
			assertEquals("Facebook - log in or sign up", driver.getTitle());
		} else {
			fail("Unrecognized web driver");
		}
	}

}
