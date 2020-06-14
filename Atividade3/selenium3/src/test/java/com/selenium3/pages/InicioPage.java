package com.selenium3.pages;

import org.openqa.selenium.WebDriver;

import com.selenium3.uimaps.InicioMap;

public class InicioPage {
	WebDriver driver;
	
	public InicioPage(WebDriver driver) {
		this.driver = driver;
	}
	
	InicioMap inicioMap = new InicioMap(driver);
	
	public void PesquisarIten() {
		inicioMap.searchBar.sendKey(driver, "Capa Targus Ipad Mini Rotating Versavu THZ668 Grafite");
		inicioMap.serarchBtn.click(driver);
	}
}
