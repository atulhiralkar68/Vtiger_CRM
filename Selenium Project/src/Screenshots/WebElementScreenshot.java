package Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.swiggy.com/");
		//File tempFile = driver.findElement(By.xpath("//span[text()='Locate Me']")).getScreenshotAs(OutputType.FILE);
		//File tempFile = driver.findElement(By.xpath("//span[text()='FIND FOOD']")).getScreenshotAs(OutputType.FILE);
		File tempFile = driver.findElement(By.xpath("//img[@src='https://res.cloudinary.com/swiggy/image/upload/fl_lossy,f_auto,q_auto,h_108/play_ip0jfp']")).getScreenshotAs(OutputType.FILE);
		//span[text()='FIND FOOD']
		File destFile = new File("./errorshots/webelwment2.png");
		FileUtils.copyFile(tempFile, destFile);
		driver.close();
		
		
	
	}

}
