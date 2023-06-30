package newpackage;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public abstract class TestBrowserMyClass extends TestBrowserBase {

	private static final String BASE_URL = "http://jsbin.com/usidix/1";
	private static final String EXPECT_ALERT_MESSAGE = "This is an alert box.";

	@Test
	public void testAlertBox() {
		driver.get(BASE_URL);

		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		String alertMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();

		assertEquals(EXPECT_ALERT_MESSAGE, alertMessage);
	}
}
