package com.selenium2.uimaps;

import org.openqa.selenium.WebDriver;
import com.selenium2.core.Element;
import com.selenium2.enums.ByValue;

public class InicioMap {
	
	WebDriver driver;
	
	public InicioMap(WebDriver driver) {
		this.driver = driver;
	}

	public Element selectDepartureCity = new Element(driver, ByValue.XPATH, "//select[@name='fromPort']");
	public Element selectDestinationCity = new Element(driver, ByValue.XPATH, "//select[@name='toPort']");
	
	public Element btnFindFlights() {
		return new Element(driver, ByValue.XPATH,"//input[@type='submit']");
	}
}
