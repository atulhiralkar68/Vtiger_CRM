package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		// upcasting
		WebDriver driver = new ChromeDriver();
		//Maximize
	    driver.manage().window().maximize();
	    //copy paste url
	    driver.get("https://demo.actitime.com/login.do");
	   //username
	    driver.findElement(By.id("username")).sendKeys("admin");
	    Thread.sleep(3000);
	    //Password
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    Thread.sleep(3000);
	    //login
	   driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    Thread.sleep(10000);
	    //get title
	    String title = driver.getTitle();
	    System.out.println(title);
	    //get current URL
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    //Verify whether it display Home page or not
	    if(title.equals("actiTIME - Enter Time-Track"))
	    {
	    	System.out.println("Pass:Home Page is Display");
	    }
	    else
	    {
	    	System.out.println("Fail:Home page Not Display");
	    }
	    driver.close();
	}

}
