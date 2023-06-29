package newpackage;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public abstract class TestBrowserNameDemo extends TestBrowserBase {

	private static final String BASE_URL = "http://demo.guru99.com/test/ajax.html";
	private static final String EXPECTED_TEXT = "Radio button is checked and it's value is No";

	@Test
	public void testNameDemo() {
		driver.manage().window().maximize();
		driver.get(BASE_URL);
		driver.findElement(By.id("no")).click();
		driver.findElement(By.id("buttoncheck")).click();

		assertEquals(EXPECTED_TEXT, driver.findElement(By.className("radiobutton")).getText());
	}

}
