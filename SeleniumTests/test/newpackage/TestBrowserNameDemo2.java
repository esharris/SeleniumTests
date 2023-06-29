package newpackage;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class TestBrowserNameDemo2 extends TestBrowserBase {

	private static final String BASE_URL = "http://demo.guru99.com/test/ajax.html";
	private static final String[] EXPECTED = { "Yes", "No" };

	@Test
	public void testNameDemo2() {
		driver.get(BASE_URL);
		List<WebElement> elements = driver.findElements(By.name("name"));
		assertEquals(EXPECTED.length, elements.size());
		for (int i = 0; i < elements.size(); i++) {
			assertEquals(EXPECTED[i], elements.get(i).getAttribute("value"));
		}
	}

}
