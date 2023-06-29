package newpackage;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefoxPG2 extends TestBrowserPG2 {

	@BeforeEach
	public void initEach() {
		driver = new FirefoxDriver();
	}
}
