package newpackage;

import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;

public class TestBrowserBase {

	protected static WebDriver driver;

	public TestBrowserBase() {
		super();
	}

	@AfterAll
	public static void tearDownAfterClass() {
		driver.close();
	}

}