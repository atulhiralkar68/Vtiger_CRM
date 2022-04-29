package Calender_Pop_ups;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/***
 * 
 * @author AtulHiralkar
 *
 */
public class Departure_6_Month_Later {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

		LocalDateTime ldt = LocalDateTime.now().plusMonths(6);
		String monthName = ldt.getMonth().toString();
		monthName=monthName.substring(0, 3);
		String month = ""+monthName.substring(0,1).toUpperCase()+monthName.substring(1,3).toLowerCase();
		int date = ldt.getDayOfMonth();
		//Month month = ldt.getMonth();
		int year = ldt.getDayOfYear();

		//System.out.println("Todays Date : " + date +"-" + month + "-" + year );

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

		selectCalenderDate(driver,month,date,year);
		driver.quit();
	}

	public static  void selectCalenderDate(WebDriver driver,String month,int date, int year) {
		for(;;) {
			try{
				driver.findElement(By.xpath("//div[contains(@arial-label,'"+ month + "" + date + "" + year+"')]")).click();
				break;
			}catch(NoSuchElementException e){
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();

			}
		}
	}
}


