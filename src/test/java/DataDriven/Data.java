package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.Format;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Data {

	public static void main(String[] args) throws IOException {
		
		// get the Excel path
		File path = new File("E:\\eclipse new\\DataDriven0.1\\src\\test\\resources\\Files\\Excel.xlsx");

		// Read the Excel file
		FileInputStream read = new FileInputStream(path);

		// get the Workbook 
		Workbook v = new XSSFWorkbook(read);

		// get the sheet
		Sheet sheet = v.getSheet("login");

		// get the row
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		

		// format the cell data
		DataFormatter data = new DataFormatter();
		String formattedCellValue = data.formatCellValue(cell);
		
		

		System.out.println(formattedCellValue);
		
		v.close();


	}

}
