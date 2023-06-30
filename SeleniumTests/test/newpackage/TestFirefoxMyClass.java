package newpackage;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefoxMyClass extends TestBrowserMyClass {

	@BeforeEach
	public void initEach() {
		driver = new FirefoxDriver();
	}
}
