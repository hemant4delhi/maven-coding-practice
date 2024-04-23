package ReadExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Test {

	public static void main(String[] args) throws IOException {
		FileInputStream stream = new FileInputStream(new File(".\\src\\main\\resources\\excel.xlsx"));
		XSSFWorkbook booke = new XSSFWorkbook(stream);
		XSSFSheet sheet = booke.getSheetAt(0);
		Iterator<Row> rowItr = sheet.iterator();
		
		while(rowItr.hasNext()) {
			Row row = rowItr.next();
			
			Iterator<Cell> cellItr = row.cellIterator();
			
			while(cellItr.hasNext()) {
				Cell cell = cellItr.next();
				System.out.println(cell.getStringCellValue());
				
			}
		}
		
	
	}

}
