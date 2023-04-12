package testNgprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtilityold;

public class vtigertestcase extends SeleniumUtilityold {
  @Test
  public void create() {
	  System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
driver.findElement(By.id("username"));	
driver.findElement(By.id("password"));
driver.findElementByCssSelector("button[type='submit']").click();
driver.findElementByCssSelector("div[class='row app-navigator']").click();
driver.findElementByXPath("//div[@id='MARKETING_modules_dropdownMenu']/div").click();//marketing
driver.findElementByCssSelector("ul[class='dropdown-menu app-modules-dropdown mCustomScrollbar _mCS_1 mCS_no_scrollbar']>div>div>li>*:first-child").click();//click on campaign
driver.findElementByCssSelector("#Campaigns_listView_basicAction_LBL_ADD_RECORD").click();//add campaign
driver.findElementByCssSelector("#Campaigns_editView_fieldName_campaignname").sendKeys("Tester");//add name
driver.findElementByCssSelector("span[class='input-group-addon']").click();//click on date
driver.findElementByXPath("//div[@class='datepicker-days']/table//tr[3]//td[4]").click();//select date
driver.findElementByCssSelector("button[type='submit']").click();//click on save button
  }
  @Test(dependsOnMethods= {"create"})
  public void Edit() throws InterruptedException {
	  driver.findElement(By.cssSelector("#Campaigns_detailView_basicAction_LBL_EDIT")).click();//click on edit
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("#Campaigns_editView_fieldName_sponsor")).sendKeys("abcdef");//add sponser
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("button[type='submit']")).click();
  }
}
