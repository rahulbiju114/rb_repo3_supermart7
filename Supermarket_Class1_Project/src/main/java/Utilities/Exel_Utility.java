package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Constants.Constants;
	public class Exel_Utility 
	{
		public static FileInputStream f;
		public static XSSFWorkbook w;
		public static XSSFSheet sh,sh1;
		
	//  public static String getStringData(int a,int b) throws IOException
		
																								// For LoginPage TextCAses
		
    public static String getStringData(int a,int b,String sheet1) throws IOException			//4Exel. sheet1
    {
    	String filePath = Constants.TESTDATAFILE;  												// 2Exel. class.obj name
    	
    	f=new FileInputStream(filePath); 														//3Exel. pass obj 
    	
//    	f=new FileInputStream("C:\\Users\\rahul\\git\\rb_repo3_supermart7\\Supermarket_Class1_Project\\src\\test\\resources\\Exel Login.xlsx");
    	w=new XSSFWorkbook(f);
    	
//    	sh=w.getSheet("IDName");
    	sh=w.getSheet(sheet1);																	//5Exel. sheet1 called
    	
    	Row r=sh.getRow(a);//Interface
    	Cell c=r.getCell(b);//Interface
    	return c.getStringCellValue();//method for returning cell value    
    }
    
    
    public static String getStringData2(int a,int b,String sheet1) throws IOException			// for Category and SubCategory TestCases
    {
    	String filePath = Constants.TESTCATFILED;  												
    	
    	f=new FileInputStream(filePath); 														
    	
    	w=new XSSFWorkbook(f);
    	
    	sh=w.getSheet(sheet1);																
    	
    	Row r=sh.getRow(a);//Interface
    	Cell c=r.getCell(b);//Interface
    	return c.getStringCellValue();//method for returning cell value    
    }
    
    
    public static String getIntegerData(int a,int b,String sheet1) throws IOException
    {
    	String filepath=Constants.TESTDATAFILE;
    	f=new FileInputStream(filepath);
    	w=new XSSFWorkbook(f);
    	sh=w.getSheet(sheet1);
    	Row r=sh.getRow(a);//Interface
    	Cell c=r.getCell(b);//Interface
    	int x=(int) c.getNumericCellValue();//type casting String value to integer value
    	return String.valueOf(x);
    }

    
	}