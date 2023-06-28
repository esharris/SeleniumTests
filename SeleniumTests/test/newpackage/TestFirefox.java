package newpackage;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.firefox.FirefoxDriver;

class TestFirefox extends TestBrowser {

	@BeforeEach
	public void initEach() {
		driver = new FirefoxDriver();
	}
}
