package navigationAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
	   //Upcasting
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Copy paste URL
		driver.get("https://www.skillrary.com/");
		
		Thread.sleep(3000);
		//Navigate back
		driver.navigate().back();
		
		Thread.sleep(3000);
		//navigate forward
		driver.navigate().forward();
		
		Thread.sleep(3000);
		//driver refresh
		driver.navigate().refresh();
		
		//Close window
		driver.close();
		
		

	}

}
