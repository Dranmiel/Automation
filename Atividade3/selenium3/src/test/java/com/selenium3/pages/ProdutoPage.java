package com.selenium3.pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium3.uimaps.ProdutoMap;

public class ProdutoPage {
	WebDriver driver;
	
	public ProdutoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	ProdutoMap produtoMap = new ProdutoMap(driver);
	
	public void PreencheeSelecionaCEP() {
		
		produtoMap.inputCEP.click(driver);
		produtoMap.inputCEP.sendKey(driver, "38413108");
		produtoMap.btnCEP.click(driver);
	}
	
	public void ValidaPreco() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(produtoMap.pacFrete.getValue())));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(produtoMap.sedexFrete.getValue())));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(produtoMap.tntFrete.getValue())));
			String pac = driver.findElement(By.xpath(produtoMap.pacFrete.getValue())).getText();
			String sedex = driver.findElement(By.xpath(produtoMap.sedexFrete.getValue())).getText();
			String tnt = driver.findElement(By.xpath(produtoMap.tntFrete.getValue())).getText();
			Assert.assertEquals("Erro ao validar o valor do frete pac", "R$ 23,17", pac);
			Assert.assertEquals("Erro ao validar o valor do frete sedex", "R$ 40,75", sedex);
			Assert.assertEquals("Erro ao validar o valor do frete tnt", "R$ 51,67", tnt);
			System.out.println("Sucesso ao validar os precos");
		} catch (Exception e) {
			System.out.println("Falha!");
		}
	}
}
