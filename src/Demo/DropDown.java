package Demo;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DropDown {
	     
	     
	   // private static final Select s2 = null;

		public static void main(String[] args) throws AWTException, InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://demo.guru99.com/test/newtours/register.php");
	        driver.manage().window().maximize();
	        Thread.sleep(300);
	        
	        WebElement ele= driver.findElement(By.name("country"));
	        Select s = new Select(ele);
	        s.selectByValue("HONG KONG");
	
	 
	 
	        /*     Select s1 = new Select(ele);
	        s1.selectByIndex(4);
	 
	             Select s2 = new Select(ele);
	        s2.selectByVisibleText("ANGOLA");
	 
	 */
	}
	 
	}
	
	
