package newpackage;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeNameDemo2 extends TestBrowserNameDemo2 {

	@BeforeEach
	public void initEach() {
		driver = new ChromeDriver();
	}
}
