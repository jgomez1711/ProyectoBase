package Booking.Paginas;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Booking.Steps.Questions;
import net.thucydides.core.annotations.Step;

public class CrearContraseña {

	private Questions questions = new Questions();

	@FindBy(how = How.ID, using = "new_password")
	private WebElement NewContraseña;

	@FindBy(how = How.ID, using = "confirmed_password")
	private WebElement ConfirmedContraseña;

	@FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]/span[1]")
	private WebElement BtnCrearCuenta;

	public CrearContraseña(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@Step
	public void Contraseña(WebDriver driver, String NuevaContraseña, String ConfirmarContraseña) throws IOException {
		this.questions.tituloAssert(driver);
		this.questions.textoAssert(driver);

		NewContraseña.sendKeys(NuevaContraseña);
		ConfirmedContraseña.sendKeys(ConfirmarContraseña);

		this.questions.screenShot(driver);

		BtnCrearCuenta.click();

	}

}
