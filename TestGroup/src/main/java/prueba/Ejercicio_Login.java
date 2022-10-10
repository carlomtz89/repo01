package prueba;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejercicio_Login {

	public static void main(String[] args) throws InterruptedException {

		String exePath = "./src/test/resources/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationpractice.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement loginBtn = driver.findElement(By.xpath("//*[@class=\"login\"]"));
		loginBtn.click();
		WebElement emailFld = driver.findElement(By.id("email"));
		emailFld.sendKeys("cooltesters0827@mailinator.com");
		WebElement passFld = driver.findElement(By.id("passwd"));
		passFld.sendKeys("Test123!");
		WebElement signBtn = driver.findElement(By.id("SubmitLogin"));
		signBtn.click();
		WebElement myAccLbl = driver.findElement(By.xpath("//*[@id=\"my-account\"]"));
		boolean myAccLblContains = myAccLbl.getText().contains("My account");
		if(myAccLblContains) {
		System.out.println("My Account desplegado");
		
		driver.quit();
		}
	}

}
