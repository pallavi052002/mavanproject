package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

public RegisterPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	PageFactory.initElements(driver, this);
}
@FindBy(linkText = "Register")
private WebElement reglink;

@FindBy(id="gender-female")
private WebElement gender;

@FindBy(id="FirstName")
private WebElement fname;

public WebElement getReglink() {
	return reglink;
}

public WebElement getGender() {
	return gender;
}

public WebElement getFname() {
	return fname;
}

}
