

package testscripts;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Constants.Constants;
import Pages.LoginPage_Page;
import Utilities.Exel_Utility;

public class LoginPage_TestCase1 extends BaseClass{
	
	@DataProvider(name="credentials")
	public Object[][] testData(){				// data provider
		Object[][] input = new Object[2][2];
		input[0][0] = "admin";
		input[0][1] = "admin";
		input[1][0] = "admin@123";
		input[1][1] = "admin123";
		return input;
	}
	
														/////// 1. valid User name and valid  password //////
   	
  @Test(priority = 1)
  
  public void enterValues1() throws IOException {
	  
//	  String uA1 = "admin";     			// Directly give value - 1st way
//	 String uA1 = "admin";
	  
	  String uA1 = Exel_Utility.getStringData(1, 0, "Login1");   // 6Exel. 2nd way - Read from exel  // throws IOException
	  String pA1 = Exel_Utility.getStringData(1, 1, "Login1");
	  
	 
	  LoginPage_Page p1 = new LoginPage_Page(driver);
	  p1.enterUsname(uA1);
	  p1.enterPass(pA1);
	  p1.getClicked();
	  
	  boolean isDashLoaded = p1.isDashboardDisplayed();
	  
	 // assertTrue(isDashLoaded, "Dashboard not loaded"); 
	  assertTrue(isDashLoaded, Constants.ERRORFORLOGINPAGEALERT1);
	  
	  // System.out.println("The Dash board is loaded : "+isDashLoaded);
	  
  }
  
  														//////2. valid User name and invalid password ///////
  
  @Test(priority = 2 , dataProvider = "credentials")
  public void enterValues2(String uA1,String pA1) throws IOException {
	  
//	  String uA1 = "admin";
//	  String pA1 = "password";
	  
//	  String uA1 = Exel_Utility.getStringData(1, 0, "Login2");   // 6Exel. 2nd way - Read from exel  // throws IOException
//	  String pA1 = Exel_Utility.getStringData(1, 1, "Login2");
	  
	  
	  LoginPage_Page p2 = new LoginPage_Page(driver);
	  p2.enterUsname(uA1);
	  p2.enterPass(pA1);
	  p2.getClicked();
	  
	  
	  boolean isAlert = p2.isAlertDisp();  
		  assertTrue(isAlert, "Constants.ERRORFORLOGINPAGEALERT2");
	  
  }
  
  														//////3. invalid User name and valid password ////////
  
  @Test(priority = 3)
  @Parameters({"username","password"})
  public void enterValues3( String uA1, String pA1 ) throws IOException {
	  
//	  String uA1 = "a";
//	  String pA1 = "admin";
	  
//	  String uA1 = Exel_Utility.getStringData(1, 0, "Login3");   // 6Exel. 2nd way - Read from exel  // throws IOException
//	  String pA1 = Exel_Utility.getStringData(1, 1, "Login3");
	  
	  
	  LoginPage_Page p2 = new LoginPage_Page(driver);
	  p2.enterUsname(uA1);
	  p2.enterPass(pA1);
	  p2.getClicked();
	  
	  
	  boolean isAlert = p2.isAlertDisp();  
	  assertTrue(isAlert, "Constants.ERRORFORLOGINPAGEALERT3");
	  
  }
  
  											///////////4.  LOgOut ///////////////
  @Test(priority = 4)
  public void enterValues4() throws IOException {
	  
//	  String uA1 = "admin";
//	  String pA1 = "admin";
	  
	  String uA1 = Exel_Utility.getStringData(1, 0, "Login4");   // 6Exel. 2nd way - Read from exel  // throws IOException
	  String pA1 = Exel_Utility.getStringData(1, 1, "Login4");
	  
	  
	  LoginPage_Page p2 = new LoginPage_Page(driver);
	  p2.enterUsname(uA1);
	  p2.enterPass(pA1);
	  p2.getClicked();
	  
	  p2.getAdminClicked();
	  p2.getLogoutClicked();
	  
	  
	  boolean islogin = p2.isLogoutLogindDisplayed();  
	  assertTrue(islogin, "Constants.ERRORFORLOGINPAGEALERT4");
	
	  
  }
  
}
