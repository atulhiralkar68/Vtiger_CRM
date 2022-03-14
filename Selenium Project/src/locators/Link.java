package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) {
     //upcasting
		WebDriver driver=new ChromeDriver();
		//Maximize
		driver.manage().window().maximize();
		//copy paste
		driver.get("https://demo.actitime.com/login.do");////ERROR
		//Forgot link test
		//driver.findElement(By.partialLinkText("Forgot your")).click();
		//driver.findElement(By.id("forgetPasswordEmailOrUsername")).sendKeys("admin");
		//driver.findElement(By.xpath("//div[text()='Request Login Info']")).click();
		//driver.findElement(By.id("toLoginPageLink")).click();
	}

}
