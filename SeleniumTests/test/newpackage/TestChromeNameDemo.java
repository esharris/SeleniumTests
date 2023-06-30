package newpackage;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeNameDemo extends TestBrowserNameDemo {

	@BeforeAll
	public static void setUpBeforeClass() {
		driver = new ChromeDriver();
	}
}
