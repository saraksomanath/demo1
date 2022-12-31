package Pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class TestUtility  {

	WebDriver driver;

	

	public static String runProperty(String key) throws IOException {

		Properties property = new Properties();

		File file = new File(
				"C:\\Users\\Somnath\\eclipse-workspace\\Demo1\\src\\test\\resources\\confing.properties");
		FileInputStream fis = new FileInputStream(file);
		property.load(fis);

		return property.getProperty(key);

	}
	
	
	public static void dropDown(WebElement element) {
		Select select=new Select(element);
		select.selectByIndex(0);
		
	}
}
