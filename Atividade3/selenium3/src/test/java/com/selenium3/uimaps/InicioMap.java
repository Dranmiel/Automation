package com.selenium3.uimaps;

import org.openqa.selenium.WebDriver;
import com.selenium3.core.Element;
import com.selenium3.enums.ByValue;

public class InicioMap {
	WebDriver driver;
	
	public InicioMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public Element searchBar = new Element(driver, ByValue.XPATH, "//input[@class='sprocura']");
	public Element serarchBtn = new Element(driver, ByValue.XPATH, "//input[@id='bt-busca']");
}
