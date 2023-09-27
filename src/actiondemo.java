

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actiondemo {

	public static void main(String[] args) {
		
		 WebDriver driver=WebDriverManager.chromedriver().create();
		 driver.get("https://www.amazon.in/");
		 Actions a=new Actions(driver);
		 a.moveToElement(driver.findElement(By.cssSelector("a[nav-link-accountList]"))).build().perform();
		

	}

}
