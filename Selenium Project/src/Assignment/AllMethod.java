package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
/***
 * 
 * @author Atul
 *
 */
public class AllMethod {

	public static void main(String[] args) throws InterruptedException {
		//Step 1: Launch the Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//Maximize Window
		driver.manage().window().maximize();
		//get method get that perticular page
		driver.get("https://www.skillrary.com/");
		//Thread for time to see .....
		Thread.sleep(2000);
	    //Minimize the Window
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		//get title of page
		System.out.println(driver.getTitle());
		//to get the Current page URL
		System.out.println(driver.getCurrentUrl());
		//to get the complet Source code of Entire page
		//System.out.println(driver.getPageSource());..............To SEE the output temperary comment it
		//to perform nevigate action we again get one new url
		driver.get("https://www.skillrary.com/category/analytics");
		//navigate back
		Thread.sleep(3000);
		driver.navigate().back();
		//navigate forrword
		Thread.sleep(3000);
		driver.navigate().forward();
		//navigate Refresh the page
		Thread.sleep(4000);
		driver.navigate().refresh();
		//directly jump to any page use navigateTo( ) method
		driver.navigate().to("https://www.facebook.com/");
		//driver.manage().window().fullscreen();
		
		Point position = driver.manage().window().getPosition();
	    System.out.println(position.x);
	    System.out.println(position.y);
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		//driver.manage().window().setSize(x=10,y=20);.............Not Working
		driver.switchTo().activeElement().sendKeys("Atul",Keys.BACK_SPACE,Keys.TAB);
		//Here it enter Atul And Delet 'l'.and  move curcer to next box using TAB key
		
		
		driver.switchTo().activeElement().sendKeys("Atul");
		Thread.sleep(3000);
		//driver.switchTo().window("https://www.skillrary.com/category/business");
		//Thread.sleep(2000);
		driver.close();
		
	}

}
