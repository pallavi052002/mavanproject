package genericUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/**
 * @author ADMIN
 */
public class Javascriptutility extends BaseClass{

	public void enteringDataIntoElement(WebElement element,String data) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='"+data+"'",element );
	}
	public void clickingOnTheElement(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",element );

	}
	public void scrollingThePag(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollBy()",element );

	}

}
