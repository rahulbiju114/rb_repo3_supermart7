package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminUsers_Page {
	
public WebDriver driver;
	
	public AdminUsers_Page(WebDriver driver ) {   
		
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	

	@FindBy(xpath="(//a[@class='small-box-footer'])[1]") WebElement locateAdminUser1; 		// 1. locate AdminUSer
	public void clickAdminUser() {
		
		locateAdminUser1.click();
	}
	
	@FindBy(xpath="(//i[@class='fas fa-trash-alt'])[1]") WebElement delete1; 		// 1. delete AdminUSer
	public void deleteAdminUser() {
		
		delete1.click();
		driver.switchTo().alert().accept();
	}
	
	@FindBy(xpath="(//i[@class='fa fa-unlock'])[1]") WebElement active1; 		// 1. active button AdminUSer
	public void clickActiveButton() {
		
		active1.click();
		
	}
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert1;  		  //9.  Assertion 
	
	public boolean isAlertDisplayed() {
		
		return alert1.isDisplayed();
	}

}
