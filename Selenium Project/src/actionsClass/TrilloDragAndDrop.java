package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TrilloDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		driver.get("https://trello.com/atulhiralkar/boards");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("user")).sendKeys("atulhiralkar68@gmail.com");
		Thread.sleep(3000);
		
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("Atul@1234");
		driver.findElement(By.id("login-submit")).click();
		
		driver.findElement(By.xpath("//div[text()='Test Yantra']")).click();
		
		
		
		Actions action=new Actions(driver);
		WebElement source= driver.findElement(By.xpath("//h2[text()='To Do']/../..//span[text()='Action class']"));
		WebElement destination = driver.findElement(By.xpath("//textarea[text()='Doing']"));
		
		//Using DragAndDrop
		action.dragAndDrop(source, destination).perform();
		
	}
}