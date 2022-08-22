package Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class DataProviderExcel {
	/*ChromeDriver driver;
	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/testlink/login.php");
	} */
	
	@Test 
	public void excelSheet() throws FileNotFoundException {
	FileInputStream fis = new FileInputStream ("Book1.xlsx");
	Workbook workbook = workbook.getWorkbook(fis);
	Sheet sheet workbook.getSheet(1);
	Cell cell = sheet.getCell(0,0);
	String txt = cell.getContents();
	System.out.println(txt);
	}
	

}
