package newpackage;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public abstract class TestBrowserP1 extends TestBrowserBase {

	private static final String BASE_URL = "http://demo.guru99.com/test/accessing-link.html";

	@Test
	void testPartialLink() {
		driver.get(BASE_URL);
		driver.findElement(By.partialLinkText("here")).click();
		assertEquals("Google", driver.getTitle());
	}
}
