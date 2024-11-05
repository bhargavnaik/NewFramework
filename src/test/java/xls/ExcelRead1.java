package xls;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fs=new FileInputStream("C:\\Users\\DELL\\Desktop\\ECLIPSE\\Book1.xlsx");

		XSSFWorkbook wb=new XSSFWorkbook(fs);
		
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		System.out.println("getLastRowNumber:"+sheet.getLastRowNum());
		
		System.out.println("getPhysicalNumberofRows:"+sheet.getPhysicalNumberOfRows());
		
		XSSFRow row=sheet.getRow(1);
		
		System.out.println("getLastCellNumber:"+row.getLastCellNum());
		
		System.out.println("getPhysicalNumberofCells:"+row.getPhysicalNumberOfCells());
		
		XSSFCell cell=row.getCell(0);
		
		System.out.println(cell);
	}

}
