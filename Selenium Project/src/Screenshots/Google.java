package Screenshots;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * 
 * @author Shree
 *
 */
@SuppressWarnings("deprecation")
public class Google {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in");
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		
		driver.findElement(By.xpath("//span[text()='Gmail']"));
		
		
		
	}

}
