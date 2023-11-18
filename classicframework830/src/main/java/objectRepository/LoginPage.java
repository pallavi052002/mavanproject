package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//public LoginPage(WebDriver driver) {
//	PageFactory.initElements( driver,this);
//	
//	}
public LoginPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	PageFactory.initElements(driver,this);

}
@FindBy(linkText ="Log in")
private WebElement loginlink;

@FindBy(id="Email")
private WebElement emailtf;

public WebElement getLoginlink() {
	return loginlink;
}

public WebElement getEmailtf() {
	return emailtf;
}

}
