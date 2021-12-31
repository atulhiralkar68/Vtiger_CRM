package Pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptPopUp_AlertPopUp1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://www.marimallappawomenscollege.org/contactus.php?current=contactus");
		driver.findElement(By.name("Send")).click();
	    Alert alertPopUp1 = driver.switchTo().alert();
	    String alertMassage1 = alertPopUp1.getText();
	    System.out.println(alertMassage1);
	    Thread.sleep(2000);//To see the execution  we use thread.sleep
	    alertPopUp1.accept();	
        driver.quit();	
	}

}
