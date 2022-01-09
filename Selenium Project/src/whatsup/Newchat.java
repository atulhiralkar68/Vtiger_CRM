package whatsup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/***
 * 
 * @author Atul
 *
 */
public class Newchat {
	public static void main(String[] args) {
		//Step 1: Launch the Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		driver.get("https://web.whatsapp.com/");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		WebElement sunu = driver.findElement(By.xpath("//span[text()='Sunu']"));
		wait.until(ExpectedConditions.visibilityOf(sunu));
		sunu.click();
		
	    
	    driver.findElement(By.xpath("//div[@title='Type a message']")).sendKeys("Hi",Keys.ENTER);
	    
		
//	    driver.close();
	    	
	}
}
