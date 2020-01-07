package Generic;

import java.io.FileInputStream;



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class getdata{
public static String getdata1(String sheet,int row,int cell) 
{
	
	String val=" ";
	
	try
	{
		FileInputStream fis=new FileInputStream("./Excel/Sample.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
	    Cell c = wb.getSheet("sheet").getRow(row).getCell(cell);
				val=c.toString();
	}
	catch(Exception e)
	{
		Reporter.log("Invalid path",true);
	}

	return val;
}
}