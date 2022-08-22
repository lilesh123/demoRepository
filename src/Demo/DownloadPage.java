package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DownloadPage {
	
ChromeDriver driver;
	
	@BeforeTest
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://brand.toyota.com/downloads");
		Thread.sleep(200);
		
		
	}
	
	@Test (priority=1)
	public void checkWebElementVisible () throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@class=\"close-welcome-modal\"]")).click();
		Thread.sleep(200);
		
		if(driver.findElements(By.xpath("//div[@class=\"search \"]")).size() != 0 && 
		   driver.findElements(By.xpath("//div[@class=\"selector selector-sort\"]")).size() != 0 &&
		   driver.findElements(By.xpath("//div[@class=\"view-control grid-view selected\"]")).size() != 0 &&
		   driver.findElements(By.xpath("//div[@class=\"option option-selected\"]")).size() != 0 && 
		   driver.findElements(By.xpath("//div[@class=\"mobilePaginator\"]")).size() != 0){
			
			System.out.println("Search Box, Assets Dropdown, Sort filter Dropdown and Pagination are Visible and List View is selected");
			//driver.findElements(By.xpath("//div[@class=\"search \"]")).sendKeys("heyy");
			}
		else{
			System.out.println("Search Box and dropdown is not Visible");
			}
	}
	
	@Test (priority= 2) 
	public void searchBox() throws InterruptedException {
		//driver.findElement(By.xpath("////input[@class="search-input"]")).sendKeys("Search example");
		if (driver.findElement(By.xpath("//input[@class=\"search-input\"]")).getSize()!= null) {
		
		System.out.println("Search box is found");
		WebElement searchbox = driver.findElement(By.xpath("//input[@class=\"search-input\"]"));
		Actions builder = new Actions(driver);
		Actions seriesOfActions = builder.moveToElement(searchbox).click().sendKeys(searchbox, " ");
		seriesOfActions.perform();
		Thread.sleep(800);
		}
		else {
			System.out.println("No search Box found");
		}
	}
	
	@Test (priority = 3)
	public void filterDropdown () {
		WebElement filterDropdown = driver.findElement(By.id("user-dropdown"));
		Select dropDown = new Select (filterDropdown);
		dropDown.selectByIndex(2);
		
		
	}
	
	@Test (priority= 4)
	public void gridListButton () throws InterruptedException {
		driver.findElement(By.xpath("//div[@class=\"view-control grid-view selected\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"view-control grid-view selected\"]")).click();
		Thread.sleep(2000);
	}
	
	@Test ( priority = 5)
	public void pagination() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        
		driver.findElement(By.xpath("//div[@class=\"nextArrow\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"prevArrow\"]")).click();
	}
	
	
	
	
	
}