package newpackage;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromePG1 extends TestBrowserPG1 {

	@BeforeAll
	public static void setUpBeforeClass() {
		driver = new ChromeDriver();
	}
}
