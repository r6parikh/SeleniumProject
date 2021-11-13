package OrangeHRMTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import OrangeHRMPages.AddEmployeesPage;
import OrangeHRMPages.LoginPage;
import OrangeHRMPages.OrangeHRMpage;
import OrangeHRMPages.welcomePage;
import junit.framework.Assert;

public class orangeHRMPageTest {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ruchi\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@Test
	public void OrangeHRMLoginTest() throws InterruptedException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.loginPageAction();

		OrangeHRMpage orangeHRM = new OrangeHRMpage(driver);
		orangeHRM.clickOnAddEmployee();

		AddEmployeesPage addEmployee = new AddEmployeesPage(driver);
		addEmployee.addEmployeeDetails();

		welcomePage wc = new welcomePage(driver);
		wc.clickOnlogout();

		loginpage.newloginPageDetails();
		String name = wc.welcomeName();
		Assert.assertTrue(name.equalsIgnoreCase("qwe"));
		wc.clickOnlogout();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
