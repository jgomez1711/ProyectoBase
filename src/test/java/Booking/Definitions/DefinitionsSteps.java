package Booking.Definitions;

import org.openqa.selenium.WebDriver;

import Booking.Steps.Conexion;
import cucumber.api.java.en.Given;


public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();

	

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}

}