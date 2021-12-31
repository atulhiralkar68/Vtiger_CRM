package navigationAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1{

	public static void main(String[] args) throws InterruptedException {
       //Upcasting 
		WebDriver driver=new ChromeDriver();
		//Maximize Window
		driver.manage().window().maximize();
		//Copy paste URL open application
		driver.get("https://www.skillrary.com/");
		Thread.sleep(3000);
		//navigate().to() to go other page
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(3000);
		//navigate back
		driver.navigate().back();
		//navigate forword
		Thread.sleep(3000);
		driver.navigate().forward();
		//navigate refresh
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		//Close window
		driver.close();
		
		
		
	}

}