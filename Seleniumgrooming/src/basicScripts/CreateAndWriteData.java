package basicScripts;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateAndWriteData {
public static void main(String[] args) throws IOException {
	XSSFWorkbook book = new XSSFWorkbook();
	XSSFSheet sheet = book.createSheet("AutomationFramework");
	XSSFRow row = sheet.createRow(0);
	XSSFCell cel = row.createCell(0);
	cel.setCellValue("AutomationClass");
	FileOutputStream fos=new FileOutputStream("./TestData/Framework.xlsx");
	book.write(fos);
	book.close();
	fos.close();
	
}
}
