package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFile {

	public static void readAndWriteExcelFile() throws IOException {

		String path = "./sample.xlsx";
		File file = new File(path);
		// how to create excel file
		try {
			FileOutputStream fos = new FileOutputStream(file);
			Workbook workbook = new XSSFWorkbook();
			Sheet sheetAt = workbook.getSheetAt(0);
			int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();

			for (int i = 0; i < physicalNumberOfRows; i++) {

				Row row = sheetAt.getRow(i);

				int physicalNumberOfCells = row.getPhysicalNumberOfCells();

				for (int j = 0; j < physicalNumberOfCells; j++) {

					Cell cell = row.getCell(j);
					
					String cellValue = getCellValue(cell);
					
					System.out.println("|"+cellValue);

				}System.out.println();

			}
			
			workbook.close();


		} 
		
		
	
		catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
		

	}

	public static String getCellValue(Cell cell) {

		switch (cell.getCellType()) {
		case NUMERIC: {

			return String.valueOf(cell.getNumericCellValue());

		}

		case BOOLEAN: {

			return String.valueOf(cell.getBooleanCellValue());

		}
		
		case STRING: {

			return  cell.getStringCellValue();

		}
		
	

		default:
			throw new IllegalArgumentException("Unexpected value: " + cell);
		}
		
	

	}

	public static void main(String[] args) {

	}

}
