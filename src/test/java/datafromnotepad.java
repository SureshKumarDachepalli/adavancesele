import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import ddframework.note;


public class datafromnotepad {

	public static void main(String[] args) throws Throwable {
	FileInputStream	fis=new FileInputStream(note.s);
     Properties p =new Properties();
     p.load(fis);
    String ss=p.getProperty("un");
    System.out.println(ss);
				   String tt=p.getProperty("pwd");
				   System.out.println(tt);
		  String uu=p.getProperty("browser");
		  System.out.println(uu);
					 String URL=p.getProperty("url");
					 System.out.println(URL);
WebDriver driver=new EdgeDriver();
driver.get(URL);
 
     
	}

}
