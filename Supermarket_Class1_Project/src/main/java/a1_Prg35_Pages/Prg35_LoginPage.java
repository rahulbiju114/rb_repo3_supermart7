package a1_Prg35_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Prg35_LoginPage {

public WebDriver driver;
	
	
	public Prg35_LoginPage(WebDriver driver ) {   // constructor
		
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	
	
	@FindBy(xpath="//input[@placeholder='Username']") WebElement usname1;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement pass1;
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']") WebElement button1;
	
	@FindBy(xpath="//p[text()='Dashboard']") WebElement dash1;
	
	@FindBy(xpath="//i[@class='icon fas fa-ban']") WebElement alert1;
	
	@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement admin1;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']") WebElement logout1;
	//  @FindBy(xpath="//body@class='login-page']") WebElement logIn1;
	@FindBy(xpath="//body@class='login-box']") WebElement logIn1;
	
	
	
	
	
	
	
	
	public void enterUsname(String usnameA) {
		
		usname1.sendKeys(usnameA);
	}
	
	public void enterPass(String passA) {
		
		pass1.sendKeys(passA);
	}
	
	public void getClicked() {
		
		button1.click();
	
}	
	
	public boolean isDashboardDisplayed() {
		
		return dash1.isDisplayed();
	}
	
	public boolean isAlertDisp() {
		
		return alert1.isDisplayed();
	}
	
	public void getAdminClicked() {
		
		admin1.click();
	}
	
	public void getLogoutClicked() {
		
		logout1.click();
	}
	
	
	public boolean isLogoutLogindDisplayed() {
		
		return logIn1.isDisplayed();
	}
}
