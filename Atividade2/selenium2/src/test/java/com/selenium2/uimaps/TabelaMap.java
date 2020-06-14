package com.selenium2.uimaps;

import org.openqa.selenium.WebDriver;

import com.selenium2.core.Element;
import com.selenium2.enums.ByValue;

public class TabelaMap {
	
	WebDriver driver;
	
	public TabelaMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public Element validateDeparts = new Element(driver, ByValue.XPATH, "//th[text() = 'Departs: San Diego']");
	public Element validateArrives = new Element(driver, ByValue.XPATH, "//th[text() = 'Arrives: New York']");
	
	
	public Element btnChooseFlight (String string) {
		return new Element(driver, ByValue.XPATH, "//td[text()='"+string+"']//preceding::input[@value='Choose This Flight']");
	}
}