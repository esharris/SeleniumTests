package newpackage;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefoxNameDemo2 extends TestBrowserNameDemo2 {

	@BeforeEach
	public void initEach() {
		driver = new FirefoxDriver();
	}
}
