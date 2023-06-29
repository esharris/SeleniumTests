package newpackage;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public abstract class TestBrowserPG1 extends TestBrowserBase {

	private static final String BASE_URL = "http://demo.guru99.com/test/newtours/";
	private static final String EXPECTED_TITLE = "Welcome: Mercury Tours";

	@Test
	public void testPG1() {
		driver.get(BASE_URL);
		final String actualTitle = driver.getTitle();

		assertEquals(EXPECTED_TITLE, actualTitle);
	}
}
