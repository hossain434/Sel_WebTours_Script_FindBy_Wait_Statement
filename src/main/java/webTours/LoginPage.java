package webTours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	private  WebDriverWait wait;
	// Define User name Field
	@FindBy(how = How.NAME, using = "userName")
	private WebElement username;

	// Define Password Field
	@FindBy(how = How.NAME, using = "password")
	private WebElement password;

	// Define Login Button
	@FindBy(how = How.NAME, using = "login")
	private WebElement login;

	// Define logout Button
	@FindBy(how = How.CSS, using = "div>table>tbody>tr>td:nth-child(2)>table>tbody>tr:nth-child(2)>td>table>tbody>tr>td:nth-child(1)")
	private WebElement logout;
	// Define User name Enter Method
	public void EnterUserName(String usernametext) throws InterruptedException {
		this.username.sendKeys(usernametext);
		
	}

	// Define Password Enter Method
	public void EnterPassword(String passwordtext) throws InterruptedException{
		password.sendKeys(passwordtext);
		
	}
	
	   public LoginPage(final WebDriver driver) {
	        PageFactory.initElements(driver, this);
	        this.wait = new WebDriverWait(driver, 30);
	    }
	// Define Login Button Click Method
	public void ClickLoginButton() {
		wait.until(ExpectedConditions.elementToBeClickable(this.login));
		login.click();
	}

	// Define Login Button Click Method
	public void ClickLogoutButton() {
		logout.click();
	}

}