package Calender_Pop_ups;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select_Todays_Date {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		LocalDateTime ldt = LocalDateTime.now();
		int date = ldt.getDayOfMonth();
		Month month = ldt.getMonth();
		int year = ldt.getDayOfYear();
		
		System.out.println("Todays Date : " + date +"-" + month + "-" + year );
		
		driver.get("https://www.makemytrip.com/");
		Actions action = new Actions(driver);
		action.click().perform();
		driver.findElement(By.className("langCardClose")).click();
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		 WebElement departureDate = driver.findElement(By.xpath("//div[@class='dateFiled']"));
		String todaysDepartureDate = departureDate.getText();
		System.out.println(todaysDepartureDate);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100);");
		
		//selectcalenderdate(driver,month,date,year);
		
	}

}
