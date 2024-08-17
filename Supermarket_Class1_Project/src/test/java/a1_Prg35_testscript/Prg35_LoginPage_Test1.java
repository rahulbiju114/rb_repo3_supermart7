// valid username and password

package a1_Prg35_testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import a1_Prg35_Pages.Prg35_LoginPage;

public class Prg35_LoginPage_Test1 extends Prg35_BaseClass{
  @Test
  public void enterValues() {
	  
	  String uA1 = "admin";
	  String pA1 = "admin";
	  
	  
	  Prg35_LoginPage p1 = new Prg35_LoginPage(driver);
	  p1.enterUsname(uA1);
	  p1.enterPass(pA1);
	  p1.getClicked();
	  
	  boolean isDashLoaded = p1.isDashboardDisplayed();
	 // System.out.println("The Dash board is loaded : "+isDashLoaded);
	  
	  assertTrue(isDashLoaded, "Dashboard not loaded");
	  
  }
  
  
  
  
}
