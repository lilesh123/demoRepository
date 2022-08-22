package Demo;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Slider {
	WebDriver driver;

	@Test 
	public void imageSlider () {
	System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
	driver.get("https://www.landrover.in/vehicles/discovery/index.html");
	driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
	WebElement slider = driver.findElement(By.xpath("//div[@id=\"full-width-slider\"]"));
	Actions action = new Actions(driver);
	WebElement source = null;
	int yOffset = 0;
	int xOffset = 0;
	action.dragAndDropBy(source, xOffset, yOffset).perform();

	
	}
}



list.add("Lilesh");
list.add("lilesh@xyz");
list.add("Hello dear");
Iterator<String> iterator = list.iterator();
while(iterator.hasNext()) {
	 i.sendKeys("Lilesh","lilesh@xyz","Hello dear");