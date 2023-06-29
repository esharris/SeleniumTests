package newpackage;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public abstract class TestBrowserPG2 extends TestBrowserBase {

	private static final String BASE_URL = "http://www.facebook.com";
	private static final String EXPECTED_TAG_NAME = "input";

	@Test
	public void testPG2() {
		driver.get(BASE_URL);
		final String actualTagName = driver.findElement(By.id("email")).getTagName();

		assertEquals(EXPECTED_TAG_NAME, actualTagName);
	}
}
