// All Assertion value

package Constants;

public class Constants {
	
	// Category - isAlert1
	
	public static final String ERRORFORCATEGORYALERT ="Category Not Created Successfully - Error"; 
	
	// SubCategory - isAlert1
	
		public static final String ERRORFORSUBCATEGORYALERT ="Sub"
				+ "Category Not Created Successfully - Error"; 
	
	
	// LoginPage_TestCase1 - /////// 1. valid User name and valid  password //////
	
	public static final String ERRORFORLOGINPAGEALERT1 ="Dashboard not loaded";   //  assertTrue(isDashLoaded, Constants.ERRORFORLOGINPAGEALERT1);
	
	// LoginPage_TestCase1 - //////2. valid User name and invalid password ///////
	
	public static final String ERRORFORLOGINPAGEALERT2 ="Alert invalud password not loaded";
	
	// LoginPage_TestCase1 - //////3. invalid User name and valid password ////////
	
	public static final String ERRORFORLOGINPAGEALERT3 ="Alert Invalid username not loaded";
	
	// LoginPage_TestCase1 - ///////////4.  LOgOut ///////////////
	
	public static final String ERRORFORLOGINPAGEALERT4 ="Login page not loaded";
	
	
	//===========================================================================================================================================================//
	
	
	// Exel.xsxl - LoginPage_TestCase
	
	public static final String TESTDATAFILE = System.getProperty("user.dir")+"\\src\\test\\resources\\Exel3.xlsx"; // 1. Excel give path
	
	// Exel.xsxl - Category and SubCategory_TestCase
	
	public static final String TESTCATFILED = System.getProperty("user.dir")+"\\src\\test\\resources\\CatSubField.xlsx"; 
	
	

}

	//===========================================================================================================================================================//
