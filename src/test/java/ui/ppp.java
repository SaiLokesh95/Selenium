package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ppp {
	@Test
	private void ChromeOptions() {
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.nopcommerce.com/");

	}
}