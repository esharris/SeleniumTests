package newpackage;

import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;

public class TestBrowserBase {

	protected WebDriver driver;

	public TestBrowserBase() {
		super();
	}

	@AfterEach
	public void termEach() {
		driver.close();
	}

}