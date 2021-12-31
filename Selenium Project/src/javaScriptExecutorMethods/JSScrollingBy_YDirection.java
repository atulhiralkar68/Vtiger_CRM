package javaScriptExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSScrollingBy_YDirection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.myntra.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000);");//Page will scrole Up(in y direction up by 1000)
        Thread.sleep(2000);//To see The Execution We use Thread.sleep.
        js.executeScript("window.scrollBy(0,1000);");//Again Page will scrole Up(in y direction up by 1000)
        js.executeScript("window.scrollBy(1000,0);");
        //If we Interchange value its not working Because page dont have "x" direction movement.
	}

}
