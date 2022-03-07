3package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_Repository.HomePage;
import POM_Repository.LoginPage;

public class Tc_Login_001 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		        //Step 1: Launch the Browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.get("http://localhost:8888");
				
				LoginPage loginPage = new LoginPage(driver);
				loginPage.getUserNameTextField().clear();
				loginPage.getUserNameTextField().sendKeys("admin");
				loginPage.getPasswordTextField1().clear();
				loginPage.getPasswordTextField1().sendKeys("root");
				loginPage.getLoginButton().click();
				
				HomePage HomePage=new HomePage(driver);
				HomePage.getProductLink().click();
				HomePage.getNewProduct().click();
				HomePage.getProductName().sendKeys("Laptop");
				HomePage.getButton().click();
				HomePage.getVerifiedProductName().getText();
			    HomePage.getUserImage().click();
			    HomePage.getLogoutLink().click();
			  
			    
			    
	}

}
