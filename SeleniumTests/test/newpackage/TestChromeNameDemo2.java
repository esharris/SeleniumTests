package newpackage;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeNameDemo2 extends TestBrowserNameDemo2 {

	@BeforeAll
	public static void setUpBeforeClass() {
		driver = new ChromeDriver();
	}
}
