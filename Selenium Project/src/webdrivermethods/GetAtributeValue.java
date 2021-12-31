package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAtributeValue {

	public static void main(String[] args) {
		/*System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://crmaccess.vtiger.com/log-in/");
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("admin",Keys.ENTER);
		String atrivalue = driver.findElement(By.name("username")).getAttribute("placeholder");
		System.out.println(atrivalue);
	      String atriname = driver.findElement(By.name("password")).getAttribute("name");
	     System.out.println(atriname);
		*/
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).clear();
		//driver.findElement(By.id("username")).sendKeys("admin");
		String atrivalue = driver.findElement(By.id("username")).getAttribute("placeholder");
	    System.out.println(atrivalue);
	
		
	}

}
