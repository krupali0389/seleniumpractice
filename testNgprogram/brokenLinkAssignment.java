package testNgprogram;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class brokenLinkAssignment extends SeleniumUtility {
	
	  @Test
  public void testlinks() {
		  setUp("chrome","https://demoqa.com/broken");
		  //store links in list
		  List<WebElement>link=driver.findElements(By.tagName("a"));
		  //this line print the no. of links count
		  System.out.println("links count :"+link.size());
		  //checking the link page
		  for(int i=0;i<link.size();i++) {
			  WebElement E1=link.get(i);
			  String Url=E1.getAttribute("href");
			  verifyLinks(Url);
		  }
		  
		driver.quit(); 
  }
}
