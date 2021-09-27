package Orange.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	
	@FindBy(how = How.ID, using = "txtUsername")
	private WebElement inputUserName;
	
	
	
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void loginIn(String userName) {
		
		inputUserName.sendKeys(userName);
		
		
		
		
		
		
		
		
		
	}

}
