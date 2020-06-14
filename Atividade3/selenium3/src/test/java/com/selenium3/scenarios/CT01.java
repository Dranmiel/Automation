package com.selenium3.scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.selenium3.core.Driver;
import com.selenium3.pages.InicioPage;
import com.selenium3.pages.PesquisaPage;
import com.selenium3.pages.ProdutoPage;

public class CT01 {
	WebDriver driver;
	InicioPage inicioPage;
	PesquisaPage pesquisaPage;
	ProdutoPage produtoPage;
	
	@Before
	public void before() {
		driver = new Driver().getDriver();
		Driver.acessarURL(driver, "https://www.kabum.com.br/");
		inicioPage = new InicioPage(driver);
		pesquisaPage = new PesquisaPage(driver);
		produtoPage = new ProdutoPage(driver);
	}
	@Test
	public void test() {
		inicioPage.PesquisarIten();
		pesquisaPage.selecionarProduto();
		produtoPage.PreencheeSelecionaCEP();
		produtoPage.ValidaPreco();
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
