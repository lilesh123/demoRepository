package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;
	@BeforeClass
	public void homepage()throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(500);
	}
	@Test (priority = 1)
	public void logIn()  {
	
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7030140150");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Lilesh123");
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		//driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[1]/div/img")).click();
		//driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[3]/div/div/a/div/img[2]")).click();
	}
	
	@Test (priority = 2)
	public void click () {
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/a/div[1]/div/img")).click();
		driver.findElement(By.id("//*[@id=\"container\"]/div/div[3]/div[3]/div/div/a/div/img[2]")).click();
		String ActTitle = "Mobiles Big Saving Days July 2022";
		String ExpTitle = driver.getTitle();
		Assert.assertEquals(ActTitle, ExpTitle);
		
	}
}
	


