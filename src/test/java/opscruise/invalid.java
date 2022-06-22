package opscruise;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import UI.BasePage;
import UI.Pages.LoginPage;

public class invalid {
	@Test(priority = 1)
	public void test_invalidLogin() throws InterruptedException {
		LoginPage lp = new LoginPage();
		lp.loadURL("https://qa3.opscruise.io/qa3/dev/");
		lp.login("admin", "a82qa6@823");
		
	}
	
}
