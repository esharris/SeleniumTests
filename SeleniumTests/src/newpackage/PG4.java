package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PG4 {
	public static void main(String[] args) {
//		  	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");  
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Deprecated")).click();
		/**
		 * I don't know how to get information about the web page loaded into the
		 * current frame.
		 */
		// debug
		driver.switchTo().defaultContent();
		WebDriver frame = driver.switchTo().frame("classFrame");
		System.out.println(frame.getCurrentUrl());
		System.out.println(frame.getTitle());
		System.out.println(frame.getPageSource());
		System.out.println(frame.getWindowHandle());
		// debug
		driver.close();
	}
}