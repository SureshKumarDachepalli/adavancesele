import java.io.FileInputStream;
import java.util.Random;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import ddframework.contactsHide;

public class adsedemo {
	public static void main(String[] args) throws Throwable {
		//random class
	Random	ran=new Random();
int	r=ran.nextInt(100);

FileInputStream	fis=new FileInputStream(adsedemoHide.sts );
Workbook	wb=WorkbookFactory.create(fis);
 Sheet sh=wb.getSheet("Sheet1");
   String data=sh.getRow(0).getCell(0).getStringCellValue();
   System.out.println(data);
   
  WebDriver driver=new EdgeDriver();
  driver.get("http://localhost:8888/");
  //enter valid UN and PW
  driver.findElement(By.xpath("//input[@name='user_name'] ")).sendKeys("admin");
  driver.findElement(By.xpath("//input[@name='user_password'] ")).sendKeys("admin");
  //click login button
  driver.findElement(By.xpath("//input[@id='submitButton']")).click();
  //click on organization module
  driver.findElement(By.xpath("//a[.='Organizations']")).click();
  //click on organization look up image
  driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
  //fill the organization name
  driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(data+r);  //TCS
  //click on save button
  Thread.sleep(5000);
  driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
  //verification
  String expOrg="TCS";
  Thread.sleep(5000);
  String actOrg=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
  if(actOrg.contains(expOrg)) {
	  Thread.sleep(5000);
	  System.out.println("TC is pass");
  }
  else {
	  System.out.println("TC is fail");
	  
  }
  //logout from applications
  Thread.sleep(5000);
  WebElement target=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG'] "));
  Actions act=new Actions(driver);
  act.moveToElement(target).perform();
  Thread.sleep(5000);
  //click on sign out button
  driver.findElement(By.xpath("//a[.='Sign Out']")).click();
		
	}

}
