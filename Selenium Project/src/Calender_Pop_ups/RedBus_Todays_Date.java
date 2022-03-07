package Calender_Pop_ups;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import locators.Xpath;

public class RedBus_Todays_Date {

	private static final WebDriver driver = null;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		WebDriverWait wait=new WebDriverWait(driver, 10);
		LocalDateTime ldt = LocalDateTime.now().plusMonths(3);

		DayOfWeek dayOFWeek = ldt.getDayOfWeek();
		String day3 = dayOFWeek.toString();
		day3=day3.substring(0,3);
		String day4 = ""+day3.substring(0,1).toUpperCase()+day3.substring(1,3).toLowerCase();
		System.out.println(day4);

		String monthName = ldt.getMonth().toString();
		monthName = monthName.substring(0, 3);
		String month = ""+monthName.substring(0,1).toUpperCase()+monthName.substring(1,3).toLowerCase();
		System.out.println(month);

		int date = ldt.getDayOfMonth();
		System.out.println(date);

		int year = ldt.getYear();
		System.out.println(year);

		System.out.println("Todays Date : "+ day4 + "-" + date +"-" + month + "-" + year );

		driver.get("https://www.redbus.com/");
		driver.findElement(By.xpath("//button[text()='Accept All']")).click();
		//Actions action = new Actions(driver);
		//action.click().perform();

		//		WebElement popUp = driver.findElement(By.className("langCardClose"));
		//		wait.until(ExpectedConditions.visibilityOf(popUp));
		//	    popUp.click();
		//		 

		driver.findElement(By.id("src")).sendKeys("Goa",Keys.ENTER);
		driver.findElement(By.id("dest")).sendKeys("Pune",Keys.ENTER);
		driver.findElement(By.xpath("//label[text()='Onward Date']")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100);");
		selectCalenderDate(driver,day4 ,month,date,year);
		Actions action = new Actions(driver);
		action.click().perform();
		driver.quit();
	}


	public static  void selectCalenderDate(WebDriver driver,String day4 , String month,int date, int year) {
		for(;;) {
			try{
				Actions action = new Actions(driver);

				//WebElement todaysDate = 
				driver.findElement(By.xpath("//td[text()='"+ day4 + " "+date+" "+month+" "+year+"']")).click();
				action.click().perform();
				//todaysDate.sendKeys(Keys.ENTER);

				break;
			}catch(NoSuchElementException e){
				driver.findElement(By.xpath("//td[@class=\"next\"]")).click();
			}
		}
	}


}


