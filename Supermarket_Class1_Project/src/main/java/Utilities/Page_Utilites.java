package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Page_Utilites {
	
	WebDriver driver;
	
	//1. Category_page - pageScrolldown()
	
	public void scrollDown1()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
	}
	
	
	// SubCategory_ Page - 
	public void subDropDown(WebElement indexWebElement) {
		
		Select s1 = new Select(indexWebElement);
		s1.selectByIndex(3);
		
	}
	

	
	
	

}
