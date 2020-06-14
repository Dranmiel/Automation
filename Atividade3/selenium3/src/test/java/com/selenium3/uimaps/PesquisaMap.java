package com.selenium3.uimaps;

import org.openqa.selenium.WebDriver;

import com.selenium3.core.Element;
import com.selenium3.enums.ByValue;

public class PesquisaMap {
	WebDriver driver;
	
	public PesquisaMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public Element productLink = new Element(driver, ByValue.XPATH, "//a[@class='sc-fzoLsD gnrNhT item-nome']");
}
