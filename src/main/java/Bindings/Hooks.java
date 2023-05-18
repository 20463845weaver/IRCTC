package Bindings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	
	// Global Variables
	public static String URL = "https://www.nykaa.com";
	public static WebDriver driver;


	@io.cucumber.java.Before
	public static void start() {

		// Launch the application in chrome.
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get(URL);

	}
	
//	@io.cucumber.java.After
//	public void End() {
//		driver.quit();
//	}
	
		
}
