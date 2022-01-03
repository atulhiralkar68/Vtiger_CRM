
package urbunLadder;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UrbunLadder1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		driver.get("https://www.urbanladder.com/");
		driver.findElement(By.xpath("//li[@class='topnav_item livingunit']")).click();
		driver.findElement(By.xpath("//span[text()='Lounge Chairs']")).click();
		driver.findElement(By.partialLinkText("Close")).click();
		
		 WebElement productPrice = driver.findElement(By.xpath("//ul[@class='productlist withdivider clearfix lounge_chairs productgrid']/child::li[3]/descendant::span[2]"));
		 
		 wait.until(ExpectedConditions.visibilityOf(productPrice));
		 String price = productPrice.getText();
		 System.out.println(price);
		
		String parentwindowid = driver.getWindowHandle();
		Set<String> allwindowsid = driver.getWindowHandles();
		allwindowsid.remove(parentwindowid);
		
		for(String windowId:allwindowsid) {
			driver.switchTo().window(windowId);
			driver.findElement(By.partialLinkText("Close")).click();
		}
			
		char[] priceArrey=price.toCharArray();
		String cost="";
		for(char p: priceArrey) {
			if(p>=48 && p<=57 ) {
				cost=cost+p;
			}
		}
		int productCost = Integer.parseInt(cost);
		
		if(productCost>=20000) {
			System.out.println("The product cost is more than 20000");
		}else {
			System.out.println("The product cost is less than 20000");
		}
		
		productPrice.click();
		
		String parentwindowid1 = driver.getWindowHandle();
		Set<String> allwindowsid1 = driver.getWindowHandles();
		allwindowsid1.remove(parentwindowid1);
		
		for(String windowId:allwindowsid1) {
			driver.switchTo().window(windowId);
			
		}
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300);");
		
		driver.findElement(By.xpath("//h1[contains(text(),'Genoa Wing Chair')]/../..//button[contains(@data-variantname,'(Floral)')]")).click();
	    driver.quit();
	}
}
