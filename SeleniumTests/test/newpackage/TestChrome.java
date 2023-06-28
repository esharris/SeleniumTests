package newpackage;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

class TestChrome extends TestBrowser {

	@BeforeEach
	public void initEach() {
		driver = new ChromeDriver();
	}
}
