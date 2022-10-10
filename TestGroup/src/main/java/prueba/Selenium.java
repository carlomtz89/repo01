package prueba;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		String exePath = "./src/test/resources/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationpractice.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement searchBar = driver.findElement(By.id("search_query_top"));
		WebElement searchBtn = driver.findElement(By.xpath("//*[@type=\"submit\"][1]"));
		
		searchBar.sendKeys("Dress");
		searchBtn.click();
		
		//Metodos de explorador
		
		String title = driver.getTitle();
				System.out.println(title);
				
			String urlSearch = driver.getCurrentUrl();
				System.out.println("La URL actual es: " + urlSearch);
				
		//Metodos de navegacion
				
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
				
		//Verificar elemento desplegado en pagina
				
		boolean prodContainer = driver.findElement(By.className("product-container")).isDisplayed();
		if (prodContainer) {
			System.out.println("El articulo es desplegado");
			
		//Obtener texto de webelement
			
		String prodName = driver.findElement(By.className("product-container")).getText();
		
		boolean prodNameContains = prodName.contains("Printed Summer Dress"); //Metodo nativo java compara 2 strings
		if (prodNameContains) {
			System.out.println("El nombre del producto es correcto");
		}else {
			System.out.println("ERROR El nombre del producto es incorrecto");
		}
		//DropDown
		
		Select sortDrpDwn = new Select (driver.findElement(By.id("selectProductSort")));
		sortDrpDwn.selectByVisibleText("Price: Lowest first");
//		sortDrpDwn.selectByValue("price:asc");

		//FindElements
		List<WebElement> prodList = driver.findElements(By.className("product-container"));
		System.out.println("Numero de elementos en productos: " + prodList.size());
		
		String tercerProd = prodList.get(2).getText();
		System.out.println(tercerProd);
		
		for (int i = 0; i < prodList.size(); i++) {
		System.out.println("Los productos son: " + prodList.get(i).getText());
		System.out.println();
		
		if (!prodList.get(i).getText().contains("Dress")) {
			System.out.println("El producto no es un vestido");
			break;
		}
		}
//		driver.close(); //Cierra ultima ventana o ultima pestaña
		driver.quit(); //Cierra todo
	}
	}
}
