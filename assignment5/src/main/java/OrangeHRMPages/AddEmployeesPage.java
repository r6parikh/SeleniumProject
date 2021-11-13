package OrangeHRMPages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeesPage {

	WebDriver driver;
	String randomUN = RandomStringUtils.randomAlphabetic(10);
	String randomPW = RandomStringUtils.randomAlphanumeric(12);

	@FindBy(xpath = "//input[@id='firstName']")
	WebElement firstName;

	@FindBy(xpath = "//input[@id='lastName']")
	WebElement lastName;

	@FindBy(xpath = "//input[@id='employeeId']")
	WebElement employeeId;

	@FindBy(xpath = "//input[@id='chkLogin']")
	WebElement chkLogin;

	@FindBy(xpath = "//input[@id='user_name']")
	WebElement user_name;

	@FindBy(xpath = "//input[@id='user_password']")
	WebElement user_password;

	@FindBy(xpath = "//input[@id='re_password']")
	WebElement re_password;

	@FindBy(xpath = "//input[@id='btnSave']")
	WebElement btnSave;

	public AddEmployeesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void addEmployeeDetails() {
		firstName.sendKeys("Ruchi");
		lastName.sendKeys("Parikh");
		employeeId.clear();
		String randomID = RandomStringUtils.randomAlphanumeric(4);
		employeeId.sendKeys(randomID);
		chkLogin.click();

		user_name.sendKeys(randomUN);
		user_password.sendKeys(randomPW);
		re_password.sendKeys(randomPW);
		btnSave.click();

	}

}
