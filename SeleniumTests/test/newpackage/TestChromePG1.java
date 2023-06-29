package newpackage;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromePG1 extends TestBrowserPG1 {

	@BeforeEach
	public void initEach() {
		driver = new ChromeDriver();
	}
}
