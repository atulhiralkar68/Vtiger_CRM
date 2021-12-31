package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementCordinaOrOffset {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		driver.get("https://www.kalkifashion.com/");
		//here we create object for action class to use action class methods 
		Actions actions = new Actions(driver);
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		//Here we move the curser to the element By using Cordinate x and y
		actions.moveByOffset(692, 135).perform();
		//Here we use click method to click on perticular element pasing element as argument.
		actions.click(driver.findElement(By.linkText("Sherwanis"))).perform();//perform is cumpulsarry here 
		
	}

}
