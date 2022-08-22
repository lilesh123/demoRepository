package Demo;




import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SupportEG {
    WebDriver driver;
    Actions ac;
    List<WebElement> AccordionIcons;

    @BeforeSuite
    void openBrowser() {
    	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://brand.toyota.com/support");
    }
    
    @Test
	public void heroBaner () { 
		boolean status = driver.findElement(By.xpath("//*[@id=\"hero-ratio-img\"]")).isDisplayed();
		System.out.println("Herobanner :");
		System.out.println(status);
	}
	
	@Test
	public void checkSearchBox () {
		boolean status = driver.findElement(By.xpath("//div[@class=\"search-container\"]")).isDisplayed();
		System.out.println("checkSearchBox :");
		System.out.println(status);
	}
	
	@Test
	public void buttonDisable () {
		
		boolean status = driver.findElement(By.xpath("//*[@id=\"submit-search\"]")).isEnabled();
		System.out.println(" buttonDisable is");
		System.out.println(status);
	}
	
	@Test
	public void enterValueInSearchBox() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class=\"tt-input\"]")).sendKeys("Search Example");
		//driver.findElement(By.id("submit-search")).click();
		Thread.sleep(1500);
		//driver.navigate().back();
		//Thread.sleep(1500);	
	}
	

    @Test
	public void openAccordion() throws InterruptedException {
        driver.findElement(By.xpath(
                "//div[@class=\"tmna-cookies-button btn tmna-button-accept-cookies tmna-button tmna-button-outline-light\"]")).click();

        for (int i = 0; i <= 1; i++) {
            if (i==0) {
                AccordionIcons = driver.findElements(By.xpath("//div[@class=\"cmp-accordion__item tmna-support-accordion-item\"]"));
                System.out.println("Accordion Expand");
            } else {
                AccordionIcons = driver.findElements(By.xpath("//div[@class=\"cmp-accordion__button tmna-support-accordion-item-header--button\"]"));
                System.out.println("Accordion Collpse");
            }

            if (AccordionIcons.size() > 0) {
                Thread.sleep(1000);
                for (WebElement elements : AccordionIcons) {
                    Actions actions = new Actions(driver);
                    actions.moveToElement(elements).click().perform();
                    Thread.sleep(500); 
                }
            } 
            else {
                System.out.println("No Accordions found on Support page");
            }
        }
    }
    
    @Test
	public void requestForm () throws InterruptedException {
    	  List<WebElement> inputFields = driver.findElements(By.xpath("//*[contains(@id,'tmna-subscribe')]"));
    	     {
    	         for (WebElement k :inputFields) {
    	        	 String[] str = {"Lil", "Ok@abc", "Description"};
    	        	 k.sendKeys(str[0]);
    	        	 k.sendKeys(str[1]);
    	        	 k.sendKeys(str[2]);
        	        // for (int i=0; i<str.length; i++) {
        	        	
        	          //} 	           
    	         }
    	        
    	           //  String columnData = i.getAttribute("placeholder");        
    	           //  i.sendKeys(ContactUsData.get(columnData));      
    	             }
    	     }
  	
    
    @Test
	public void emailLink () throws InterruptedException {
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//span[text()='Email us at brand@toyota.com']")).click();
    }
}