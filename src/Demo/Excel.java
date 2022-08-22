package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Excel {
	public static void main(String [] args) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream ("Book1.xlsx");
		Workbook workbook = Workbook.getWorkbook(fis);
		Sheet sheet = workbook.getSheet(1);
		Cell cell = sheet.getCell(0,0);
		
		String txt = cell.getContents();
		System.out.println(txt);
		}
}
