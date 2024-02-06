import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomfacebook {
public pomfacebook(WebElement driver) {
		
	}
//declaration
	@FindBy(xpath ="//input[@id='email']" )private WebElement fbun;
	@FindBy(xpath = " //input[@id='pass']")private WebElement fbpwd;
	@FindBy(xpath =" //button[@id='u_0_9_XY']")private WebElement loginbtn;
	
	//initialization
	public pomfacebook(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getFbun() {
		return fbun;
	}

	public WebElement getFbpwd() {
		return fbpwd;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
 
}
