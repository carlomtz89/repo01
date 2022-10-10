package testCases_Search;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonClasses.DriverSetup;
import commonClasses.GlobalVariables;
import navigationPages.HomePage;
import navigationPages.SearchPage;

public class TC_02_Blouse {
	//inicializar el WebDriver
	WebDriver driver = DriverSetup.setupDriver();
	
	//Page Objets de Home Page
	HomePage homePage = new HomePage(driver);
	SearchPage searchPage = new SearchPage(driver);
	
	@BeforeTest
	public void startWebDriver() {
		driver.get(GlobalVariables.HOME_PAGE);
	}
  @Test
  public void TC02() {
	  homePage.search("Blouse");
	  boolean visibleText = searchPage.getProdText("Dress");
	  Assert.assertTrue(visibleText, "El text Blouse no esta desplegado");
  }
  @AfterTest
  public void closeDriver() {
	  driver.quit();
  }
}
