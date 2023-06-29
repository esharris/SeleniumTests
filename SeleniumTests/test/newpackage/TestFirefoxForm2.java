package newpackage;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefoxForm2 extends TestBrowserForm2 {

	@BeforeEach
	public void initEach() {
		driver = new FirefoxDriver();
	}
}
