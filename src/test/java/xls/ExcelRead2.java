package xls;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class ExcelRead2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fs=new FileInputStream("C:\\Users\\DELL\\Desktop\\ECLIPSE\\Book1.xlsx");

		XSSFWorkbook wb=new XSSFWorkbook(fs);
		
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		XSSFRow row=null;
		XSSFCell cell=null;
		
		for(int i=0;i<=sheet.getLastRowNum();i++)
		{
			row=sheet.getRow(i);
			
			for(int j=0;j<row.getLastCellNum();j++)
			{
				cell =row.getCell(j);
				
				System.out.print(cell+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
