package newpackage;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefoxPG1 extends TestBrowserPG1 {

	@BeforeEach
	public void initEach() {
		driver = new FirefoxDriver();
	}
}
