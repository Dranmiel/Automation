package com.selenium2.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.selenium2.core.Driver;
import com.selenium2.pages.TabelaPage;
import com.selenium2.pages.InicioPage;

/**
 *	@author Caio Queiroz Nogueira
 *
 *
 * caso de teste 1 - Validando elementos da tabela.
 */
public class CT01 {
	WebDriver driver;
	InicioPage inicioPage;
	TabelaPage tabelaPage;
	String departure, destination;
	
	@Before
	public void before() {
		//Parâmetros à serem enviados
		departure = "San Diego";
		destination = "New York";
		driver = new Driver().getDriver();
		Driver.acessarURL(driver, "https://blazedemo.com/");
		inicioPage = new InicioPage(driver);
		tabelaPage = new TabelaPage(driver);
	}
	@Test
	public void test() {
		inicioPage.selecionarDepartureDestination(departure, destination);
		tabelaPage.validarTabela();
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
