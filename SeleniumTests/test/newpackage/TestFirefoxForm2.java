package newpackage;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefoxForm2 extends TestBrowserForm2 {

	@BeforeAll
	public static void setUpBeforeClass() {
		driver = new FirefoxDriver();
	}
}
