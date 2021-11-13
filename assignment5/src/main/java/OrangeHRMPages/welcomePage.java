package OrangeHRMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class welcomePage {
	WebDriver driver;
	@FindBy(xpath = "//a[@id='welcome']")
	WebElement welcome;

	@FindBy(xpath = "//div//ul//li//a[contains(text(),'Logout')]")
	WebElement Logout;

	public welcomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnlogout() throws InterruptedException {
		welcome.click();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(Logout));
		Logout.click();
	}

	public String welcomeName() {
		return welcome.getText();

	}
}
