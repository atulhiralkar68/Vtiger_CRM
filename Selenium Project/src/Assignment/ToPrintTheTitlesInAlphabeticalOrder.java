package Assignment;

import java.util.Set;

import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * 
 * @author AtulHiralkar
 *
 */
public class ToPrintTheTitlesInAlphabeticalOrder {

	public static void main(String[] args) {
		//Step 1: Open the Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");
		Set<String> allWindowId = driver.getWindowHandles();
		Set<String> titles = new TreeSet<>();

		for(String windowId : allWindowId) {
			driver.switchTo().window(windowId);
			String title =driver.getTitle();
			titles.add(title);

		}

		for(String pageTitle:titles) {
			System.out.println(pageTitle);
		}
		driver.quit();
	}/*OUTPUT
Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com
Sopra
Tech Mahindra
	 */

}
