package Vtiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_04 {

	public static void main(String[] args) {
		       //Step 1: Launch the Browser
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			    
				//Step 2: Enter Valid URL
				String actualUrl = "http://localhost:8888/index.php?action=index&module=Home";
				driver.get("http://localhost:8888/index.php?action=index&module=Home");
				if (actualUrl.equals(driver.getCurrentUrl())) {
					System.out.println("Pass: URL is correct");
				}else {
					System.err.println("Fail:URL is not correct");
				}
				
				//Step 3: Enter Valid Username
				String actualUsername="admin";
				WebElement userName = driver.findElement(By.name("user_name"));
				userName.clear();
				userName.sendKeys("admin");
				String expectedName=userName.getAttribute("value");
				if(actualUsername.equals(expectedName)) {
					System.out.println("Pass: Username is correct");
				}else {
					System.err.println("Fail: Username is not correct");
				}
				
				//Step 4: Enter Valid Password
				String actualPassword="root";
				WebElement password = driver.findElement(By.name("user_password"));
				password.clear();
				password.sendKeys("root");
				String expectedPassword = password.getAttribute("value");
				if(actualPassword.equals(expectedPassword)) {
					System.out.println("Pass: Password is Correct");
				}else {
					System.err.println("Fail: Password is not Correct");
				}
				
				//Step 5:Click on Login Button
				String actualLoginBtnText="Login";
				WebElement loginBtn = driver.findElement(By.id("submitButton"));
				String expectedLoginBtnText=loginBtn.getAttribute("value");
				loginBtn.click();
				if(actualLoginBtnText.equalsIgnoreCase(expectedLoginBtnText)) {
					System.out.println("Pass: Home Page Display Succesfully");
				}else {
					System.out.println("Fail: Home Page not Display");
				}
				
				//Step 6: Click On Product Link
				String actualLinkText="Products";
				WebElement productLink = driver.findElement(By.linkText("Products"));
				String expectedProductLinkText=	productLink.getText();
				productLink.click();
				if(actualLinkText.equals(expectedProductLinkText)) {
					System.out.println("Pass: Succesfully click on product Link");
				}else {
					System.err.println("Fail: Not click on product Link");
				}
				
				//Step 7: Create New Product
				String actualAttribute="Create Product...";
				WebElement newProduct = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
				newProduct.click();
				
				//Step 8:Product name text field
			    WebElement product = driver.findElement(By.name("productname"));
			    product.sendKeys("Laptop");
			    driver.findElement(By.name("discontinued")).click();
			    driver.findElement(By.name("button")).click();
				
				//Step 9:Verification 
				String Expected = "no ";
				WebElement activeCheckBox = driver.findElement(By.xpath("//span[@id='dtlview_Product Active']"));
				String Output = activeCheckBox.getText();
				System.out.println(Output);
				if(Expected.equalsIgnoreCase(Output)) {
					System.out.println("Check box not Active");
				}else {
					System.out.println("Check box is Active");
				}
				
				//Step 10: Logout
				driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
			    driver.findElement(By.linkText("Sign Out")).click();
			    driver.close();
			
				}

}
