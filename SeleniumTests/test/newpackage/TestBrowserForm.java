package newpackage;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class TestBrowserForm extends TestBrowserBase {

	private static final String BASE_URL = "https://demo.guru99.com/test/login.html";

	private static final String EMAIL_INPUT = "abcd@gmail.com";
	private static final String PASSWORD_INPUT = "abcdefghlkjl";

	private static final String EXPECTED_OUTPUT = "Successfully Logged in...";

	private WebElement email;
	private WebElement password;

	public TestBrowserForm() {
		super();
	}

	@BeforeEach
	public void setUp() {
		driver.get(BASE_URL);
		email = driver.findElement(By.id("email"));
		password = driver.findElement(By.name("passwd"));
	}

	@Test
	public void testForm() {
		email.sendKeys(EMAIL_INPUT);
		password.sendKeys(PASSWORD_INPUT);

		assertEquals(EMAIL_INPUT, email.getAttribute("value"));
		assertEquals(PASSWORD_INPUT, password.getAttribute("value"));

		email.clear();
		password.clear();

		assertEquals("", email.getAttribute("value"));
		assertEquals("", password.getAttribute("value"));

	}

	/**
	 * Login Done with Click
	 */
	@Test
	public void testFormClick() {
		final WebElement login = driver.findElement(By.id("SubmitLogin"));

		email.sendKeys(EMAIL_INPUT);
		password.sendKeys(PASSWORD_INPUT);
		login.click();

		assertEquals(EXPECTED_OUTPUT, driver.findElement(By.className("error-copy")).getText());

	}

	/**
	 * Login Done with Submit
	 */
	@Test
	public void testFormSubmit() {
		driver.findElement(By.id("SubmitLogin")).submit();

		/**
		 * Firefox requires a wait to work properly.
		 */
		if (driver instanceof FirefoxDriver) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		}
		assertEquals(EXPECTED_OUTPUT, driver.findElement(By.className("error-copy")).getText());

	}
}