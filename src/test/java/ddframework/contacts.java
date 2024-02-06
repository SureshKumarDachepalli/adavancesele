package ddframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class contacts {


	public static void main(String[] args) throws Throwable {
		FileInputStream	fis=new FileInputStream(contactsHide.sts2);//hard code-->hiding the path security purpose
		Workbook	wb=WorkbookFactory.create(fis);
		 Sheet sh=wb.getSheet("Sheet1");
		   String data2=sh.getRow(0).getCell(0).getStringCellValue();
		   System.out.println(data2);
		   
		   WebDriver driver=new EdgeDriver();
		   driver.get("http://localhost:8888/");
		   //enter valid UN and PW
		   driver.findElement(By.xpath("//input[@name='user_name'] ")).sendKeys("admin");
		   driver.findElement(By.xpath("//input[@name='user_password'] ")).sendKeys("admin");
		   //click login button
		   driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		   
		//click on contacts
		driver.findElement(By.xpath("//a[.='Contacts']")).click();
		//click on create contact image(plus symbol)
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif'] ")).click();
		//fill the employee name
				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("mr.suresh");
		//fill the organization name image
		driver.findElement(By.xpath(" //img[@src='themes/softed/images/select.gif']")).click();
		//fill the search
		driver.findElement(By.xpath("//input[@id='search_txt']")).sendKeys("TCS15");
		//click on search button
		driver.findElement(By.xpath("//input[@type='button']")).click();
		//click on save button
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]'] ")).click();
		

	}

}
