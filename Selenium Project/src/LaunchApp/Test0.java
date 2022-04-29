package LaunchApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/***
 * 
 * @author AtulHiralkar
 *
 */
public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		//Upcasting
		WebDriver driver = new ChromeDriver();
		//Enter the URL(Copy and Paste)
		driver.get("https://www.skillrary.com//");
		//Get the Title
		System.out.println(driver.getTitle());
		//Get the current URL
		System.out.println(driver.getCurrentUrl());
		//close the Application
		Thread.sleep(5000);
		driver.close();
	}
}
