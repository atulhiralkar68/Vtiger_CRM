package relienceDigital;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.reliancedigital.in/");
		driver.findElement(By.xpath("//Button[text()='Yes, Notify me']")).click();

		Actions action = new Actions(driver);
		WebElement mobile = driver.findElement(By.xpath("//div[text()='MOBILES & TABLETS']"));
		action.moveToElement(mobile).perform();
		driver.findElement(By.xpath("//div[text()='MOBILES & TABLETS']")).click();
		driver.findElement(By.xpath("//a[text()='Apple New Launch']")).click();
		driver.findElement(By.xpath("//p[text()='Apple iPhone SE 2022 64 GB, (Product) Red']")).click();

		//		driver.findElement(By.id("suggestionBoxEle")).sendKeys("Fan",Keys.ENTER);
		//		driver.findElement(By.xpath("//p[contains(text(),'Havells 1200 mm Pacer Ceiling Fan, White')]")).click();

		WebDriverWait wait=new WebDriverWait(driver, 10);

		for(String windowHandle : driver.getWindowHandles()) {
			driver.switchTo().window(windowHandle);
		}
		driver.findElement(By.id("RIL_PDPInputPincode")).sendKeys("411044",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='ADD TO CART']")).click();
		driver.findElement(By.id("btn-goto-checkout")).click();
		driver.findElement(By.xpath("//img[@src='/build/client/images/icon-google.png']")).click();		
	}

}
