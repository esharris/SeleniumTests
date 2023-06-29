package newpackage;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefoxForm extends TestBrowserForm {

	@BeforeEach
	public void initEach() {
		driver = new FirefoxDriver();
	}
}
