package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementUsing_Web_X_Y_HelthCart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.healthkart.com/reviews/muscleblaze-super-gainer-xxl-6-6-lb-mango-burst?storeVariantId=160271&productWise=true");
		//here we create object for action class to use action class methods 
		Actions actions = new Actions(driver);
		WebElement reletiveElement = driver.findElement(By.xpath("//ul[@class=\"rating-stars js-give-star\"]"));

		actions.moveToElement(reletiveElement, 100, 0).click().perform();//X AND Y POSITION FROM CENTER OF RELATIVE ELEMENT
	}
}
