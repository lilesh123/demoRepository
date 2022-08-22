package Demo;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;
 
public class Test2 {
	ChromeDriver driver;
	
 @BeforeClass
 public void setUp() {
	 System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	 driver.get("https://brand.toyota.com/support");
 }
 
 @Test
public void clickAll() {
	 System.out.println("clicked on plus");
	 List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"accordion-e4826ada8e-item-8b72791db4-button\"]/div/span[2]"));
	 for(WebElement element: list)
	 {
	      element.click();
	 }

     List<WebElement> inputFields = driver.findElements(By.xpath("//*[contains(@id,'tmna-subscribe')]"));
     {
         for (WebElement i:inputFields) {
             String columnData =i.getAttribute("placeholder");        
             i.sendKeys(ContactUsData.get(columnData));
             System.out.println(ContactUsData.get(columnData));
             Thread.sleep(800);        
             }
     JavascriptExecutor js = ((JavascriptExecutor) driver);
     js.executeScript("window.scrollBy(0,100)", "");

     TopicDropdown.click();
     String dropdownValue= ContactUsData.get("Topic");
     driver.findElement(By.xpath("//div[text()='"+dropdownValue+"']")).click();
     Thread.sleep(1000);    

     if(SubmitRequestButton.isEnabled()==true) {
     SubmitRequestButton.click();
     WebDriverWait wait = new  WebDriverWait(driver, 300);
     WebElement ContactUsMessage = driver.findElement(By.xpath("//p[@class='tmna-form-error-msg']"));
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='tmna-form-error-msg']")));
     Thread.sleep(800);
     System.out.println("Displayed Error message: " +ContactUsMessage.getText());
     }
     else {
         int a=1;
         System.out.println("Captured errors are:");
     List <WebElement> ErrorMessagesForContactUsFields = ContactUsContainer.findElements(By.xpath("//span[@class='errorMsgSupport']"));
//     System.out.println(ErrorMessagesForContactUsFields.size());
         for(WebElement i: ErrorMessagesForContactUsFields){
             if (i.isDisplayed() && a< ErrorMessagesForContactUsFields.size()) {
     System.out.println(a+"." +i.getText());
         a++;
         Thread.sleep(800);
     } }
//     driver.navigate().refresh();
         }
     driver.navigate().refresh();

     }


 }
 
}

/*

@Test (priority=5)
public void accordion1 () throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[3]/div/div/div[1]/div/div/div/div[1]/div[1]/div/span[2]")).click();
	Thread.sleep(1500); 
	driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/div[3]/div/div/div[1]/div/div/div/div[1]/div[1]/div/span[2]")).click();
	
}

@Test (priority=6)
public void accordion2 ()  throws InterruptedException {
	Thread.sleep(1500);
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[3]/div/div/div[1]/div/div/div/div[2]/div[1]/div/span[2]")).click();
	Thread.sleep(1500); 
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[3]/div/div/div[1]/div/div/div/div[2]/div[1]/div/span[2]")).click();
	
}

@Test (priority=7)
public void accordion3 () throws InterruptedException {
	Thread.sleep(1500);
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[3]/div/div/div[2]/div/div/div/div[1]/div[1]/div/span[2]")).click();
	Thread.sleep(1500); 
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[3]/div/div/div[2]/div/div/div/div[1]/div[1]/div/span[2]")).click();
	
}

@Test (priority=8)
public void accordion4 () throws InterruptedException {
	Thread.sleep(1500);
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[3]/div/div/div[2]/div/div/div/div[2]/div[1]/div/span[2]")).click();
	Thread.sleep(1500); 
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[3]/div/div/div[2]/div/div/div/div[2]/div[1]/div/span[2]")).click();
	
}

@Test (priority=9)
public void accordion5 () throws InterruptedException {
	Thread.sleep(1500);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[5]/div/div/div[1]/div/div[1]/div[2]/div[1]/div[1]/div/span[2]")).click();
	Thread.sleep(1500); 
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[5]/div/div/div[1]/div/div[1]/div[2]/div[1]/div[1]/div/span[2]")).click();
	
}

@Test (priority=10)
public void accordion6 () throws InterruptedException {
	Thread.sleep(1500);
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[5]/div/div/div[1]/div/div[1]/div[2]/div[2]/div[1]/div/span[2]")).click();
	Thread.sleep(1500); 
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[5]/div/div/div[1]/div/div[1]/div[2]/div[2]/div[1]/div/span[2]")).click();
	
}

@Test (priority=11)
public void accordion7 () throws InterruptedException {
	Thread.sleep(1500);
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[5]/div/div/div[1]/div/div[1]/div[2]/div[3]/div[1]/div/span[2]")).click();
	Thread.sleep(1500); 
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[5]/div/div/div[1]/div/div[1]/div[2]/div[3]/div[1]/div/span[2]")).click();
	
}

@Test (priority=12)
public void accordion8 () throws InterruptedException {
	Thread.sleep(1500);
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[5]/div/div/div[1]/div/div[1]/div[2]/div[4]/div[1]/div/span[2]")).click();
	Thread.sleep(1500); 
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[5]/div/div/div[1]/div/div[1]/div[2]/div[4]/div[1]/div/span[2]")).click();
	
}

@Test (priority=13)
public void accordion9 () throws InterruptedException {
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,200)");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[5]/div/div/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/span[2]")).click();
	Thread.sleep(2000); 
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[5]/div/div/div[1]/div/div[2]/div[2]/div[1]/div[1]/div/span[2]")).click();
	
}

@Test 
public void accordion10 () throws InterruptedException {
	Thread.sleep(1500);
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[5]/div/div/div[1]/div/div[2]/div[2]/div[2]/div[1]/div/span[1]")).click();
	Thread.sleep(1500); 
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div[5]/div/div/div[1]/div/div[2]/div[2]/div[2]/div[1]/div/span[2]")).click();
	
}*/





