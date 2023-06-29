package newpackage;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromePG2 extends TestBrowserPG2 {

	@BeforeEach
	public void initEach() {
		driver = new ChromeDriver();
	}
}
