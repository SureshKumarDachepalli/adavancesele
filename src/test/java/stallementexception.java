import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class stallementexception {

	public static void main(String[] args) {
	WebDriver	driver=new FirefoxDriver();
	driver.get("https://www.google.com");//1010
	//click on  images link
 WebElement img=driver.findElement(By.xpath("//a[text()='Images']"));
	//refresh the page
 try {
	 driver.navigate().refresh();//2020
		img.click(); 
 }
 catch(StaleElementReferenceException r) {
	 System.out.println("stalelementreferenceexceotion");
	 
 }
	
	
	
	

	}

}
