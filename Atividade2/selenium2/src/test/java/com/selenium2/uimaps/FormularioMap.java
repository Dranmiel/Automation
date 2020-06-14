package com.selenium2.uimaps;

import org.openqa.selenium.WebDriver;

import com.selenium2.core.Element;
import com.selenium2.enums.ByValue;

public class FormularioMap {
	
	WebDriver driver;
	
	public FormularioMap(WebDriver driver) {
		this.driver = driver;
	}
	//Formulario
	public Element inputName = new Element(driver, ByValue.XPATH, "//input[@name='inputName']");
	public Element inputAddress = new Element(driver, ByValue.XPATH, "//input[@name='address']");
	public Element inputCity = new Element(driver, ByValue.XPATH, "//input[@name='city']");
	public Element inputState = new Element(driver, ByValue.XPATH, "//input[@name='state']");
	public Element inputZipCode = new Element(driver, ByValue.XPATH, "//input[@name='zipCode']");
	public Element btnCardType = new Element(driver, ByValue.XPATH, "//select[@name='cardType']");
	public Element inputCreditCardNumber = new Element(driver, ByValue.XPATH, "//input[@name='creditCardNumber']");
	public Element inputMonth = new Element(driver, ByValue.XPATH, "//input[@name='creditCardMonth']");
	public Element inputYear = new Element(driver, ByValue.XPATH, "//input[@name='creditCardYear']");
	public Element inputNameonCard = new Element(driver, ByValue.XPATH, "//input[@name='nameOnCard']");
	public Element checkBox = new Element(driver, ByValue.XPATH, "//input[@type ='checkbox']");
	public Element btnSubmit = new Element(driver, ByValue.XPATH, "//input[@value='Purchase Flight']");
	
}
