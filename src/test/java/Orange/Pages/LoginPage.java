package Orange.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.MouseAction.Button;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Orange.Steps.ButtonPages;

public class LoginPage {
	
	private ButtonPages buttonPages;

	@FindBy(how = How.ID, using = "txtUsername")
	private WebElement inputUserName;

	@FindBy(how = How.ID, using = "txtPassword")
	private WebElement inputUserPassword;

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.buttonPages = new ButtonPages(driver);

	}

	public void loginIn(String userName,String password) {

		inputUserName.sendKeys(userName);
		inputUserPassword.sendKeys(password);
		buttonPages.btnLogin();
		
		

	}

}
