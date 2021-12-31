package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompatibilityCheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement usertextfield = driver.findElement(By.id("username"));///ERROR
		WebElement passwordtextfield = driver.findElement(By.name("pwd"));
		Rectangle rectareaofusernameTF = usertextfield.getRect();
		Rectangle rectareaofpassTF = passwordtextfield.getRect();
		if(usertextfield.getLocation().getX()==passwordtextfield.getLocation().getX()) {
	    System.out.println("It is Properly allign to left");
		}
		else
		{
			System.out.println("It is not Properly allign to left");
		}
		
	}

}