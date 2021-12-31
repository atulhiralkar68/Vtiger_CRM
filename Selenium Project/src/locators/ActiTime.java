package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//Also we can use Fullscreen
		driver.get("https://demo.actitime.com/login.do");
		WebElement con = driver.findElement(By.id("username"));
		con.sendKeys("admin",Keys.CONTROL+"a");
		con.sendKeys("admin",Keys.CONTROL+"c");
		driver.findElement(By.name("pwd")).sendKeys("admin",Keys.CONTROL+"v");
		driver.findElement(By.id("loginButton")).click();
		
		
		
		
		/*driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin");
		*/
		
		
		

	}

}
