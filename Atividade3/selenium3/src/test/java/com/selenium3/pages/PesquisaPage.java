package com.selenium3.pages;

import org.openqa.selenium.WebDriver;

import com.selenium3.uimaps.PesquisaMap;

public class PesquisaPage {
	WebDriver driver;
	
	public PesquisaPage(WebDriver driver) {
		this.driver = driver;
	}
	
	PesquisaMap pesquisaMap = new PesquisaMap(driver);
	
	
	public void selecionarProduto() {
		pesquisaMap.productLink.click(driver);
	}
}
