package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Bindings.Hooks;
import PageActions.pageactions;

public class NykaaHomePage{
	
	public static String URL = "https://www.nykaa.com";
	public static WebDriver driver;
	
	public static WebElement SearchArea = driver.findElement(By.xpath("//input[@placeholder='Search on Nykaa']"));
	
	public static void ClickAndEnterTextInSearchArea(String dataForSearch) {
		pageactions.ClickOnElement(SearchArea);
		pageactions.EnterText(SearchArea, dataForSearch);
	}
}
