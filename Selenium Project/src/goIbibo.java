import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

public class goIbibo {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.goibibo.com/flights/");
		driver.findElement(By.xpath("//span[text()='Round-trip']")).click();
		driver.findElement(By.xpath("//span[text()='From']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Bengaluru (BLR)");
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mumbai (BOM)");
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//p[text()='25'])[2]")).click();
		driver.findElement(By.xpath("(//span[text()='Return'])[1]")).click();
		driver.findElement(By.xpath("(//p[text()='26'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		driver.findElement(By.xpath("(//span[@class='sc-faUpoM jSgnBw'])[2]")).click();
		WebElement addIcon = driver.findElement(By.xpath("(//span[@class='sc-faUpoM jSgnBw'])[4]"));
		Actions actions = new Actions(driver);
		actions.doubleClick(addIcon).perform();
		//driver.findElement(By.xpath("(//span[@class='sc-faUpoM jSgnBw'])[4]")).click();
		driver.findElement(By.xpath("(//span[@class='sc-faUpoM jSgnBw'])[6]")).click();
		driver.findElement(By.xpath("//li[text()='business']")).click();
		driver.findElement(By.linkText("Done")).click();
		driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();

		//List<WebElement> airIndiaFlights = driver.findElements(By.xpath("//span[text()='Flight Details']/../../../../..//span[text()='Air India']|//span[text()='Flight Details']/../../../../..//span[text()='Vistara']"));
		List<WebElement> vistaraFlights = driver.findElements(By.xpath("//span[text()='Flight Details']/../../../../..//div[@class='roundTripResultCardstyles__Width70-sc-j11urj-1 kIEbaT dF justifyBetween  alignItemsEnd width70']"));

		Thread.sleep(2000);
		int count = 0;
		for (WebElement webElement : vistaraFlights ) {
			String text = webElement.getText();
			count++;	
			System.out.println("Flight Details:- "+count+") "+text);
		}
		System.out.println(count+" Flights Available for your Search");
		driver.close();
	}
}
