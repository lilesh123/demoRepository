package Demo;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.openqa.selenium.WebElement;

public class SupportPage {
		ChromeDriver driver;
	
	@BeforeTest
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://brand.toyota.com/support");
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		
	}
	
	
	
	/*@Test (priority=1)
	public void heroBaner () {
		boolean status = driver.findElement(By.xpath("//*[@id=\"hero-ratio-img\"]")).isDisplayed();
		System.out.println("Herobanner is");
		System.out.println(status);
	}
	
	@Test (priority=2)
	public void checkSearchBox () {
		boolean status = driver.findElement(By.xpath("//div[@class=\"search-container\"]")).isDisplayed();
		System.out.println("checkSearchBox is");
		System.out.println(status);
	}
	
	@Test (priority=3)
	public void buttonDisable () {
		
		boolean status = driver.findElement(By.xpath("//*[@id=\"submit-search\"]")).isEnabled();
		System.out.println(" buttonDisable is");
		System.out.println(status);
	}
	
@Test (priority=4)
	public void enterValueInSearchBox() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class=\"search-input\"]")).sendKeys("Search example");
		driver.findElement(By.id("submit-search")).click();
		Thread.sleep(1500);
		//driver.navigate().back();
		//Thread.sleep(1500);	
	}
	
	
	
	@Test (priority=1)
	public void click_on_Plus_Cross() throws InterruptedException {
      List<WebElement> AccordionIcons =driver.findElements(By.xpath("//div[@class=\"cmp-accordion__item tmna-support-accordion-item\"]"));
       if(AccordionIcons.size()>0) {
      for (WebElement i:AccordionIcons) {
              Actions actions = new Actions(driver);
              actions.moveToElement(i).click().perform();
              Thread.sleep(300);
          }
      }
      else System.out.println("no Accordions found on Support page");
  }
	
	@Test (priority=2)
	public void click_on_Cross() throws InterruptedException {
		Thread.sleep(500);
      List<WebElement> AccordionCross =driver.findElements(By.xpath("//div[@class=\"cmp-accordion__item tmna-support-accordion-item\"]"));
       if(AccordionCross.size()>0) {
      for (WebElement j:AccordionCross) {
              Actions actions = new Actions(driver);
              actions.moveToElement(j).click().perform();
              Thread.sleep(300);
          }
      }
      else System.out.println("No cross found on Support page");
  } 
	*/
	  @Test()
	    public void click_on_Plus_Cross1() throws InterruptedException {
	        driver.findElement(By.xpath("//div[@class=\"tmna-cookies-button btn tmna-button-accept-cookies tmna-button tmna-button-outline-light\"]")).click();
	        List<WebElement> AccordionIcons = driver.findElements(By.xpath("//div[@class=\"cmp-accordion__item tmna-support-accordion-item\"]"));
	        if (AccordionIcons.size() > 0) {
	            //Thread.sleep(1000);
	            for (WebElement elements : AccordionIcons) {
	                Actions actions = new Actions(driver);
	                actions.moveToElement(elements).click().perform();
	               // Thread.sleep(1000);
	            }
	        } else
	            System.out.println("no Accordions found on Support page");


	        List<WebElement> closeAccord = driver.findElements(By.xpath("//div[@class=\"cmp-accordion__button tmna-support-accordion-item-header--button\"]"));
	        if (AccordionIcons.size() > 0) {
	            //Thread.sleep(1000);
	            for (WebElement clsAcd : closeAccord) {
	                Actions actions = new Actions(driver);
	                actions.moveToElement(clsAcd).click().perform();
	               // Thread.sleep(1000);
	            }
	        } else
	            System.out.println("no Accordions found on Support page");
	    }
	}
	
	











