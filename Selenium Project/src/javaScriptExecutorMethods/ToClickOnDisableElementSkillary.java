package javaScriptExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/***
 * 
 * @author AtulHiralkar
 *
 */
public class ToClickOnDisableElementSkillary {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);//We take Only 2 Sec Because it takes long time to scroll if we take 10 sec.

		driver.get("https://demoapp.skillrary.com/");
		//driver.findElement(By.xpath("//input[@disabled]")).click();
		WebElement disableElement = driver.findElement(By.xpath("//input[@class='form-control']"));

		JavascriptExecutor js=(JavascriptExecutor)driver;

		//  js.executeScript("argument[0].click();", disableElement);
		js.executeScript("argument[0].value='Atul';",disableElement );
		Thread.sleep(3000);
		js.executeScript("argument[0].value='';",disableElement );

	}
}


