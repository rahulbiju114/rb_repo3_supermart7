package a1_Prg35_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Prg36_ManageProduct {
	
public WebDriver driver;
	
	
	public Prg36_ManageProduct(WebDriver driver ) {   // constructor
		
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	
	// 1. locate Manage Product
	@FindBy(xpath="//p[text()='Manage Product']") WebElement mp1;
	
	public void getClicked1() 
	{
		mp1.click();
		
	}
	
	// 2. Delete an item from the list
	
	@FindBy(xpath="//i[@class='fas fa-trash-alt']") WebElement dele1;
	public void getClicked2() 
	{
		dele1.click();
		driver.switchTo().alert().accept();
	}
	
	// 3. serach button
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement search1;
	public void getClicked3() 
	{
		search1.click();
		
	}
	
	// 4. serach - title
	@FindBy(xpath="//input[@name='un']") WebElement title1;
	
	public void enterTitle(String titleA) {
		
		title1.sendKeys(titleA);
	}
	
	// product code
	@FindBy(xpath="//input[@name='cd']") WebElement proCode1;
	
	public void enterproCode(String proCodeA) {
		
		proCode1.sendKeys(proCodeA);
	}
	
	//Category
	@FindBy(xpath="//option[@value='257']") WebElement cat1;
	
	public void clickCat() {
		
		cat1.click();;
	}
	
	//Sub cat
	@FindBy(xpath="//option[@value='257']") WebElement subCat1;
	
	public void clickSubCat() {
		
		subCat1.click();;
	}
	
	//click on serach button
	@FindBy(xpath="//button[@value='sr']") WebElement srchBut1;
	public void clickSrchButn() {
		
		srchBut1.click();;
	}
	
}
