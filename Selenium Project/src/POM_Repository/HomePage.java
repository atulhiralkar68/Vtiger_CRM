package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
 
	@FindBy(linkText = "Products")
	private WebElement productLink;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement newProduct;
	
	@FindBy(name = "productname")
	private WebElement productName;
	
	@FindBy(name = "button")
	private WebElement button;
	
	@FindBy(id = "mouseArea_Product Name")
	private WebElement verifiedProductName;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement userImage;
	
	@FindBy(linkText = "Sign Out")
	private WebElement logoutLink;

	public WebElement getProductLink() {
		return productLink;
	}

	public WebElement getNewProduct() {
		return newProduct;
	}

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getVerifiedProductName() {
		return verifiedProductName;
	}

	public WebElement getUserImage() {
		return userImage;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
}
