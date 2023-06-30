package newpackage;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFireFoxP1 extends TestBrowserP1 {

	@BeforeAll
	public static void setUpBeforeClass() {
		driver = new FirefoxDriver();
	}
}
