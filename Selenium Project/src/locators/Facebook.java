package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		//Upcasting
	    WebDriver driver = new ChromeDriver();
	    //Maximize
	    driver.manage().window().maximize();
	    //Copy paste
	    driver.get("https://www.facebook.com/");
	    //Find element
	    driver.findElement(By.id("email")).sendKeys("Abhishek");
	    //Find element
	    driver.findElement(By.name("pass")).sendKeys("abhi");
	    // login
	    driver.findElement(By.name("login")).click();
	    driver.findElement(By.linkText("Forgotten password?")).click();
	    driver.findElement(By.partialLinkText("Return to login page")).click();
	    driver.close();
	   
	}

}
