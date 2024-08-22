package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Utilities.Wait_Utilities;

public class Category_Page {
	
	public WebDriver driver;
	
	public Category_Page(WebDriver driver ) {   // constructor
		
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}

		
		@FindBy(xpath="(//a[@class='small-box-footer'])[3]") WebElement locateCategory1; 		// 1. locate Category
		public void clickCategory() {
			
			locateCategory1.click();
		}
		
		@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement new1;			// 2. locate new
		public void clickNew() {
			
			new1.click();
		}
		
//===================================================================================================================================================================//		
		
//		@FindBy(xpath="//input[@placeholder='Enter the Category']") WebElement name1;		//3. locate and Enter Category name -- 1st way direclty value given
//		public void enterName() {
//			
//			name1.sendKeys("RR Human");
//		}
		
		
		@FindBy(xpath="//input[@placeholder='Enter the Category']") WebElement name1;		//3. locate and Enter Category name -- 2nd way get values from excel
		public void enterName(String categoryFiled) {
			
			name1.sendKeys(categoryFiled);
		}

//===================================================================================================================================================================//		
		//Click on group discount
		@FindBy(xpath="//li[@id='134-selectable']")WebElement group1;				//4. click discount
				public void clickGroup() {
					
					group1.click();
				}
		
		//upload image
		
				
		@FindBy(xpath="//input[@name='main_img']") WebElement image1;				//5.choose image -- not working
		public void chooseImage() {
			
			image1.sendKeys("C:\\Users\\rahul\\Desktop\\img1.jpg");            //// doubt- click and select - NO
			
			
		}
		
		

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
//		//click save
//		
//		@FindBy(xpath="//button[@name='create']")WebElement save1; 				//6. save button
//	
//		public void clickSave() {
//			
//			save1.click();       
//		
//	 }
		
		
		//Using wait - directly - 1St way
		

//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		@FindBy(xpath="//button[@name='create']")WebElement save1; 				//6. save button
//	
//		public void clickSave() {
//			
//			wait.until(ExpectedConditions.elementToBeClickable(save1));
//			save1.click();       
//		
//	 }
		
		//Using wait - from Wait-Utilities - 2nd way

		Wait_Utilities wt = new Wait_Utilities();
		@FindBy(xpath="//button[@name='create']")WebElement save1;
		public void clickSave() {
			
			save1.click();       
			wt.waitforCategory(save1);
			
			
		}
		
		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			
		public void pageScrolldown() {												//7.	// scroll down  -- directly through page - 1st way
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)");
		}
		
								// 2nd way Using Utility way --------> Not working
		
//		Page_Utilites pg = new Page_Utilites();					 // create an object of Page_Utilites
//		public void pageScrolldown() {							// create method
//			
//			pg.scrollDown1();									// call object of Page_Utilites
//		}
		
		
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		
		
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert1;  		  //9.  Assertion : Search no results 
		
		public boolean isAlertDisplayed() {
			
			return alert1.isDisplayed();
		}
		
		
		
		
				


}
