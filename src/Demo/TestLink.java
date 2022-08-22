package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLink {
	ChromeDriver driver;
	
	@BeforeClass
	public void setup () {
		
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	
	}
	
	@Test 
	public void launch() {
		driver.get("http://localhost/testlink/login.php");
	}
	
	@Test
	public void login() {
		driver.findElement(By.id("login")).sendKeys("lileshd");
		driver.findElement(By.name("tl_password")).sendKeys("Lilesh");
		driver.findElement(By.xpath("//*[@id=\"login_div\"]/form/input[5]")).click();
	}
	
	@Test 
	public void logOut() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/span[2]/a[2]")).click();
		
		driver.close();
	}

}










