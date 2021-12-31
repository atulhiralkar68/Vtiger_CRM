package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementUsingWebEle_X_Y_Cordinate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		driver.get("https://www.zomato.com/bangalore/hopshaus-indiranagar-bangalore");
		//here we create object for action class to use action class methods 
		Actions actions = new Actions(driver);
		WebElement reletiveElement = driver.findElement(By.xpath("//input[@placeholder='Bengaluru']"));
	
		actions.moveToElement(reletiveElement, 100, 0).click().perform();//X AND Y POSITION FROM CENTER OF RELATIVE ELEMENT
		
	}

}
