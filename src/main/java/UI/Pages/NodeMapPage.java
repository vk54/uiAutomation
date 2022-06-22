package UI.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import UI.BasePage;

public class NodeMapPage extends BasePage {
	  
	  
	  
	  
	  
	  
	
	 
	 
	 @FindBy(xpath="//span[contains(text(),'Application')]")
		WebElement menuIcon;
	 
	 @FindBy(xpath="//span[contains(text(),'Node Map')]")
		WebElement nodeMap;
	 
	 @FindBy(xpath="//div[@id='appsStructureElem']/app-nodemap/div")
		List <WebElement> nodesList;
	
	 @FindBy(xpath="//div[@class='ng-star-inserted']/app-summary-component/div/div[6]/div/span[2]")
		WebElement summaryNode;
	public NodeMapPage () {
		pageInitElements(this);
	}
	
	
	public void clickMenuIcon() throws InterruptedException {
		Thread.sleep(10000);
		menuIcon.click();
		nodeMap.click();
		Thread.sleep(10000);
	int ActualCount =	nodesList.size();
	System.out.println("Actual : " + ActualCount);
	int expectedCount = Integer.parseInt(summaryNode.getText());
	System.out.println("expected : "+expectedCount);
	Thread.sleep(10000);
	}
}

