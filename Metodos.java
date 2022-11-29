package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;
	
	public void acessarNavegador() {
		
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://zitrus.com.br/");
	}
	
	public void fecharNavegador() {
		
		driver.quit();
	}
	
	public void click(By elemento) {
		driver.findElement(elemento).click();
		

	}

	public void fill(By elemento, String text) {
		driver.findElement(elemento).sendKeys(text);
	}

	public void pause(By elemento, int temp) {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {

		}

	}

}
