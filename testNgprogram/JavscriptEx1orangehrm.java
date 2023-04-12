package testNgprogram;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class JavscriptEx1orangehrm extends SeleniumUtility{
  @Test
  public void testcase1() {
	  WebDriver driver=setUp("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	//identifying elements from the UI using JavaScript and typing required value in it
	  js.executeScript("document.getElementByname('username')value='Admin'");
	//identifying elements from the UI using JavaScript and typing required value in it
			js.executeScript("document.getElementsByName('password')[0].value='admin123'");
			
	  
  }
}
//username