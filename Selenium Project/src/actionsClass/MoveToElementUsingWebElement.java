package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementUsingWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		driver.get("https://www.kalkifashion.com/");
		
		//here we create object for action class to use action class methods 
		Actions actions = new Actions(driver);
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();//For PopUp
		WebElement targetElement1 = driver.findElement(By.linkText("MEN"));//Find And Store Then use
		//Here we use  "moveToElement()" method to move the curser to target element
		actions.moveToElement(targetElement1).perform();
	    driver.findElement(By.linkText("Sherwanis")).click();
	}

}
