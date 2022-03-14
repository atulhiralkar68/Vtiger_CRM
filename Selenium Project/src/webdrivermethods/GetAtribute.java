package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAtribute {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://crmaccess.vtiger.com/log-in/");
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("admin",Keys.ENTER);
		String atrivalue = driver.findElement(By.name("username")).getAttribute("placeholder");
		System.out.println(atrivalue);
	      String atriname = driver.findElement(By.name("password")).getAttribute("name");//ERROR
	     System.out.println(atriname);
		/*
		driver.findElement(By.name("username")).sendKeys("admin",Keys.CONTROL+"a");
	     driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("admin",Keys.CONTROL+"v");
		*/
	
	}

}
