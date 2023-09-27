import java.time.Duration;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= WebDriverManager.chromedriver().create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//name
		driver.findElement(By.name("name")).sendKeys("aditi");
		//email
		driver.findElement(By.cssSelector("input[name= 'email']")).sendKeys("aditi@gmail.com");
		//password
		driver.findElement(By.cssSelector("input[placeholder= 'Password\']")).sendKeys("aditi0101");
		//checkbox
		driver.findElement(By.id("exampleCheck1")).click();
		//dropdown
		Select gender=new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		gender.selectByVisibleText("Female");
		
		//radio button
		driver.findElement(By.id("inlineRadio2")).click();
		//date
		driver.findElement(By.name("bday")).sendKeys("08/31/2023");
		//submit
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(2000);
		//success message
		System.out.println(driver.findElement(By.className("alert-success")).getText());
		
		
		

	}

}
