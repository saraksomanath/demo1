package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Somnath
 *
 */
public class UserCreation  {
	
	WebDriver driver;
	public UserCreation(WebDriver driver) {
		this.driver = driver;
	}

	WebElement Humancapital;
	WebElement userLink;
	WebElement newbutton;
	
	WebElement firstName;
	WebElement lastName;
	WebElement Email;
	
	WebElement Subsidiary;
	WebElement Branch;
	WebElement Division;
	WebElement Department;
	WebElement Designation;

	WebElement Password;
	WebElement Confirmpassword;
	WebElement check;
	WebElement next;
	
	WebElement nextcontactInfo;
	WebElement nextRole;
	WebElement AuditorCheck;
	WebElement save;
	
	public WebElement getHumancapital() {
		return Humancapital;
	}

	public void setHumancapital() {
		Humancapital = driver.findElement(By.xpath("//span[contains(text(),'Human Capital')]"));
		
	}

	public WebElement getUserLink() {
		return userLink;
	}

	public void setUserLink() {
		userLink = driver.findElement(By.xpath("//span[contains(text(),'Users')]"));
	}

	public WebElement getNewbutton() {
		return newbutton;
	}

	public void setNewbutton() {
		newbutton =driver.findElement(By.xpath("//a[@id='new_modal']"));
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName() {
		firstName = driver.findElement(By.xpath("//input[@formcontrolname='first_name']"));
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName() {
		lastName =driver.findElement(By.xpath("//input[@formcontrolname='last_name']"));
	}

	public WebElement getEmail() {
		return Email;
	}

	public void setEmail() {
		Email = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
	}

	public WebElement getSubsidiary() {
		return Subsidiary;
	}

	public void setSubsidiary() {
		Subsidiary =driver.findElement(By.xpath("/html/body/app-root/app-app-layout/div[1]/app-human-capital-users-page/app-add-user/main/div/div/div[1]/form/div[2]/div[2]/div[6]/div/div/div/ng-select/div/div/div[2]/input"));
	}

	public WebElement getDivision() {
		return Division;
	}

	public void setDivision() {
		Division = driver.findElement(By.xpath("/html/body/app-root/app-app-layout/div[1]/app-human-capital-users-page/app-add-user/main/div/div/div[1]/form/div[2]/div[2]/div[8]/div/div/div/ng-select/div/div/div[2]/input"));
	}

	public WebElement getDepartment() {
		return Department;
	}

	public void setDepartment() {
		Department =driver.findElement(By.xpath("/html/body/app-root/app-app-layout/div[1]/app-human-capital-users-page/app-add-user/main/div/div/div[1]/form/div[2]/div[2]/div[12]/div/div/div/ng-select/div/div/div[2]/input"));
	}

	public WebElement getDesignation() {
		return Designation;
	}

	public void setDesignation() {
		Designation = driver.findElement(By.xpath("/html/body/app-root/app-app-layout/div[1]/app-human-capital-users-page/app-add-user/main/div/div/div[1]/form/div[2]/div[2]/div[12]/div/div/div/ng-select/div/div/div[2]/input"));
	}

	public WebElement getBranch() {
		return Branch;
	}

	public void setBranch() {
		Branch = driver.findElement(By.xpath("/html/body/app-root/app-app-layout/div[1]/app-human-capital-users-page/app-add-user/main/div/div/div[1]/form/div[2]/div[2]/div[7]/div/div/div/ng-select/div/div/div[2]/input"));
	}

	public WebElement getPassword() {
		return Password;
	}

	public void setPassword() {
		Password =driver.findElement(By.xpath("//input[@formcontrolname='password']"));
	}

	public WebElement getConfirmpassword() {
		return Confirmpassword;
	}

	public void setConfirmpassword() {
		Confirmpassword = driver.findElement(By.xpath("//input[@formcontrolname='password_confirm']"));
	}

	public WebElement getCheck() {
		return check;
	}

	public void setCheck() {
	  check = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-app-layout[1]/div[1]/app-human-capital-users-page[1]/app-add-user[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/div[1]/div[2]/label[1]"));
	}

	public WebElement getNext() {
		return next;
	}

	public void setNext() {
		next =driver.findElement(By.xpath("//button[@id='nextBtn']"));
	}

	public WebElement getNextcontactInfo() {
		return nextcontactInfo;
	}

	public void setNextcontactInfo() {
		nextcontactInfo = driver.findElement(By.xpath("//button[@id='nextBtn']"));
	}

	public WebElement getNextRole() {
		return nextRole;
	}

	public void setNextRole() {
		nextRole =driver.findElement(By.xpath("//button[@id='nextBtn']"));
	}

	public WebElement getAuditorCheck() {
		return AuditorCheck;
	}

	public void setAuditorCheck() {
		AuditorCheck = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-app-layout[1]/div[1]/app-human-capital-users-page[1]/app-add-user[1]/main[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[7]/div[1]/div[2]/label[1]/span[1]"));
	}

	public WebElement getSave() {
		return save;
	}

	public void setSave() {
		save = driver.findElement(By.xpath("//button[@id='nextBtn']"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
