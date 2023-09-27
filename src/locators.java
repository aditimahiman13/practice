import org.openqa.selenium.WebDriver;
import java.time.*;
import java.time.Duration;

import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {
//self
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=WebDriverManager.chromedriver().create();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     driver.get("https://www.rahulshettyacademy.com/locatorspractice");
	     //locator by 'id'
	     driver.findElement(By.id("inputUsername")).sendKeys("aditi");
	     //locator by 'name'
	     driver.findElement(By.name("inputPassword")).sendKeys("hello12345");
	     //locator by 'class'
	     //if space between class name then there are two class name for that attribute and the user has to select any one from it
	     driver.findElement(By.className("signInBtn")).click();
	     //locator by css selector
	     System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	     //locator by link text
	     driver.findElement(By.linkText("Forgot your password?")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Joe");
	     driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("joe@gmail.com");
	     driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9446828585");
	     driver.findElement(By.className("reset-pwd-btn")).click();
	     System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
	     
	     //driver.findElement(By.className("go-to-login-btn")).click();
	     driver.findElement(By.id("inputUsername")).sendKeys("aditi");
	     driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
	     //driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	     driver.findElement(By.id("chkboxOne")).click();
	     //driver.findElement(By.id("chkboxTwo")).click();
	     driver.findElement(By.className("submit")).click();
	     //System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	     

	}

}
