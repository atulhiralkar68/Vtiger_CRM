package javaScriptExecutorMethods;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class DefaultScrolingByFindElement {

	public static void main(String[] args) throws InterruptedException {
		//Step 1: Launch the Browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    
				driver.get("https://www.naukri.com/");
				String parentWindowId = driver.getWindowHandle();
				Set<String> allWindowIds = driver.getWindowHandles();
				allWindowIds.remove(parentWindowId);
				
				for(String windowId : allWindowIds) {
					driver.switchTo().window(windowId);
					driver.close();
				}
				
				driver.switchTo().window(parentWindowId);
				driver.findElement(By.xpath("//button[text()='GOT IT']")).click();
				Thread.sleep(2000);//To see The Execution We Provide sleep..
				//String msg = 
			    driver.findElement(By.partialLinkText("NLP Jobs")).click();//getText();
			   //System.out.println(msg);
					
			}
}
