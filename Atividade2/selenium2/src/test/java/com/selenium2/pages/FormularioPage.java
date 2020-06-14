package com.selenium2.pages;

import org.openqa.selenium.WebDriver;
import com.selenium2.uimaps.FormularioMap;
import com.selenium2.uimaps.InicioMap;
import com.selenium2.core.Element;

public class FormularioPage {
	
	WebDriver driver;
	
	public FormularioPage(WebDriver driver) {
		this.driver = driver;
	}
	
	FormularioMap formularioMap = new FormularioMap(driver);
	
	
	public void preencherFormulario() {
		formularioMap.inputName.sendKey(driver, "asdf");
		formularioMap.inputAddress.sendKey(driver, "asdf");
		formularioMap.inputCity.sendKey(driver, "asdf");
		formularioMap.inputState.sendKey(driver, "asdf");
		formularioMap.inputZipCode.sendKey(driver, "12345");
		formularioMap.btnCardType.select(driver, "American Express");
		formularioMap.inputCreditCardNumber.sendKey(driver, "123412341234");
		formularioMap.inputMonth.sendKey(driver, "10");
		formularioMap.inputYear.sendKey(driver, "2020");
		formularioMap.inputNameonCard.sendKey(driver, "asdfasdf");
		formularioMap.checkBox.click(driver);
		formularioMap.btnSubmit.click(driver);
	}
}
