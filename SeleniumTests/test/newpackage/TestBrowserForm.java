package newpackage;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class TestBrowserForm extends TestBrowserBase {

	private static final String BASE_URL = "https://demo.guru99.com/test/login.html";

	private static final String EMAIL_INPUT = "abcd@gmail.com";
	private static final String PASSWORD_INPUT = "abcdefghlkjl";

	public TestBrowserForm() {
		super();
	}

	@Test
	public void testForm() {
		driver.get(BASE_URL);

		// Get the WebElement corresponding to the Email Address(TextField)
		WebElement email = driver.findElement(By.id("email"));

		// Get the WebElement corresponding to the Password Field
		WebElement password = driver.findElement(By.name("passwd"));

		email.sendKeys(EMAIL_INPUT);
		password.sendKeys(PASSWORD_INPUT);

		assertEquals(EMAIL_INPUT, email.getAttribute("value"));
		assertEquals(PASSWORD_INPUT, password.getAttribute("value"));
	}
}