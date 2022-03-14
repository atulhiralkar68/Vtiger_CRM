package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAtributeValue {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Rectangle size = driver.findElement(By.id("email")).getRect();
		int m=size.height;
		int n=size.width;
		System.out.println(m);
		System.out.println(n);
				
		Rectangle password = driver.findElement(By.id("pass")).getRect();
		int h =password.height;
		int g=password.width;
		System.out.println(h);
		System.out.println(g);
	}

}
