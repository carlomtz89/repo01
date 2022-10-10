package commonClasses;

import org.openqa.selenium.WebElement;

public class WrapClass {

	public static void click(WebElement webE) {
		webE.click();
	}
	public static void sendKeys(WebElement webE, String textTosend) {
		webE.sendKeys(textTosend);
	}
	public static String getText(WebElement webE) {
		return webE.getText();
	}
}
