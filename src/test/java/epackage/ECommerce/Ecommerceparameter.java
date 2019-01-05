package epackage.ECommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;



public class Ecommerceparameter {
	WebDriver driver;
  @Test
  public void f() 
  {
	  GuestCheckout ref =new GuestCheckout(driver);
		ref.gustcheck();
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest(String bro) {
		
		System.out.println("Before Test"+bro);
		if//Chrome
		(bro.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","Resource/chromedriver.exe");
			driver= new ChromeDriver();
			driver. manage(). window().maximize();
		}
		//else if (bro.equals("firefox")){
			//System.setProperty("webdriver.gecko.driver","Resource/geckodriver.exe");
			//driver = new FirefoxDriver();
			
		//}
		//else if (bro.equals("IE")){
			//System.setProperty("webdriver.ie.driver","Resource/IEDriverServer.exe");
			// driver = new InternetExplorerDriver();
			// driver. manage(). window().maximize();
		//}
		else
		{
			System.out.println("No Browser");
		}
		
		driver.get("https://shoppreview.steris.com/en/us");
		

	}

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
