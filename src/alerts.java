import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		//to click on ok
		driver.switchTo().alert().accept();
		//to click on cancel
		driver.findElement(By.cssSelector("input[id='confirmbtn']")).click();
		//Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		//Thread.sleep(1000);

	}

}
