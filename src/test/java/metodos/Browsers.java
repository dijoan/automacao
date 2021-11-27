package metodos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browsers {

	protected static WebDriver driver;

	ChromeOptions options = new ChromeOptions();

	public void abrirNavegador(String site) {

		try {

			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			options.addArguments("--start-maximized");
			driver = new ChromeDriver (options);
			driver.get(site);
			//driver.manage().window().maximize();
		} catch (Exception e) {
			System.err.println("------Erro ao abrir navegador------" + e.getMessage());
			System.err.println("--------Causa do erro--------------" + e.getCause());
		}

	}

	public void fechar() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.err.println("------Erro ao fechar navegador------" + e.getMessage());
			System.err.println("--------Causa do erro--------------" + e.getCause());
		}
	}

}
