package Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * 
 * @author Atul
 * 
 *
 */
public class Instagram_Login_001 {
	public static void main(String[] args) {
		//Step 1: Open the Browser
		System.getProperty("wedriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Chrome Driver Launch Successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		//Ste[p 2: Enter the valid  URL
		driver.get("https://www.instagram.com/");
		String expectedLoginPageTitle="Instagram";
		String  actualLoginPageTitle=driver.getTitle();
		if(expectedLoginPageTitle.equals(actualLoginPageTitle)) {
			System.out.println("Pass:Login Page display Successfully");
		}else {
			System.out.println("Fail:Login Page not display Successfully");
		}
		
		//Step 3:Enter Valid Credential
		String expectedUserData="admin";
		WebElement usernameTextField = driver.findElement(By.name("username"));
		usernameTextField.clear();
		usernameTextField.sendKeys(expectedUserData);
		String actualUsernameData=usernameTextField.getAttribute("value");
		if (expectedUserData.equals(actualUsernameData)) {
			System.out.println("Pass:Username is Entered Correctly");
		}else {
			System.out.println("Fail:Username is not Entered Correctly");
		}
		
		String expectedPaswordData="manager";
		WebElement passwordTextField = driver.findElement(By.name("password"));
		passwordTextField.clear();
		passwordTextField.sendKeys(expectedPaswordData);
		String actualPasswordData=passwordTextField.getAttribute("value");
		if (expectedPaswordData.equals(actualPasswordData)) {
			System.out.println("Pass:password is Entered Correctly");
		}else {
			System.err.println("Fail:password is not Entered Correctly");
		}
		
		//Step :4 Click on login button
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		String expectedHomePageTitle="Instagram";
	     String actualHomePageTitle=driver.getTitle();
	     if(expectedHomePageTitle.equals(actualHomePageTitle)) {
	    	 System.out.println("Pass:Home page is Display successfully");
	     }else {
	    	 System.err.println("Fail:Home page is not Display successfully");
	     }
	     
	}

}
