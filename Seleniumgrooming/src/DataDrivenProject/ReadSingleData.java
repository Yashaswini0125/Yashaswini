package DataDrivenProject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadSingleData {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./Testdata/Facebook credentials.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	XSSFRow row=sheet.getRow(3);
	XSSFCell cel=row.getCell(0);
	String val=cel.getStringCellValue();
	System.out.println(val);
	
	XSSFSheet sheet1=workbook.getSheet("Sheet1");
	XSSFRow row1=sheet1.getRow(3);
	XSSFCell cel1=row1.getCell(1);
	String val1=cel1.getStringCellValue();
	System.out.println(val1);
	workbook.close();
	fis.close();
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	WebElement usn=driver.findElement(By.xpath("//input[@type='text']"));
	usn.sendKeys(val);
	WebElement psw=driver.findElement(By.xpath("//input[@type='password']"));
	psw.sendKeys(val1);
}
}
