package Pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUp2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("file:///C:/Users/Desktop/PopUps/JSPromptPopUp.html");
	    Alert alertPopUp1 = driver.switchTo().alert();
	    String alertMassage1 = alertPopUp1.getText();
	    System.out.println(alertMassage1);
	    alertPopUp1.sendKeys("ELF29");
	    alertPopUp1.accept();

	}

}

