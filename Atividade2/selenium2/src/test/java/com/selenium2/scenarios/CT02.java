package com.selenium2.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.selenium2.core.Driver;
import com.selenium2.pages.ConfirmationPage;
import com.selenium2.pages.FormularioPage;
import com.selenium2.pages.InicioPage;
import com.selenium2.pages.TabelaPage;

/**
 *	@author Caio Queiroz Nogueira
 *
 *
 * caso de teste 2 - Preenchendo o formulario e validando mensagem.
 */

public class CT02 {
	WebDriver driver;
	InicioPage inicioPage;
	TabelaPage tabelaPage;
	ConfirmationPage confirmationPage;
	FormularioPage formularioPage;
	String departure, destination, voo;
	
	@Before
	public void before() {
		//Parâmetros à serem enviados
		departure = "San Diego";
		destination = "New York";
		voo = "43";
		
		driver = new Driver().getDriver();
		Driver.acessarURL(driver, "https://blazedemo.com/");
		inicioPage = new InicioPage(driver);
		tabelaPage = new TabelaPage(driver);
		formularioPage = new FormularioPage(driver);
		confirmationPage = new ConfirmationPage(driver);
	}
	@Test
	public void test() {
		inicioPage.selecionarDepartureDestination(departure, destination);
		tabelaPage.selecionarVoo(voo);
		formularioPage.preencherFormulario();
		confirmationPage.validarMensagemSucesso();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@After
	public void after() {
		Driver.close(driver);
	}
}
