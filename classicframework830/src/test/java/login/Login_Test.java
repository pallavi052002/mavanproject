package login;

import org.testng.annotations.Test;

import genericUtility.BaseClass;

public class Login_Test extends BaseClass{
	@Test
	public void loginToDemo() {
		login.getLoginlink().click();
		login.getEmailtf().sendKeys("pallu@123");
		
	}

}
