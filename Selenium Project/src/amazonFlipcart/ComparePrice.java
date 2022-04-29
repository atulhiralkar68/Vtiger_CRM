package amazonFlipcart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ComparePrice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(" Apple iPhone 13 (128GB) - Starlight ",Keys.ENTER);        
		String amazonPrice = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Starlight']/../../../..//span[@class='a-price-whole']")).getText();
		System.out.println("Amazon Price ₹"+amazonPrice);

		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Apple iPhone 13 (128GB) - Starlight ",Keys.ENTER);
		Thread.sleep(2000);
		String flipcartPrice = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Starlight, 128 GB)']/../..//div[text()='₹75,900']")).getText();	
		System.out.println("Flipcart Price "+flipcartPrice);

		int fPrice = Integer.parseInt(flipcartPrice.replaceAll("[^0-9]", ""));

		int aPrice = Integer.parseInt(amazonPrice.replaceAll("[^0-9]", ""));

		if (fPrice>aPrice) {
			System.out.println("Amazon has Lowest Price");			
		}else
			System.out.println("Flipcart has Lowest Price");

		driver.close();
	}
}
