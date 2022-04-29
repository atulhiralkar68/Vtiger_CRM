package tataPlay;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TataLogin {//Correct Script

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 1500000);
		
//		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
//				.withTimeout(30, TimeUnit.SECONDS)
//				.pollingEvery(10, TimeUnit.MILLISECONDS)
		
//				.ignoring(NoSuchElementException.class);


		BaseClass baseclass= new BaseClass();

		driver.get("https://qa-portal.tataplay.com/my-account");
		driver.findElement(By.className("form-control")).sendKeys("3001490394");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();

		driver.get("https://chrome.google.com/webstore/detail/buster-captcha-solver-for/mpbjkejclgfgadiemmefgebjfooflfhl/related?utm_source=googleads&utm_medium=adgroup5&utm_campaign=adgroup5&utm_id=adgroup5&gclid=Cj0KCQjw_4-SBhCgARIsAAlegrXbLMwtQfw6IWspGkRToIR9EoRHyXy3MEIpQpFTn_3UpTxJpXT2weMaAuSpEALw_wcB");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[@class='e-f-w']/../../..//div[text()='Add to Chrome']")));
		driver.findElement(By.xpath("//h1[@class='e-f-w']/../../..//div[text()='Add to Chrome']")).click();
		Thread.sleep(30000); 
		driver.navigate().back();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='OTP']")));
		driver.findElement(By.xpath("//span[text()='OTP']")).click();
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("123456");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();

		
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nav visible']//img[@class='white-arrow']")));
		//driver.findElement(By.xpath("//div[@class='nav visible']//img[@class='white-arrow']")).click();
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//i[@title='Close']")));
		//driver.findElement(By.xpath("//i[@title='Close']")).click();

		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt=' Manage Pack']")));
		Thread.sleep(50000);
		BaseClass.baseclass(driver);
		//Thread.sleep(10000);
		driver.findElement(By.xpath("//img[@alt=' Manage Pack']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Refresh']")).click();
		Thread.sleep(10000);
		BaseClass.baseclass(driver);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@src='/assets/images/info-new.svg']")));
		driver.findElement(By.xpath("//img[@src='/assets/images/info-new.svg']")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[text()='Primary Box']/../..//a[text()='View Details']")).click();

		Thread.sleep(7000);
		BaseClass.baseclass(driver);
		driver.findElement(By.xpath("//h2[text()='Monthly payable Amount']/../../..//i[@class='demo-icon icon-close-1']")).click();
		driver.findElement(By.xpath("//div[text()='Monthly Charges']/..//a[text()='View Details']")).click();
		Thread.sleep(3000);
		BaseClass.baseclass(driver);
		driver.findElement(By.xpath("//button[text()='Modify Packs & Channels']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Modify']")).click();
		//driver.findElement(By.xpath("//a[text()='Okay']")).click();
		Thread.sleep(3000);
		//BaseClass.baseclass(driver);
		//Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(10000,0);");
		Thread.sleep(4000);
		BaseClass.baseclass(driver);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Binge Combos']")).click();
		Thread.sleep(4000);

		BaseClass.baseclass(driver);
	}
}
