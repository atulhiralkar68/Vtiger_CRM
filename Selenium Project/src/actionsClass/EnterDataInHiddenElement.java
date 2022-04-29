package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDataInHiddenElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/signup");
		WebElement hiddenElement = driver.findElement(By.name("custom_gender"));
		JavascriptExecutor js=(JavascriptExecutor) driver;

		//js.executeScript("history.go(0);");
		//String title=(String) js.executeScript("return document.title");
		//System.out.println(title);
		js.executeScript("arguments[0].value='It is working';",hiddenElement );
		driver.findElement(By.xpath("//label[text()='Custom']/..//input[@type='radio']")).click();
		//driver.close();
	}
}
