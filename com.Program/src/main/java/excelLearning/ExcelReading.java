package excelLearning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReading {

	public static void main(String[] args) throws Exception{
		String excelPath=".\\excel.xlsx";
		FileInputStream fis= new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh = wb.getSheetAt(0);
		int rows = sh.getLastRowNum();
		int cols = sh.getRow(1).getLastCellNum();
		for(int r=1;r<=rows;r++) {
		Row row=sh.getRow(r);
		for (int c=0;c<cols;c++) {
			Cell cell = row.getCell(c);
			System.out.println(cell.getStringCellValue());
			}
		}
	}

}
