package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass4a {

	public static void main(String[] args) {
		String baseUrl = "http://demo.guru99.com/test/block.html";
		WebDriver driver = new FirefoxDriver();

		driver.get(baseUrl);
		driver.findElement(By.partialLinkText("Outside")).click();
		System.out.println(driver.getTitle());
		driver.quit();
	}
}