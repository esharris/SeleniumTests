package newpackage;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeP1 extends TestBrowserP1 {

	@BeforeAll
	public static void setUpBeforeClass() {
		driver = new ChromeDriver();
	}
}
