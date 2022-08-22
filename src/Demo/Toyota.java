package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Toyota {
	WebDriver driver;

	 @BeforeSuite
	    void openBrowser() {
	    	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://brand.toyota.com/support");
	    }
	 @Test
	 public void emailLink () throws InterruptedException {
		 JavascriptExecutor js = ((JavascriptExecutor) driver);
	     js.executeScript("window.scrollBy(0,1000)", "");
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//span[text()='Email us at brand@toyota.com']")).click();

	 }
}
