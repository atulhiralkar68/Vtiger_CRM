package iccCricket;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCountry {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		List<WebElement> parameters = driver.findElements(By.xpath("//td[@class='rankings-block__banner--rating u-text-right']/..//td"));

		int counts=0;
		for (WebElement webElement : parameters) {

			String rating = webElement.getText();
			counts++;
			if (counts>=2) {
				if (counts==2) {
					System.out.println("Country Name : "+rating);
				}
				if(counts==3) {
					System.out.println("Total Matches : "+rating);
				}
				if(counts==4) {
					System.out.println("Team Points : "+rating);
				}
				if(counts==5) {
					System.out.println("Team Rating : "+rating);
				}

			}

		}

		System.out.println("******************************************************");

		List<WebElement> parameter = driver.findElements(By.xpath("//span[text()='India']/../..//td"));

		int count = 0;		
		for (WebElement webElement1 : parameter) {
			String rating1 = webElement1.getText();
			count++;
			if (count>=2) {
				if (count==2) {
					System.out.println("Country Name : "+rating1);
				}
				if(count==3) {
					System.out.println("Total Matches : "+rating1);
				}
				if(count==4) {
					System.out.println("Team Points : "+rating1);
				}
				if(count==5) {
					System.out.println("Team Rating : "+rating1);
				}
			}
		}
		driver.close();
	}
}
