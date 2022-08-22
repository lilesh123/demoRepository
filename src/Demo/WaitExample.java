package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample {
	
	private static final String TimeSpan = null;
	ChromeDriver driver;
	public void waitImpl() {
	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://brand.toyota.com/support");
	
	WebDriverWait wait = new WebDriverWait(driver,TimeSpan.FromSeconds(10));
	wait.Until(ExpectedConditions.ElementIsVisible(By.id("elementId")));
	}
}
