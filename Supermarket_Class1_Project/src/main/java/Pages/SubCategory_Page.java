package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Page_Utilites;

public class SubCategory_Page {

public WebDriver driver;
	
	public SubCategory_Page(WebDriver driver ) {   // constructor
		
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[4]") WebElement locateSubCategory1; 		// 1. locate SubCategory
	public void clickSubCategory() {
		
		locateSubCategory1.click();
	}
	
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement locateNewButton; 		// 2. locate New Button
	public void clickNewButton() {
		
		locateNewButton.click();
	}
	
	@FindBy(xpath="//select[@id='cat_id']") WebElement clickDropDown1; 		// 3. click dropdown for Categoty
	public void clickDropDownSub() {
		
		Page_Utilites page1 = new Page_Utilites();
		page1.subDropDown(clickDropDown1);
	}
	
	
	
//==========================================================================================================================================//
	
//	@FindBy(xpath="//input[@id='subcategory']") WebElement enterSubCat1;		// 4. enter subcategory  --- 1st way
//	public void enterSubCat() {
//		
//		enterSubCat1.sendKeys("RR human");
//	}
	
	@FindBy(xpath="//input[@id='subcategory']") WebElement enterSubCat1;		//4. 2nd way - Exel
	public void enterSubCat(String subCategoryFiled) {
		
		enterSubCat1.sendKeys(subCategoryFiled);
	}
	
//==========================================================================================================================================//
	
	@FindBy(xpath="//input[@name='main_img']") WebElement image1;				//5.choose image 
	public void chooseImage() {
		
	image1.sendKeys("C:\\Users\\rahul\\Desktop\\Obsqura\\Selenium\\images\\img1.jpg");            	
	}
	
	@FindBy(xpath="//button[@type='submit']") WebElement save1;				//6. click save button 
	public void saveButton() {
		
	save1.click();           	
	}
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert1;  		  //7.  Assertion : Search no results 
	
	public boolean isAlertDisplayed() {
		
		return alert1.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
}
