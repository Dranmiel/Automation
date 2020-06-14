package com.selenium2.pages;

import org.openqa.selenium.WebDriver;

import com.selenium2.uimaps.InicioMap;

public class InicioPage {
	
	WebDriver driver;
	
	public InicioPage(WebDriver driver) {
		this.driver = driver;
	}
	
	InicioMap inicioMap = new InicioMap(driver);
	
	public void selecionarDepartureDestination(String depart, String dest) {
		inicioMap.selectDepartureCity.select(driver, depart);
		inicioMap.selectDestinationCity.select(driver, dest);
		inicioMap.btnFindFlights().click(driver);
	}
}