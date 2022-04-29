package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice001 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		driver.findElement(By.xpath("//button[text()='Accept All']")).click();
		driver.findElement(By.id("src")).sendKeys("Goa",Keys.ENTER);
		driver.findElement(By.id("dest")).sendKeys("Pune",Keys.ENTER);
		driver.close();
	}
}
