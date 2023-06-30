package newpackage;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeMyClass extends TestBrowserMyClass {

	@BeforeEach
	public void initEach() {
		driver = new ChromeDriver();
	}
}
