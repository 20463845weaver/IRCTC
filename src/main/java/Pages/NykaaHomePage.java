package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Bindings.Hooks;
import PageActions.pageactions;

public class NykaaHomePage extends Hooks{
	
	
	
	public static WebElement SearchArea = driver.findElement(By.xpath("//input[@placeholder='Search on Nykaa']"));
	
	public static void ClickAndEnterTextInSearchArea(String dataForSearch) {
		pageactions.ClickOnElement(SearchArea);
		pageactions.EnterText(SearchArea, dataForSearch);
	}
}
