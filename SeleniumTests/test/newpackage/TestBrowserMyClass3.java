package newpackage;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public abstract class TestBrowserMyClass3 extends TestBrowserBase {

	private static final String BASE_URL = "http://demo.guru99.com/test/link.html";

	@Test
	void testLink() {
		driver.get(BASE_URL);

		/**
		 * This get only the first candidate.
		 */
		driver.findElement(By.linkText("click here")).click();

		assertEquals("Google", driver.getTitle());
	}

}
