package tataPlay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class automateprecondiction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
		 options.addArguments("--start-maximized ");
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://www.urbanladder.com/");

	}

}
