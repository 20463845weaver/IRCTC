package PageActions;

import org.openqa.selenium.WebElement;

public class pageactions{
	
	public static void ClickOnElement(WebElement ele) {
		ele.click();
	}
	
	public static void EnterText(WebElement ele, String text) {
		ele.sendKeys(text);
	}

}
