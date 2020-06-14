package com.selenium.uimaps;

import org.openqa.selenium.WebDriver;

import com.selenium.core.Element;
import com.selenium.enums.ByValue;

public class FormularioMap {
	
	WebDriver driver;
	
	public FormularioMap(WebDriver driver) {
		this.driver = driver;
	}
	//Formulario
	public Element inputFirstBox = new Element(driver, ByValue.XPATH, "//label[text()='How often do you attend events in this neighborhood?']//following::label[text() = 'Very often'][1]");
	public Element inputEventForm = new Element(driver, ByValue.ID, "wpforms-260271-field_2");
	public Element inputEventTypeForm = new Element(driver, ByValue.ID, "wpforms-260271-field_3");
	public Element inputSecondBox = new Element(driver, ByValue.XPATH, "//label[text()='How often do you participate in activities in this neighborhood?']//following::label[text() = 'Extremely often'][1]");
	public Element inputPaticipateForm = new Element(driver, ByValue.ID, "wpforms-260271-field_5");
	public Element inputParticipateTypeForm = new Element(driver, ByValue.ID, "wpforms-260271-field_6");
	public Element btnSubmit = new Element(driver, ByValue.XPATH, "//button[text()='Submit']");
	
	//Mensagem
	public Element tituloMensagem = new Element(driver, ByValue.XPATH, "//h3[text()='Congrats, You Completed the First Step!']");
	public Element btnMensagem = new Element(driver, ByValue.XPATH, "//h3[text() = 'Congrats, You Completed the First Step!']/..//a[@class = 'button']");
	
}
