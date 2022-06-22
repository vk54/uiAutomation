package opscruise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import UI.BasePage;
import UI.Pages.LoginPage;
import UI.Pages.NodeMapPage;

public class TestNodeMapScreen  {
@Test(priority = 0)
	public void testNodesCount () throws InterruptedException  {
	
	LoginPage lp = new LoginPage();
	lp.loadURL("https://awsqa6.opscruise.io/qa6/qa/application/app_map/graph");;
	lp.login("admin", "a82qa6@823");
	NodeMapPage np = new NodeMapPage();
	np.clickMenuIcon();
		
	  
	}

}