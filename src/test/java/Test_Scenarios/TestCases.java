package Test_Scenarios;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.AngularSiteTesting;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases {
	
	WebDriver driver = new ChromeDriver();
	public static Logger logger;
	
	AngularSiteTesting obj= new AngularSiteTesting(driver);
		
	@BeforeTest
	public void befortest() {
		
		WebDriverManager.chromedriver().setup();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://juliemr.github.io/protractor-demo/");
		logger = Logger.getLogger("angularsite");
		PropertyConfigurator.configure("log4j.properties");
	
	}
	
	@Test
	public void EnterInput1() {
		
		logger.info("entering input1..");
		obj.enterInput1("10");
		logger.info("entered input1..");
		
	}
	
	@Test
	public void EnterInput2() {
		
		
		obj.enterInput2("20");
	}
	
	
	
	@AfterTest
	public void aftertest() {
		driver.quit();
		logger.info("Case Passed Sucessfully");
	}
	

}
