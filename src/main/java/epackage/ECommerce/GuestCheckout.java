package epackage.ECommerce;

import org.apache.http.entity.ByteArrayEntity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GuestCheckout {
	WebDriver driver;
public GuestCheckout(WebDriver driver2)
{
		
		driver=driver2;
}
public void gustcheck() {
	
	
	WebElement ele=driver.findElement(By.xpath("//*[@id='departmentsMenu']/li[1]/span"));
	
	Actions act= new Actions(driver);
	act.moveToElement(ele).build().perform();

	
}
}