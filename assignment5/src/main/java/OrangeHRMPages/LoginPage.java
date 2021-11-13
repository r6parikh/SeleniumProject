package OrangeHRMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	@FindBy(xpath = "//input[@id='txtUsername']")
	WebElement userName;

	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement password;

	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement loginButton;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginPageAction() {
		userName.sendKeys("Admin");
		password.sendKeys("admin123");
		loginButton.click();
	}

	public void newloginPageDetails() {
		AddEmployeesPage addEmployeesPage = new AddEmployeesPage(driver);
		String UN = addEmployeesPage.randomUN;
		String PW = addEmployeesPage.randomPW;
		userName.sendKeys(UN);
		password.sendKeys(PW);
		loginButton.click();
	}
}
