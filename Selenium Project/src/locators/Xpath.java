package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		//Upcasting
		WebDriver driver=new ChromeDriver();
		//Maximize
		driver.manage().window().fullscreen();
		//Forgot link test
		driver.findElement(By.xpath("//a[@id='toPasswordRecoveryPageLink']")).click();
		//

	}

}
