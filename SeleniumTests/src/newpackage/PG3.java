package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		/**
		 * Can't open this page.
		 */
		driver.get("http://www.popuptest.com/popuptest2.html");
		/**
		 * Alert boxes are not pop-up windows
		 */
//		driver.get("http://jsbin.com/usidix/1");
//		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		driver.close();
	}
}
