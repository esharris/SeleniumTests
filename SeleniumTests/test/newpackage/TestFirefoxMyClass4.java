package newpackage;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefoxMyClass4 extends TestBrowserMyClass4 {

	@BeforeAll
	public static void setUpBeforeClass() {
		driver = new FirefoxDriver();
	}
}
