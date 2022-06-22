package UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BasePage {
 static WebDriver driver;

public BasePage() {
	if(driver == null||((RemoteWebDriver) driver).getSessionId()==null) {
		init();
	}
}
//|| ((RemoteWebDriver) driver).getSessionId()==null)
public void init () {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 
	 BasePage.driver = new ChromeDriver();
}

public  void loadURL (String url) {
	driver.get(url);
}

public  void pageInitElements(BasePage Page) {
	PageFactory.initElements(driver, Page);
}

@BeforeMethod()
public void start () {
	System.out.println("test case started");
	
}

  @AfterMethod(alwaysRun = true)
  public  void teardown() { 
System.out.println("closing browser");
  BasePage.driver.quit(); }
 
}
