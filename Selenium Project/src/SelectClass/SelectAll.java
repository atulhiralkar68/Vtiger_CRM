package SelectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAll {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		

		driver.get("file:///C:/Users/AtulHiralkar/OneDrive%20-%20Test%20Yantra%20Software%20Solutions%20India%20Pvt%20Ltd/Desktop/SelectClass.html");

		WebElement sizeDropDown =driver.findElement(By.id("m_m1")); 
		Select s = new Select(sizeDropDown);
		//Select Class All Method

		//1) isMultiple use to check Drop down is Single select or Multiselect return type Boolean
		boolean multiSelect = s.isMultiple();
		System.out.println(multiSelect);

		//2) getOption it will return All Items Available in the dropdown
		List<WebElement> allOption = s.getOptions();
		for (WebElement webElements : allOption) {
			String webElement = webElements.getText();
			System.out.println(webElement);
		}
		System.out.println("*************");

		//3)selectByIndex use to select the item using index value
		s.selectByIndex(2);
		s.selectByIndex(1);

		//4) getFirstSelectedOption is use to get first option which is first selected not according to index
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String item = firstSelectedOption.getText();
		System.out.println(item);
		System.out.println("****************");

		//5) allSelectedOptions is use to get all selected options 
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			String all = webElement.getText();
			System.out.println(all);
			System.out.println("########");
		}

		//6) selectByValue is use to select item in list by using value parameter from HTML code(value="4")
		s.selectByValue("4");//Orange is selected

		//7) selectVisisbleText use to select by visible text
		s.selectByVisibleText("Jackfruit");

		//8)deselectByValue use to deselect item in list by using value parameter from HTML code(value="4")
		s.deselectByValue("3");

		//9)deselectByIndex use to deselect the item using index value
		s.deselectByIndex(0);

		//10)deselectByVisibleText use to deselect using visible text
		s.deselectByVisibleText("Apple");

		//11)deselectAll use to deselect All
		s.deselectAll();

		// driver.close();

	}
}
