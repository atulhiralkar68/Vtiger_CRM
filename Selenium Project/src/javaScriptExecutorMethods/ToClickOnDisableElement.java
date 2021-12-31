package javaScriptExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickOnDisableElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);//We take Only 2 Sec Because it takes long time to scroll if we take 10 sec.
		
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		driver.findElement(By.linkText("jdk-11.0.13_linux-aarch64_bin.deb")).click();
		WebElement disableElement = driver.findElement(By.xpath("//a[@class='download-file icn-lock']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
	     js.executeScript("argument[0].click();", disableElement);
	}

}
