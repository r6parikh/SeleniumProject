package OrangeHRMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMpage {

	WebDriver driver;
	@FindBy(xpath = "//a[@id='menu_pim_viewPimModule']")
	WebElement PIM_buttonElement;

	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	WebElement addEmployee;

	public OrangeHRMpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnAddEmployee() {
		PIM_buttonElement.click();
		addEmployee.click();
	}
}
