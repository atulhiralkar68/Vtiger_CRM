package Assignment2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * 
 * @author Atul
 * 
 *
 */
public class ClickElementOn3rdWindow {

	public static void main(String[] args) throws InterruptedException {
		 //Step 1: Open the Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome Driver Launch Successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Step 2: Enter valid URL
		driver.get("https://www.facebook.com/");
		driver.get("https://www.flipkart.com/");
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		System.out.println("Succesfully click on perticular element of third window");
	   driver.quit();	    
}

}
