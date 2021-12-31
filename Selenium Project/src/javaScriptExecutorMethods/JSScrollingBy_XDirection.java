package javaScriptExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSScrollingBy_XDirection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.album.alexflueras.ro/galleries/urban.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(1000,0);");//Page will scrole Up(in x direction slide by 1000)
        Thread.sleep(2000);//To see The Execution We use Thread.sleep.
        js.executeScript("window.scrollBy(1000,50);");
        //Again Page will scroll up by 50 and slide by 1000(in x direction slide by 1000 ,y direction scroll up by 50)
        js.executeScript("window.scrollBy(1000,0);");
        
	}

}
