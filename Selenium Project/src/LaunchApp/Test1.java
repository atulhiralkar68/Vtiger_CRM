package LaunchApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		//Upcasting
		WebDriver driver=new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Enter URL
		driver.get("https://www.skillrary.com/");
		

	}

}
