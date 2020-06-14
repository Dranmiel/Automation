package com.selenium3.uimaps;
import org.openqa.selenium.WebDriver;
import com.selenium3.core.Element;
import com.selenium3.enums.ByValue;

public class ProdutoMap {
	WebDriver driver;
	
	public ProdutoMap(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//Cálculo do frete
	public Element inputCEP = new Element(driver, ByValue.ID, "calc_cep");
	public Element btnCEP = new Element(driver, ByValue.XPATH,"//input[@class='button-calcula-cep']");
	
	//Opções de frete com XPATH atrelado ao tipo de frete, sendo eles Correios PAC, Sedex e TNT Express
	
	public Element pacFrete = new Element(driver, ByValue.XPATH, "//td[text()='Correios PAC']/following::td[2]");
	public Element sedexFrete = new Element(driver, ByValue.XPATH, "//td[text()='Sedex']/following::td[2]");
	public Element tntFrete = new Element(driver, ByValue.XPATH, "//td[text()='TNT Express']/following::td[2]");
}
