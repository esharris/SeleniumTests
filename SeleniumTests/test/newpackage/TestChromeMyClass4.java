package newpackage;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeMyClass4 extends TestBrowserMyClass4 {

	@BeforeAll
	public static void setUpBeforeClass() {
		driver = new ChromeDriver();
	}
}
