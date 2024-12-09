package basicScripts;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMultipleData {
public static void main(String[] args) throws IOException {
	XSSFWorkbook book = new XSSFWorkbook("./TestData/Facebook credentials.xlsx");
	XSSFSheet sheet = book.getSheet("Sheet1");
    int lr = sheet.getLastRowNum();
    for(int i=0;i<=lr;i++)
    {
    	XSSFRow row = sheet.getRow(i);
    	XSSFCell cel1 = row.getCell(0);
    	String c1val = cel1.getStringCellValue();
    	XSSFCell cel2 = row.getCell(1);
    	String c2val = cel2.getStringCellValue();
    	System.out.println(c1val+" "+" "+c2val);
    	
    	
    }
	
	
	
}
}
