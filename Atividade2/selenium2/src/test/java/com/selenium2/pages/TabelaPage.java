package com.selenium2.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium2.uimaps.TabelaMap;
import com.selenium2.uimaps.InicioMap;

public class TabelaPage {
	
	WebDriver driver;
	
	public TabelaPage(WebDriver driver) {
		this.driver = driver;
	}
	
	TabelaMap tabelaMap = new TabelaMap(driver);
	/**metodo que valida os elementos na tabela 
	 * 
	 */
	public void validarTabela() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tabelaMap.validateArrives.getValue())));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tabelaMap.validateDeparts.getValue())));
			String Departs = driver.findElement(By.xpath(tabelaMap.validateDeparts.getValue())).getText();
			String Arrives = driver.findElement(By.xpath(tabelaMap.validateArrives.getValue())).getText();
			System.out.println(Departs +"\n"+ Arrives);
			Assert.assertEquals("Erro ao validar as informações no cabeçalho da tabela","Departs: San Diego", Departs);
			Assert.assertEquals("Erro ao validar as informações no cabeçalho da tabela","Arrives: New York", Arrives);
			System.out.println("Sucesso");
		} catch (Exception e) {
			System.out.println("Falha!");
		}
	}
	public void selecionarVoo(String flight) {
		tabelaMap.btnChooseFlight(flight).click(driver);
	}
}