package redBus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookTicketOnRedbus {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/bus-tickets");
		driver.findElement(By.id("txtSource")).sendKeys("Bengaluru");
		driver.findElement(By.id("txtDestination")).sendKeys("Pune");
		
		System.out.println("Successfull");
		driver.close();
		
	}

}
