import org.openqa.selenium.By;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment7 {

	public static void main(String[] args) {
	

		WebDriver driver= WebDriverManager.chromedriver().create();
		driver.get("http://qaclickacademy.com/practice.php");


		WebElement table=driver.findElement(By.id("product"));
		System.out.println(table.findElements(By.tagName("tr")).size());
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		List<WebElement> secondRowDetails=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(secondRowDetails.get(0).getText());
		System.out.println(secondRowDetails.get(1).getText());
		System.out.println(secondRowDetails.get(2).getText());
		
	}

}
