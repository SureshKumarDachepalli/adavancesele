package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactPage1
{
	public static void main(String[] args)
	{
	WebDriver	driver=new FirefoxDriver();
	driver.get("http://www.localhost:8888/");
	//enter un
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		//enter pw
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		//click on login
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		//click on contacts
driver.findElement(By.xpath("//a[text()='Contacts']")).click();
//click on img
driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
//enter last name
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("zen");
//click on save button 
driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

	}

}
