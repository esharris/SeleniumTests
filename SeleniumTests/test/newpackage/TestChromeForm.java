package newpackage;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeForm extends TestBrowserForm {

	@BeforeAll
	public static void initAll() {
		driver = new ChromeDriver();
	}
}
