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
public class ScrollToElementHeight {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);//We take Only 2 Sec Because it takes long time to scroll if we take 10 sec.

		driver.get("https://meesho.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;

		WebElement expectedelement = driver.findElement(By.xpath("//strong[text()='Beauty & Makeup']"));

		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	}
}
