package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage  {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	WebElement email;
	WebElement password;
	WebElement remember;
	WebElement submitButton;

	public WebElement getUserName() {
		return email;
	}

	public void setUserName() {
		email = driver.findElement(By.xpath("//input[@type='text']"));
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword() {
		password = driver.findElement(By.xpath("//input[@type='password']"));
		
	}

	public WebElement rememberCheckBox1() {
		return remember;
	}

	public void rememberCheckBox() {
		remember = driver.findElement(By.xpath("//label[contains(text(),'Remember Me')]"));
	}
	
	public WebElement getSubmitButton() {
		return submitButton;
	}

	public void setSubmitButton() {
		submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
	}

	public  void loginTest() {
		setUserName();
		getUserName().sendKeys("excelledia@isorobot.io");

		setPassword();
		getPassword().sendKeys("User@1234");

		setSubmitButton();
		getSubmitButton().click();
	}

}
