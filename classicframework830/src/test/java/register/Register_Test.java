package register;

import org.testng.annotations.Test;

import genericUtility.BaseClass;

public class Register_Test extends BaseClass{
@Test
public void registerInDemo(){
	reg.getReglink().click();
	reg.getGender().click();
	reg.getFname().sendKeys("pallu");
	
}
}
