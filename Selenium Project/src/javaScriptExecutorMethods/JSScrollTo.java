package javaScriptExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/***
 * 
 * @author AtulHiralkar
 *
 */
public class JSScrollTo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://www.myntra.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,1000);");//Page will scrole Up(in y direction up by 1000)
		// if we use ScrollTo then page move frome origion to entered value position
	}

}
