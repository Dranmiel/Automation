package com.selenium.uimaps;

import org.openqa.selenium.WebDriver;
import com.selenium.core.Element;
import com.selenium.enums.ByValue;

public class InicioMap {
	
	WebDriver driver;
	
	public InicioMap(WebDriver driver) {
		this.driver = driver;
	}

	public Element selectTipoFormulario = new Element(driver, ByValue.XPATH, "//div[@class='nav']/select");
	
	public Element btnviewDemo(String string) {
		return new Element(driver, ByValue.XPATH,"(//a[text() = '"+string+"']//following::a[text()='View Demo'])[1]");
		
	}
}
