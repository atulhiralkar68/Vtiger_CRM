package javaScriptExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/***
 * 
 * @author AtulHiralkar
 *
 */
public class JSScrollingUsingInfiniteForLoopArgument {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);//We take Only 2 Sec Because it takes long time to scroll if we take 10 sec.

		driver.get("https://www.google.com/doodles");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//Infinite For Loop Use Break Compulsary otherwise it acts like a recursive method.
		int []a= {100,400,500};
		for(;;) {
			try {
				driver.findElement(By.linkText("Christopher Reeve's 69th Birthday")).click();
				break;
			}catch(NoSuchElementException e) {//NOsuchElementExeption Should Be frome Selenium Only Must Remember

				js.executeScript("window.scrollBy(0,argument[0]);",a);	
			}
		}
	}
}
