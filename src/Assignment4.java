import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {

	public static void main(String[] args) throws Exception {
     WebDriver driver= WebDriverManager.chromedriver().create();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String>it = windows.iterator();
		
		String parentId = it.next();
		driver.switchTo().window(it.next());
		//String childId = it.next();
		//driver.switchTo().window(it.next());
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		driver.switchTo().window(parentId);
		
		 System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());

	
	}

}
