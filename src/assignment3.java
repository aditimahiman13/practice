import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assignment3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= WebDriverManager.chromedriver().create();
		
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("okayBtn")).click();
		Select type=new Select(driver.findElement(By.cssSelector("select[class='form-control']")));
		//driver.findElement(By.cssSelector("select[class='form-control']"));
		type.selectByVisibleText("Consultant");
		driver.findElement(By.name("terms")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("signInBtn"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='my-4']"))).click();
//		Thread.sleep(5000);
		
		System.out.println(	driver.findElement(By.xpath("//h1[@class='my-4']")).isDisplayed());
		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.id("signInBtn")).click();
		
		
	

	}

}
