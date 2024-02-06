import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class opportunities {

	public static void main(String[] args) throws Throwable {
		FileInputStream	fis=new FileInputStream(opportunitiesHide.sts3);
		Workbook	wb=WorkbookFactory.create(fis);
		 Sheet sh=wb.getSheet("Sheet1");
		   String data3=sh.getRow(0).getCell(1).getStringCellValue();
		   System.out.println(data3);
		   
		   WebDriver driver=new EdgeDriver();
		   driver.get("http://localhost:8888/");
		   //enter valid UN and PW
		   driver.findElement(By.xpath("//input[@name='user_name'] ")).sendKeys("admin");
		   driver.findElement(By.xpath("//input[@name='user_password'] ")).sendKeys("admin");
		   //click login button
		   driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		//click on opportunities
		driver.findElement(By.xpath("//a[.='Opportunities']")).click();
		//click on create contact image(plus symbol)
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif'] ")).click();
		//enter organization name
		driver.findElement(By.xpath("//img[@alt='Select']")).sendKeys(data3);
		//click on save button
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]'] ")).click();

	}

}
