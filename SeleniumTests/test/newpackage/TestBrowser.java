package newpackage;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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

	@Test
	public void testNameDemo2() {
		driver.get("http://demo.guru99.com/test/ajax.html");
		List<WebElement> elements = driver.findElements(By.name("name"));
		assertEquals(2, elements.size());
		String[] expected = { "Yes", "No" };
		for (int i = 0; i < elements.size(); i++) {
			assertEquals(expected[i], elements.get(i).getAttribute("value"));
		}
	}

	@Test
	public void testForm() {
		String baseUrl = "https://demo.guru99.com/test/login.html";
		driver.get(baseUrl);

		// Get the WebElement corresponding to the Email Address(TextField)
		WebElement email = driver.findElement(By.id("email"));

		// Get the WebElement corresponding to the Password Field
		WebElement password = driver.findElement(By.name("passwd"));

		email.sendKeys("abcd@gmail.com");
		password.sendKeys("abcdefghlkjl");

		assertEquals("abcd@gmail.com", email.getAttribute("value"));
		assertEquals("abcdefghlkjl", password.getAttribute("value"));
	}
}