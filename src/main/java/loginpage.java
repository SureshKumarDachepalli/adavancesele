import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	//declaration
@FindBy(xpath="//input[@name='user_name'] ")private WebElement untext;
@FindBy(xpath="//input[@name='user_password']")private WebElement pwdtext;
@FindBy(xpath="//input[@id='submitButton']")private WebElement logintext;

//initialization
public loginpage(WebDriver driver) {
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
