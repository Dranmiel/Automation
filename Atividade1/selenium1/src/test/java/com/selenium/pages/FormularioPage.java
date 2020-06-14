package com.selenium.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.uimaps.FormularioMap;
import com.selenium.uimaps.InicioMap;

public class FormularioPage {
	
	WebDriver driver;
	
	public FormularioPage(WebDriver driver) {
		this.driver = driver;
	}
	
	FormularioMap formularioMap = new FormularioMap(driver);
	
	
	public void preencherFormulario() {
		formularioMap.inputFirstBox.click(driver);
		formularioMap.inputEventForm.sendKey(driver, "asdf");
		formularioMap.inputEventTypeForm.sendKey(driver, "asdf");
		formularioMap.inputSecondBox.click(driver);
		formularioMap.inputPaticipateForm.sendKey(driver, "asdf");
		formularioMap.inputParticipateTypeForm.sendKey(driver, "asdf");
		formularioMap.btnSubmit.click(driver);
	}
	/**metodo que valida mensagem de sucesso
	 * 
	 */
	public void validarMensagemSucesso() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(formularioMap.tituloMensagem.getValue())));
			String resultado = driver.findElement(By.xpath(formularioMap.btnMensagem.getValue())).getText();
			System.out.println(resultado);
			Assert.assertEquals("Erro ao validar o botao da mensagem de sucesso","Get Started with WPForms Today", resultado);
			System.out.println("Sucesso");
		} catch (Exception e) {
			System.out.println("Falha!");
		}
	}
}
