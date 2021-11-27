package metodos;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodo extends Browsers {

	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("------Erro ao fechar navegador------" + e.getMessage());
			System.out.println("--------Causa do erro--------------" + e.getCause());

		}

	}

	public void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("------Erro ao fechar navegador------" + e.getMessage());
			System.out.println("--------Causa do erro--------------" + e.getCause());
		}

	}

	public void esperarElementoClicavel(By elemento, int tempo) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, tempo);
			wait.until(ExpectedConditions.elementToBeClickable(elemento));
		} catch (Exception e) {
			System.out.println("------Erro ao fechar navegador------" + e.getMessage());
			System.out.println("--------Causa do erro--------------" + e.getCause());

		}
	}

	public void screenshot(String nomedavidencia) {
		try {
			TakesScreenshot scrShot = (TakesScreenshot) driver;
			File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Evidencias/" + nomedavidencia + ".png");
			FileUtils.copyFile(srcFile, destFile);

		} catch (Exception e) {
			System.out.println("------Erro ao fechar navegador------" + e.getMessage());
			System.out.println("--------Causa do erro--------------" + e.getCause());

		}

	}

	public void pausa(int pausa) {
		try {
			Thread.sleep(pausa);
		} catch (Exception e) {
			System.out.println("------Erro ao fechar navegador------" + e.getMessage());
			System.out.println("--------Causa do erro--------------" + e.getCause());

		}
	}

}
