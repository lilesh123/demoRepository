package Demo;

import java.awt.AWTException;
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class Practice {
	     
	    public static void main(String[] aa) throws AWTException, InterruptedException {
	    	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://brand.toyota.com/downloads");
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("//button[@class=\"close-welcome-modal\"]")).click();
	         
	        Thread.sleep(3000);
	      
	  
	        driver.findElement(By.id("user-dropdown")).click();
	         
	        List<WebElement> allOptions = driver.findElements(By.id("user-dropdown"));
	        System.out.println(allOptions.size());
	         
	                 
	                 
	        for(int i = 0; i<=allOptions.size()-1; i++) {
	             
	             
	            if(allOptions.get(i).getText().contains("Featured")) {
	                 
	                allOptions.get(i).click();
	                break;
	                 
	            }
	        }
	         
	}
	 
	}	
		
