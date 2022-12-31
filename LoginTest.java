package Test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.TestUtility;
import Pages.UserCreation;

public class LoginTest {

	public WebDriver driver;
	LoginPage loginPage;
	UserCreation userCreation;

	@BeforeMethod
	public void launchBrowser() throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Somnath\\eclipse-workspace\\DemoProject\\src\\test\\resources\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(TestUtility.runProperty("url"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void login() {
		loginPage = new LoginPage(driver);

		loginPage.loginTest();

	}

	@Test
	public void userCreation() throws InterruptedException {
		loginPage = new LoginPage(driver);
		loginPage.loginTest();
		
		Thread.sleep(2000);
		
		userCreation =new UserCreation(driver);
		
		
		userCreation.setHumancapital();
		Actions action =new Actions(driver);
		
		action.moveToElement(userCreation.getHumancapital()).build().perform();
		
		
		userCreation.setUserLink();
		userCreation.getUserLink().click();
		
		userCreation.setNewbutton();
		userCreation.getNewbutton().click();
		
		userCreation.setFirstName();
		userCreation.getFirstName().sendKeys("abasaheb");
		
		userCreation.setLastName();
		userCreation.getLastName().sendKeys("darade");
		
		userCreation.setEmail();
		userCreation.getEmail().sendKeys("abc@gmail.com");
		
		
		userCreation.setBranch();
		userCreation.setDepartment();
		userCreation.setDesignation();
		userCreation.setDivision();
		userCreation.setSubsidiary();
		
		TestUtility.dropDown(userCreation.getBranch());
		TestUtility.dropDown(userCreation.getDepartment());
		TestUtility.dropDown(userCreation.getDesignation());
		TestUtility.dropDown(userCreation.getDivision());
		TestUtility.dropDown(userCreation.getSubsidiary());
		
		
		userCreation.setPassword();
		userCreation.getPassword().sendKeys("Abasaheb@1234");
		
		userCreation.setConfirmpassword();
		userCreation.getConfirmpassword().sendKeys("Abasaheb@1234");
		

		userCreation.setNext();
		userCreation.getNext().click();

		userCreation.setNextcontactInfo();
		userCreation.getNextcontactInfo().click();
		
		userCreation.setAuditorCheck();
		userCreation.getAuditorCheck().click();
		
		userCreation.setNextRole();
		userCreation.getNextRole().click();
		
		userCreation.setSave();
		userCreation.getSave().click();
		
		
		
		
	}
	
	@AfterMethod
	public void tearDown() {

		//driver.close();
	}
}
