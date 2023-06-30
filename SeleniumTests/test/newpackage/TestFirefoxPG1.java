package newpackage;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefoxPG1 extends TestBrowserPG1 {

	@BeforeAll
	public static void setUpBeforeClass() {
		driver = new FirefoxDriver();
	}
}
