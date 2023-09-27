import java.time.Duration;
import org.testng.Assert;


import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		
		WebDriver driver=WebDriverManager.chromedriver().create();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(false)

	}

}
