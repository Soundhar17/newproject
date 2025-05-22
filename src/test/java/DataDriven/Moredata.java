package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Moredata {

	public static void main(String[] args) throws IOException {

		File path = new File("E:\\eclipse new\\DataDriven0.1\\src\\test\\resources\\Files\\Excel.xlsx");

		FileInputStream stream = new FileInputStream(path);

		Workbook wb = new XSSFWorkbook(stream);

		Sheet sheet = wb.getSheet("login");

		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();

		for (int i = 1; i < physicalNumberOfRows; i++) {

			Row row = sheet.getRow(i);

			int physicalNumberOfCells = row.getPhysicalNumberOfCells();

			for (int j = 0; j < physicalNumberOfCells; j++) {

				Cell cell = row.getCell(j);

				DataFormatter v = new DataFormatter();

				String formatCellValue = v.formatCellValue(cell);

				System.out.print(" "+ formatCellValue);

			}

			System.out.println("  ");

			wb.close();
		}

	}

}
