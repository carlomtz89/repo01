package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class SearchPage {
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy (className = "product-container")
	private WebElement firstProd;
	
	public boolean getProdText(String expectedText) {
		return WrapClass.getText(firstProd).contains(expectedText);
	}
}
