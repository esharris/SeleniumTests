package newpackage;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public abstract class TestBrowserCSLinks extends TestBrowserBase {

	private static final String BASE_URL = "http://demo.guru99.com/test/newtours/";

	@Test
	void test() {
		driver.get(BASE_URL);
		String theLinkText = driver.findElement(By.partialLinkText("egis")).getText();
		assertEquals("Register here", theLinkText);
		theLinkText = driver.findElement(By.partialLinkText("EGIS")).getText();
		assertEquals("REGISTER", theLinkText);
	}

}
