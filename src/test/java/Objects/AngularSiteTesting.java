package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.paulhammant.ngwebdriver.ByAngular;

public class AngularSiteTesting {
	
	WebDriver driver;
	
	public AngularSiteTesting(WebDriver driver) {
		 this.driver = driver;
	}
	
	//elements
	By input1 = ByAngular.model("first");
	By input2 = ByAngular.model("second");
	
	
	//methods
	public void enterInput1(String str1) {
		
		driver.findElement(input1).sendKeys(str1);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void enterInput2(String str2) {
		
		driver.findElement(input2).sendKeys(str2);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
