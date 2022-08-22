package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;


public class DataProviderTest {
	ChromeDriver driver;
@Test (dataProvider= "loginTestData")
      
	public void loginData (String username, String password) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/testlink/login.php");
		
		driver.findElement(By.id("login")).sendKeys(username);
		driver.findElement(By.name("tl_password")).sendKeys(password);
		driver.findElement(By.name("login_submit")).click();
		Thread.sleep(500);
		driver.quit();
		
	}
	@DataProvider (name="loginTestData")
	public Object[][] testData () {
		Object [][] data= new Object [2][2];
		data[0][0]= "Admin";
		data[0][1]= "Admin123";
		
		data[1][0]= "Admin1";
		data[1][1]= "Adminxyz";
		
		return data;
		
	}

}
