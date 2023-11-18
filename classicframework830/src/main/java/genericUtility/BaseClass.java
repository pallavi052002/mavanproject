package genericUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;
import objectRepository.RegisterPage;

public class BaseClass {
	public static WebDriver driver;
	public Javascriptutility js;
	public LoginPage login;
	public RegisterPage reg;
	PropertyUtility ppt=new PropertyUtility();
	@BeforeClass
	public void launchingbrowser() throws IOException {
		if(ppt.readingDataFromPropertyFile("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(ppt.readingDataFromPropertyFile("browser").equalsIgnoreCase("firefox")) {
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
		}else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(ppt.readingDataFromPropertyFile("url"));
	}
	@BeforeMethod
	public void loadingObject() {
		js=new Javascriptutility();
		login=new LoginPage(driver);//pom objects
		reg=new RegisterPage(driver);
	}
	@AfterClass
	public void closingBrowser() {
		driver.quit();
	}
}
