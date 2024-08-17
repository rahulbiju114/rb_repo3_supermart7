// invalid username valid password


package a1_Prg35_testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import a1_Prg35_Pages.Prg35_LoginPage;

public class Prg35_LoginPage_Test3 extends Prg35_BaseClass{
  @Test
  public void enterValues() {
	  
	  String uA1 = "a";
	  String pA1 = "admin";
	  
	  
	  Prg35_LoginPage p2 = new Prg35_LoginPage(driver);
	  p2.enterUsname(uA1);
	  p2.enterPass(pA1);
	  p2.getClicked();
	  
	  
	  boolean isAlert = p2.isAlertDisp();  
	  assertTrue(isAlert, "Alert Invalid username not loaded");
	  
  }
  
}
  