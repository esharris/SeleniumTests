package newpackage;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeForm2 extends TestBrowserForm2 {

	@BeforeEach
	public void initEach() {
		driver = new ChromeDriver();
	}
}
