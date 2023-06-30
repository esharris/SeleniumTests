package newpackage;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefoxPG2 extends TestBrowserPG2 {

	@BeforeAll
	public static void setUpBeforeClass() {
		driver = new FirefoxDriver();
	}
}
