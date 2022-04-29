package JMD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JMD {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.justdial.com/Buldhana/Suman-Flowers-and-Gift-Center-In-Front-Of-Zp-Boys-School-Near-Forest-Office-Khamgaon");
	    driver.getPageSource();
	}

}
