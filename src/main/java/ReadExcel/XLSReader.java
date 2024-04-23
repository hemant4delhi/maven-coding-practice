package ReadExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream stream = new FileInputStream(new File(".\\src\\main\\resources\\excel.xlsx"));
		XSSFWorkbook book= new XSSFWorkbook(stream);
		XSSFSheet sheet = book.getSheetAt(0);
		
		Iterator<Row> itr = sheet.iterator();
		
		while(itr.hasNext()) {
			Row row = itr.next();
			
			Iterator<Cell> itrcell = row.cellIterator();
			
			while(itrcell.hasNext()) {
				Cell cell =itrcell.next();
				System.out.print(cell.getStringCellValue()+" ");
				
				
				
				
			}
			
			System.out.println();
		}
			
			
		}
		
}
