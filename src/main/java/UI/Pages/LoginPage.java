package UI.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import UI.BasePage;

public class LoginPage extends BasePage {
	
	@FindBy(id="username")
	WebElement userNameTextBox;
	
	@FindBy(id="password")
	WebElement passwordTextBox;
	
	@FindBy(id="kc-login")
	WebElement loginButton;
	
	public LoginPage () {
		pageInitElements(this);
	}

	public void login(String userName, String password) {
		
		userNameTextBox.sendKeys(userName);
		passwordTextBox.sendKeys(password);
		loginButton.click();
		System.out.println("Login button clicked");
		
	}
	
	

}
