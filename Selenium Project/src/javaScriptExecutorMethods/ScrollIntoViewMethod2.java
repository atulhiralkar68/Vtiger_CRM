package javaScriptExecutorMethods;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoViewMethod2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		driver.get("https://www.myntra.com/");
      //	driver.findElement(By.xpath("//button[text()='GOT IT']")).click();
	
		JavascriptExecutor js= (JavascriptExecutor) driver;
	    WebElement myntraLuxe = driver.findElement(By.xpath("//h4[text()='Myntra Luxe']"));//for myntra Applicaton
	     js.executeScript("arguments[0].scrollIntoView(true);", "Myntra Luxe");
	
	}

}
