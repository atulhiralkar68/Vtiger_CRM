package urbunLadder;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urban_Ladder_2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.urbanladder.com/");
		driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys("Study table",Keys.ENTER);
		driver.findElement(By.partialLinkText("Close")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Price')]")).click();
		WebElement target1 = driver.findElement(By.xpath("//div[@class=\"noUi-handle noUi-handle-lower\"]"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(target1, (318-270), 0).perform();
		WebElement target2 = driver.findElement(By.xpath("//div[@class=\"noUi-handle noUi-handle-upper\"]"));
		action.dragAndDropBy(target2, -(585-372), 0).perform();	
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='(Hibiscus White)']")).click();
		//driver.findElement(By.xpath("//ul[@class='product list small-block-grid-3']//li[4]")).click();
		String parentwindow = driver.getWindowHandle();
		Set<String> allwindowsid = driver.getWindowHandles();
		allwindowsid.remove(parentwindow);
		for(String windowId:allwindowsid) {
			driver.switchTo().window(windowId);
           	}
	
		String productName = driver.findElement(By.xpath("//h1[@class=\"product-title\"]")).getText();
		//System.out.println(productName);
		String productPrice = driver.findElement(By.xpath("//div[@class=\"price discounted-price\"]")).getText();
	    //System.out.println(productPrice);
	    String warranty = driver.findElement(By.xpath("//b[text()='12 month warranty']")).getText();
		
		System.out.println("Product Name : "+ productName +" , "+" Product Price : "+ productPrice );
		System.out.println("Warranty of Product "+ warranty);
		driver.findElement(By.xpath("//button[@data-variantname=\"(Hibiscus White)\"]")).click();
		driver.quit();
	
	}

}
