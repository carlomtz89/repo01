package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_ChangeTab {

	public static void main(String[] args) throws InterruptedException {
		String exePath = "./src/test/resources/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String originalTab = driver.getWindowHandle();
		System.out.println(originalTab);
		
		WebElement clickHere = driver.findElement(By.xpath("//a[@target=\"_blank\"][@style]"));
		clickHere.click();
		
		for(String tabNueva : driver.getWindowHandles()) { //Estructura for simplificada por cada tab abierta vamos a recorrer una por una
			if(!originalTab.contentEquals(tabNueva)) {
			driver.switchTo().window(tabNueva);
			break;
			}
	}
		//Enviar email
		WebElement emailFld = driver.findElement(By.xpath("//input[@name=\"emailid\"]"));
		emailFld.sendKeys("testemail@test.com");
	}	
}
