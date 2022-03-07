package Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.id("login1")).sendKeys("sumanthelfbatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.xpath("//a[.='Write mail']")).click();
		
	
	    driver.findElement(By.id("TO_IDcmp2")).sendKeys("sumanthelfbatch@rediffmail.com",Keys.ENTER);
	    driver.findElement(By.xpath("//input[@class=\"rd_inp_sub rd_subject_datacmp2\"]")).sendKeys("Atul");
	   
	    WebElement frameElement = driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
	    driver.switchTo().frame(frameElement);
	    driver.findElement(By.xpath("//body[@contenteditable=\"true\"]")).sendKeys("Hi Its Working Thanks Regard Atul");
	    Thread.sleep(3000);//To see Execution We use Thread Here
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//a[text()='Send']")).click();
	    
        driver.findElement(By.linkText("Inbox")).click();
        driver.navigate().refresh();
        driver.navigate().refresh();
        driver.navigate().refresh();
        driver.navigate().refresh();
        driver.findElement(By.xpath("//span[@title='Atul']/..//cite[@style='cursor: pointer;']")).click();
        Thread.sleep(3000);//To see Execution We use Thread Here
	    driver.findElement(By.xpath("//span[text()='Spam']/..//span[text()='Delete']")).click();
	    Thread.sleep(3000);//To see Execution We use Thread Here
	    driver.findElement(By.id("jqi_state0_buttonOk")).click();
	    Thread.sleep(3000);//To see Execution We use Thread Here
	    driver.close();    
	}

}
