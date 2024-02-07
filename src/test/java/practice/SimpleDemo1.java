package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleDemo1
{
	public static void main(String[] args) throws Throwable {
	WebDriver	driver=new FirefoxDriver();
	driver.get("http://localhost:8888/");
	//enter un
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	//enter pw
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	//click on login
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	//click on organization
	driver.findElement(By.xpath("//a[text()='Organizations']")).click();
	Thread.sleep(2000);
	//click on img
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	Thread.sleep(2000);
	//full fill organization name
	driver.findElement(By.xpath("//input[@class='detailedViewTextBox']")).sendKeys("zen");
	//click on save button
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	//organization text
	Thread.sleep(2000);
String	actOrg=driver.findElement(By.xpath("//span[text()='[ ACC41 ] zen -  Organization Information']")).getText();
System.out.println(actOrg);

if(actOrg.contains("zen")) {
	System.out.println("TC is pass");
}
else {
	System.out.println("TC is fail");
       }
	}

}
