import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class datafromexcelsheet {

	public static void main(String[] args) throws Throwable, Throwable{
	FileInputStream	fis=new FileInputStream(excelhide.sts);
Workbook	wb=WorkbookFactory.create(fis);
 Sheet sh=wb.getSheet("Sheet1");
   String data=sh.getRow(0).getCell(3).getStringCellValue();
   System.out.println(data);

	}

}
