package newpackage;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class TestBrowser {

	protected WebDriver driver;

	public TestBrowser() {
		super();
	}

	@AfterEach
	public void termEach() {
		driver.close();
	}

	@Test
	public void testPG1() {
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";

		// launch Fire fox and direct it to the Base URL
		driver.get(baseUrl);

		// get the actual value of the title
		actualTitle = driver.getTitle();

		/*
		 * compare the actual title of the page with the expected one and print the
		 * result as "Passed" or "Failed"
		 */
		assertEquals(expectedTitle, actualTitle);
	}

	@Test
	public void testPG2() {
		String baseUrl = "http://www.facebook.com";
		String expectedTagName = "input";
		String actualTagName = "";

		driver.get(baseUrl);
		actualTagName = driver.findElement(By.id("email")).getTagName();

		assertEquals(expectedTagName, actualTagName);
	}

	@Test
	public void testNameDemo() {
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/ajax.html");
		driver.findElement(By.id("no")).click();
		driver.findElement(By.id("buttoncheck")).click();

		assertEquals("Radio button is checked and it's value is No",
				driver.findElement(By.className("radiobutton")).getText());
	}

}