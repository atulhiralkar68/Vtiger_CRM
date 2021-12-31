package Assignment2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/***
 * 
 * @author Atul
 *
 */
public class GetNormalTextOfElement {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		        //Step 1: Open the Browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				System.out.println("Chrome Driver Launch Successfully");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//Step 2: Enter valid URL
				driver.get("https://www.facebook.com/");	
				System.out.println("Login page Display succesfully");
				
				//Step 3:Search Element to get LinkText
			   WebElement webelement = driver.findElement(By.xpath("//button[text()='Log In']"));
			   System.out.println(webelement.getText());
			   System.out.println("succesfully get the Normal Text");
				
				//Close the Window
				driver.close();

	}

}
