package Pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://www.licindia.in/home/policy-loan-options");
		driver.findElement(By.linkText("Pay through Customer Portal")).click();
		Alert confirmPopUp = driver.switchTo().alert();
		System.out.println(confirmPopUp.getText());
		//Cancel the request
		Thread.sleep(3000);//to see the execution we use thread
        confirmPopUp.dismiss();
        
        driver.findElement(By.linkText("Pay through Customer Portal")).click();
		Alert confirmPopUp1 = driver.switchTo().alert();
		System.out.println(confirmPopUp1.getText());
		//Move to another page
		Thread.sleep(3000);//to see the execution we use thread
        confirmPopUp1.accept();
        driver.close();
           
	}

}
