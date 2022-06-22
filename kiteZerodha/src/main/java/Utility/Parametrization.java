package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	public static String getData(String sheetName,int row,int cell) throws IOException 
	{
		FileInputStream file=new FileInputStream("F:\\Automation Program\\kiteZerodha\\src\\test\\resources\\Login.xlsx");
		String value=WorkbookFactory.create(file).getSheet("Credential").getRow(row).getCell(cell).getStringCellValue();
		return value;
	}

	

}
