package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Updatedata {

	public static void main(String[] args) throws IOException {
		File path = new File("E:\\eclipse new\\DataDriven0.1\\src\\test\\resources\\Files\\Excel.xlsx");

		FileInputStream stream = new FileInputStream(path);

		Workbook wb = new XSSFWorkbook(stream);

		Sheet sheet = wb.getSheet("New Sheet1");

		Row createRow = sheet.getRow(0);

		Cell createCell = createRow.getCell(0);
		createCell.setCellValue("New Data1");

		DataFormatter x = new DataFormatter();
		String data = x.formatCellValue(createCell);

		if (data.equals("New Data1")) {
			createCell.setCellValue("soundhar1");

		}

		FileOutputStream v = new FileOutputStream(path);

		wb.write(v);

		wb.close();

		System.out.println("updated the data successfully ");

	}

}
