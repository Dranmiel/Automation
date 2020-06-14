package com.selenium2.uimaps;

import org.openqa.selenium.WebDriver;

import com.selenium2.core.Element;
import com.selenium2.enums.ByValue;

public class ConfirmationMap {
	
	WebDriver driver;
	
	public ConfirmationMap(WebDriver driver) {
		this.driver = driver;
	}
	
	public Element tituloMensagem = new Element(driver, ByValue.XPATH, "//h1[text() = 'Thank you for your purchase today!']");
}
