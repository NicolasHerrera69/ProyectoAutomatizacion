package Orange.Definitions;

import org.openqa.selenium.WebDriver;

import Orange.Pages.LoginPage;
import Orange.Steps.Conexion;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();

	private LoginPage loginPage = new LoginPage(driver);

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}

	@And("^Diligenciar usuario (.*)$")
	public void loginIn(String userName) {
		this.loginPage = new LoginPage(driver);
		this.loginPage.loginIn(userName);

	}

}