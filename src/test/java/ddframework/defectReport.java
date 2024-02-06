package ddframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class defectReport {

	public static void main(String[] args) {
		String key="webdriver.gecko.driver";
		String value=".\\Drivers\\test-cases.xlsx ";
		
		System.setProperty(key,value);
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.localhost:8888");

	}

}
class pom{
	//declaration
@FindBy(xpath="//input[@name='user_name'] ")private WebElement untext;
@FindBy(xpath="//input[@name='user_password']")private WebElement pwdtext;
@FindBy(xpath="//input[@id='submitButton']")private WebElement logintext;

//initialization
public pom(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
//Implementation
public WebElement getUntext() {
	return untext;
}
public WebElement getPwdtext() {
	return pwdtext;
}
public WebElement getLogintext() {
	return logintext;
}

}
