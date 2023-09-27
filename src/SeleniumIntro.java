import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class SeleniumIntro {

	public static void main(String[] args) {
		// To run on Chrome
	     WebDriver driver=WebDriverManager.chromedriver().create();
	     driver.get("https://www.rahulshettyacademy.com");
	     
	     //title of webpage
	     System.out.println(driver.getTitle());
	     
	     //url of webpage
	     System.out.println(driver.getCurrentUrl());
	     
	     //close current tab-->driver.close();
	     //close window(when multiple tabs are opened)--->driver.close();
	     
	    //To run on Firefox--> gecko driver
	    //To run on MS edge--> Edge driver
	    
	 
	     
	}

}
