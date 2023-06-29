package newpackage;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefoxNameDemo extends TestBrowserNameDemo {

	@BeforeEach
	public void initEach() {
		driver = new FirefoxDriver();
	}
}
