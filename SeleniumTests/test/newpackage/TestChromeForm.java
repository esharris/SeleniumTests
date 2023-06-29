package newpackage;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeForm extends TestBrowserForm {

	@BeforeEach
	public void initEach() {
		driver = new ChromeDriver();
	}
}
