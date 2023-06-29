package newpackage;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeNameDemo extends TestBrowserNameDemo {

	@BeforeEach
	public void initEach() {
		driver = new ChromeDriver();
	}
}
