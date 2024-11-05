package xls;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite1 {

	public static void main(String[] args) throws IOException {
		

		FileInputStream fs=new FileInputStream("C:\\Users\\DELL\\Desktop\\ECLIPSE\\Book1.xlsx");

		XSSFWorkbook wb=new XSSFWorkbook(fs);
		
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		//case1-modify an existing cell
		
		//sheet.getRow(0).getCell(1).setCellValue("xyz");
		
		//case2-create a new cell in existing cell
		
		//sheet.getRow(1).createCell(3).setCellValue("python");
		
		//case3-create a cell in a new row
		
		sheet.createRow(3).createCell(0).setCellValue("bhargav");
		
		FileOutputStream fso=new FileOutputStream("C:\\Users\\DELL\\Desktop\\ECLIPSE\\Book1.xlsx");

		wb.write(fso);
		
		wb.close();
	}

}
