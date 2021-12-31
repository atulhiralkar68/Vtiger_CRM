package SyncronizationConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SycronizationInstagram {

	public static void main(String[] args) {
          
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("Atul");
	    driver.findElement(By.name("password")).sendKeys("hkashdfk",Keys.ENTER);
		
	
		driver.findElement(By.xpath("//button[text()='Show']")).click();
		
	}

}
