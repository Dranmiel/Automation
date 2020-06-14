package com.selenium2.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium2.uimaps.ConfirmationMap;

public class ConfirmationPage {
	WebDriver driver;

	public ConfirmationPage(WebDriver driver) {
		this.driver = driver;
	}

	ConfirmationMap confirmationMap = new ConfirmationMap(driver);
	
	public void validarMensagemSucesso() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(confirmationMap.tituloMensagem.getValue())));
			String resultado = driver.findElement(By.xpath(confirmationMap.tituloMensagem.getValue())).getText();
			System.out.println(resultado);
			Assert.assertEquals("Erro ao validar a mensagem de sucesso", "Thank you for your purchase today!", resultado);
			System.out.println("Sucesso");
		} catch (Exception e) {
			System.out.println("Falha!");
		}
	}
}
