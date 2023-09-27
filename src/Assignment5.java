import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver= WebDriverManager.chromedriver().create();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();
		//driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-left']")));
		//driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.id("content")).getText());

	}

}
