package webdrivermethods;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependantDependantXpathFlipcart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		String parentwindowid = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
				
		driver.findElement(By.name("q")).sendKeys("Mobile",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='realme C21Y (Cross Blue, 32 GB)']")).click();
		driver.findElement(By.xpath("//div[text()='realme C21Y (Cross Black, 64 GB)']")).click();
		driver.findElement(By.xpath("//div[text()='REDMI 9i (Nature Green, 64 GB)']")).click();
		
		Set<String> allwindowsid = driver.getWindowHandles();
		allwindowsid.remove(parentwindowid);
		for(String windowId:allwindowsid) {
			driver.switchTo().window(windowId);
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			Thread.sleep(2000);
		}
		driver.switchTo().window(parentwindowid);
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);");
		//Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='realme C21Y (Cross Black, 64 GB)']/../../../..//div[text()='Remove']")).click();
		driver.findElement(By.xpath("//div[text()='Remove Item']/..//div[text()='Remove']")).click();
		Thread.sleep(4000);
		driver.quit();
		
	}

}
