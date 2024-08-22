package Pages;


import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




public class ManageProduct_Page {
	
public WebDriver driver;
	
	
	public ManageProduct_Page(WebDriver driver ) {   // constructor
		
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	
		//////////////////////////////////////////////////////////////////
	
				/////////// Manage Product Delete ///////////////
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	@FindBy(xpath="(//a[@class='small-box-footer'])[8]") WebElement mp1;   // 1. locate Manage Product
	
	//@FindBy(xpath="//p[text()='Manage Product']") WebElement mp1;   // 1. locate Manage Product

	public void getClickedLocate() 
	{
		wait.until(ExpectedConditions.elementToBeClickable(mp1));
		
		mp1.click();
		
	}
	
	
	
	@FindBy(xpath="//i[@class='fas fa-trash-alt']") WebElement delete1;        // 2. Delete an item from the list
	public void getClickedDelete() 
	{
		delete1.click();
		driver.switchTo().alert().accept();
	}
	
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement delete2;	//3. Delete alert
	public boolean isDeleteAlert() {
		
		return delete2.isDisplayed();
	}
	
	
		//////////////////////////////////////////////////////////////////
	
				/////////// Manage Product Search ///////////////
	
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement search1;   // 3. serach button
	public void getClicked_SearchButton() 
	{
		search1.click();
		
	}
	
	
	@FindBy(xpath="//input[@name='un']") WebElement title1;    // 4. Enter title
	public void enterTitle(String title2) {
		
		title1.sendKeys(title2);
		
	}
	
	
	@FindBy(xpath="//input[@name='cd']") WebElement proCode1;   //5. product code
	
	public void enterProductCode(String proCode2) {
		
		proCode1.sendKeys(proCode2);
	}
	
	
	
	@FindBy(xpath="//option[@value='257']") WebElement category1;    //6. Category ---> normal way
	
	public void clickCategory() {
		
		category1.click();;
	}
	
	
	
//	@FindBy(xpath="//option[@value='314']") WebElement subCategory1;   //7. Enter Sub Category ---> normal way
//	
//	public void clickSubCategory() {
//		
//		subCategory1.click();;
//	}
	
	
	@FindBy(xpath="//select[@id='sb']") WebElement subCategory1;      //7. Enter Sub Category ---> using select class
	Select s1 = new Select(subCategory1);
	public void clickSubCategory() {
		
		s1.selectByIndex(2);
	}
	
	
	
	
	
	@FindBy(xpath="//button[@value='sr']") WebElement srchBut1;   //8. //click on search button
	public void clickSearchButton() {
		
		srchBut1.click();;
	}
	
   
		@FindBy(xpath="//center[text()='.........RESULT NOT FOUND.......']") WebElement serchAssert;  		  //9.  Assertion : Search no results 
		public boolean isSerachAssert() {
			
			return serchAssert.isDisplayed();
		}
		
		public void scrollDown1() 												// 10.Scroll Down
		{
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,650)");
		}
		
		
//////////////////////////////////////////////////////////////////////////////////////
		
//		public void scroll1() {
//			
//			pg.scrollDown1(); // call the object
//		}
	
		 
		
		// 4. serach - title
		
		
		//FileUploadUtility fp = new FileUploadUtility();   //////////////////////// -- File upload
		
//		@FindBy(xpath="//input[@name='un']") WebElement title1;
		
//		public void enterTitle(String titleA) throws AWTException {
//			
//			title1.sendKeys(titleA);
//			fp.selectAll();
//			
//		}
		
		//Category ---> using page utility
		
//		@FindBy(xpath="//select[@id='cat_id']") WebElement cat1;
	//	
//		Page_Utilities pg = new Page_Utilities();  ///////////////////////---------- create object
//		Wait_utility wt = new Wait_utility();
	//	
//		public void clickCat() {
//			
//			wt.waitforCategory(cat1); // wait
//			pg.selectIndex(cat1); // call the object  // choose index 2
//			
//		}
		
		

}
