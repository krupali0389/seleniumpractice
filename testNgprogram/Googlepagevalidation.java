package testNgprogram;

import org.testng.annotations.Test;

import utilities.SeleniumUtility;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Googlepagevalidation extends SeleniumUtility{
	 WebDriver driver;
	 
	 
	  @BeforeTest
	  public void startUP() {
		  driver=setUp("chrome","http://www.google.com/");
	  }
	  @Test
	  public void testGoogleandingPage() {
		  String ExpectedTitle="Google";
		  String ActualTitle=getCurrentTitleOfApplication();
		  Assert.assertEquals(ActualTitle, ExpectedTitle,"Google search page are open or its title are not open");
	  }
	  @Test
	  public void testSearch() {
			getActiveElementFromUI().sendKeys("SQL", Keys.ENTER);
			Assert.assertTrue(getCurrentTitleOfApplication().contains("SQL"), "SQL search is failed");
		}
	@AfterTest
		public void tearDown() {
		CleanUp();
	
  

 

	}
  
  }


