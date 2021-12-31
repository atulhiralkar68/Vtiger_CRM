package SyncronizationConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethod {

	public static void main(String[] args) {

       System.setProperty("web.chrome.driver.", "./drivers/chromedriver.exe");
       ChromeDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       //we use these to give time for page loading
     WebDriverWait wait=new WebDriverWait(driver, 10);
     
     driver.get("https://www.instagram.com/");
     wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));//waiting then perform action
     driver.findElement(By.name("username")).sendKeys("atul");
     driver.findElement(By.name("password")).sendKeys("1232445");
     driver.findElement(By.xpath("//button[.='Log In']")).click();
       
		
	}

}
