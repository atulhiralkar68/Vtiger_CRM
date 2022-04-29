package urbunLadder;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UrbanLadderTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.urbanladder.com/");
		driver.findElement(By.xpath("(//span[contains(text(),'Living')])[2]")).click();
		Thread.sleep(2000);
		List<WebElement> chairs = driver.findElements(By.xpath("//a[text()='Chairs']/../..//li"));

		System.out.println("****Chairs Available in List****");
		int i = 1;
		for (WebElement webElement : chairs) {
			String chair = webElement.getText();
			System.out.println(i+"."+chair);	
			i++;
		}

		driver.findElement(By.xpath("(//span[contains(text(),'Decor')])[4]")).click();
		Thread.sleep(2000); 
		List<WebElement> coversandThrows = driver.findElements(By.xpath("//a[text()='Cushions & Throws']/../..//li"));

		System.out.println("****Covers And Throws Available in List****");
		int j = 1;
		for (WebElement webElement : coversandThrows) {
			String cover = webElement.getText();	
			System.out.println(j+"."+cover);	
			j++;
		}
		driver.close();
	}
}
