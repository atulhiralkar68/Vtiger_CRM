package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utube {

	public static void main(String[] args) throws InterruptedException {
		// upcasting
		WebDriver driver= new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//copy paste 
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("video");
	

	}

}
