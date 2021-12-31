package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		//upcasting
		WebDriver driver = new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//copy paste
		driver.get("https://www.facebook.com/");
		//css Selector locator
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("atul");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("123w");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
