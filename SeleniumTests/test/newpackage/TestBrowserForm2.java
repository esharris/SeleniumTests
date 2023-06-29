package newpackage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public abstract class TestBrowserForm2 extends TestBrowserBase {

	private static final String BASE_URL1 = "https://demo.guru99.com/test/radio.html";
	private static final String BASE_URL2 = "https://demo.guru99.com/test/facebook.html";

	public TestBrowserForm2() {
		super();
	}

	@Test
	public void testFormRadioButton() {
		driver.get(BASE_URL1);
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		WebElement radio3 = driver.findElement(By.id("vfb-7-3"));

		radio1.click();
		assertTrue(radio1.isSelected());
		assertFalse(radio2.isSelected());
		assertFalse(radio3.isSelected());

		radio2.click();
		assertFalse(radio1.isSelected());
		assertTrue(radio2.isSelected());
		assertFalse(radio3.isSelected());
	}

	@Test
	public void testCheckbox() {
		driver.get(BASE_URL1);
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		WebElement option3 = driver.findElement(By.id("vfb-6-2"));

		option1.click();

		assertTrue(option1.isSelected());
		assertFalse(option3.isSelected());

		option3.click();
		assertTrue(option1.isSelected());
		assertTrue(option3.isSelected());
	}

	@Test
	public void testCheckbox2() {
		driver.get(BASE_URL2);
		WebElement chkFBPersist = driver.findElement(By.id("persist_box"));
		for (int i = 0; i < 2; i++) {
			chkFBPersist.click();
			assertEquals(i % 2 == 0, chkFBPersist.isSelected());
		}
	}
}
