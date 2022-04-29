package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContexClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.redbus.com/");
		//here we create object for action class to use action class methods 
		Actions actions = new Actions(driver);

		//WebElement reletiveElement = driver.findElement(By.xpath("//input[@placeholder='Bengaluru']"));
		actions.contextClick().perform();
		driver.close();
	}

}
