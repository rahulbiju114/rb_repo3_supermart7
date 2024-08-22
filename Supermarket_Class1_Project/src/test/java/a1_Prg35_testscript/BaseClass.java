package a1_Prg35_testscript;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
	
	public WebDriver driver;
	
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver =  new ChromeDriver();
	  driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");
	  driver.manage().window().maximize();
  }
  
  
  
  
  @AfterMethod
  public void afterMethod() {
	  
	  //driver.quit();
  }

}
